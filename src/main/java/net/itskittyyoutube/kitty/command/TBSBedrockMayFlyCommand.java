package net.itskittyyoutube.kitty.command;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import net.itskittyyoutube.kitty.command.permissions.TBSPermissions;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.GameType;

import java.util.Collection;

public class TBSBedrockMayFlyCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {

        dispatcher.register(Commands.literal("ability")
                .requires(src -> src.permissions().hasPermission(TBSPermissions.NOCOMMANDS_MEMBER))

                .then(Commands.argument("targets", EntityArgument.players())

                        .then(Commands.literal("mayfly")

                                .then(Commands.argument("state", BoolArgumentType.bool())
                                        .executes(ctx -> {

                                            Collection<ServerPlayer> players =
                                                    EntityArgument.getPlayers(ctx, "targets");

                                            boolean enabled =
                                                    BoolArgumentType.getBool(ctx, "state");

                                            int changed = 0;

                                            for (ServerPlayer player : players) {

                                                if (player.gameMode.getGameModeForPlayer() == GameType.SPECTATOR) {
                                                    ctx.getSource().sendFailure(Component.literal(
                                                            "Cannot modify flight in this game mode."
                                                    ));
                                                    continue;
                                                }

                                                var abilities = player.getAbilities();

                                                abilities.mayfly = enabled;

                                                if (!enabled) {
                                                    abilities.flying = false;
                                                }

                                                player.onUpdateAbilities();
                                                changed++;
                                            }

                                            final int finalChanged = changed;

                                            ctx.getSource().sendSuccess(() ->
                                                            Component.literal("Mayfly " +
                                                                    (enabled ? "enabled for " : "disabled for ") +
                                                                    finalChanged + " player(s)"),
                                                    true
                                            );

                                            return changed > 0 ? 1 : 0;
                                        })
                                )
                        )
                )
        );
    }
}