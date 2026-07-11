package net.itskittyyoutube.kitty.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.itskittyyoutube.kitty.command.permissions.TBSPermissions;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameType;

import java.util.LinkedHashMap;
import java.util.Map;

public class TBSGMCommand {

    private static final Map<String, GameType> MODES = new LinkedHashMap<>();

    static {
        MODES.put("0", GameType.SURVIVAL);
        MODES.put("1", GameType.CREATIVE);
        MODES.put("2", GameType.ADVENTURE);
        MODES.put("3", GameType.SPECTATOR);
    }

    public static void register(CommandDispatcher<net.minecraft.commands.CommandSourceStack> dispatcher) {

        dispatcher.register(Commands.literal("gm")
                .requires(src -> src.permissions().hasPermission(TBSPermissions.COMMANDS_GAMEMASTER))

                .then(Commands.argument("mode", StringArgumentType.word())
                        .suggests((ctx, builder) -> {
                            builder.suggest("0");
                            builder.suggest("1");
                            builder.suggest("2");
                            builder.suggest("3");
                            return builder.buildFuture();
                        })

                        // /gm <mode>
                        .executes(ctx -> {
                            var source = ctx.getSource();
                            GameType mode = MODES.get(StringArgumentType.getString(ctx, "mode"));

                            if (mode == null) {
                                source.sendFailure(Component.literal(
                                        "Invalid mode! Use: 0 (survival), 1 (creative), 2 (adventure), 3 (spectator)"
                                ));
                                return 0;
                            }

                            ServerPlayer player = source.getPlayer();
                            if (player == null) return 0;

                            player.setGameMode(mode);

                            source.sendSuccess(() ->
                                            Component.literal("Set own game mode to " + mode.getName()),
                                    false
                            );

                            return 1;
                        })

                        // /gm <mode> <player>
                        .then(Commands.argument("player", EntityArgument.player())
                                .executes(ctx -> {
                                    var source = ctx.getSource();
                                    GameType mode = MODES.get(StringArgumentType.getString(ctx, "mode"));

                                    if (mode == null) {
                                        source.sendFailure(Component.literal(
                                                "Invalid mode! Use: 0 (survival), 1 (creative), 2 (adventure), 3 (spectator)"
                                        ));
                                        return 0;
                                    }

                                    ServerPlayer target =
                                            EntityArgument.getPlayer(ctx, "player");

                                    target.setGameMode(mode);

                                    source.sendSuccess(() ->
                                                    Component.literal("Set " + target.getName().getString()
                                                            + "'s game mode to " + mode.getName()),
                                            true
                                    );

                                    return 1;
                                })
                        )

                        // /gm <mode> <targets>
                        .then(Commands.argument("targets", EntityArgument.players())
                                .executes(ctx -> {
                                    var source = ctx.getSource();
                                    GameType mode = MODES.get(StringArgumentType.getString(ctx, "mode"));

                                    if (mode == null) {
                                        source.sendFailure(Component.literal(
                                                "Invalid mode! Use: 0 (survival), 1 (creative), 2 (adventure), 3 (spectator)"
                                        ));
                                        return 0;
                                    }

                                    var players = EntityArgument.getPlayers(ctx, "targets");

                                    int changed = 0;

                                    for (ServerPlayer player : players) {
                                        player.setGameMode(mode);
                                        changed++;
                                    }

                                    if (changed == 0) {
                                        source.sendFailure(Component.literal("No players matched selector"));
                                        return 0;
                                    }

                                    final int finalChanged = changed;
                                    final GameType finalMode = mode;

                                    source.sendSuccess(() ->
                                                    Component.literal("Set game mode for " + finalChanged
                                                            + " player(s) to " + finalMode.getName()),
                                            true
                                    );

                                    return 1;
                                })
                        )
                )
        );
    }
}