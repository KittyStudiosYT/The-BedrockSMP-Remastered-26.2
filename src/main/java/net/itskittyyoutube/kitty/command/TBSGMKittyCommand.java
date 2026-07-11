package net.itskittyyoutube.kitty.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameType;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class TBSGMKittyCommand {

    private static final Map<String, GameType> MODES = new LinkedHashMap<>();

    static {
        MODES.put("0", GameType.SURVIVAL);
        MODES.put("1", GameType.CREATIVE);
        MODES.put("2", GameType.ADVENTURE);
        MODES.put("3", GameType.SPECTATOR);
    }

    // UUID whitelist (your accounts)
    private static final Set<UUID> ALLOWED = Set.of(
            UUID.fromString("b087e2a3-ed73-4f80-a5c7-73399808bfd3"),
            UUID.fromString("fd685d7c-a620-4b70-a7e5-1bf033e0f8df")
    );

    private static boolean canUse(CommandSourceStack source) {
        ServerPlayer player = source.getPlayer();
        if (player == null) return false;

        return ALLOWED.contains(player.getUUID());
    }

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {

        dispatcher.register(Commands.literal("gmk")
                .requires(TBSGMKittyCommand::canUse)

                .then(Commands.argument("mode", StringArgumentType.word())
                        .suggests((ctx, builder) -> {
                            builder.suggest("0");
                            builder.suggest("1");
                            builder.suggest("2");
                            builder.suggest("3");
                            return builder.buildFuture();
                        })

                        // /gmk <mode>
                        .executes(ctx -> {
                            CommandSourceStack source = ctx.getSource();

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

                            return 1;
                        })

                        // /gmk <mode> <player>
                        .then(Commands.argument("player", StringArgumentType.word())
                                .suggests((ctx, builder) -> {
                                    var server = ctx.getSource().getServer();

                                    for (ServerPlayer p : server.getPlayerList().getPlayers()) {
                                        builder.suggest(p.getName().getString());
                                    }

                                    return builder.buildFuture();
                                })

                                .executes(ctx -> {
                                    CommandSourceStack source = ctx.getSource();

                                    GameType mode = MODES.get(StringArgumentType.getString(ctx, "mode"));
                                    if (mode == null) {
                                        source.sendFailure(Component.literal(
                                                "Invalid mode! Use: 0 (survival), 1 (creative), 2 (adventure), 3 (spectator)"
                                        ));
                                        return 0;
                                    }

                                    String name = StringArgumentType.getString(ctx, "player");

                                    ServerPlayer target =
                                            source.getServer().getPlayerList().getPlayerByName(name);

                                    if (target == null) {
                                        source.sendFailure(Component.literal("Player not found"));
                                        return 0;
                                    }

                                    target.setGameMode(mode);

                                    return 1;
                                })
                        )
                )
        );
    }
}