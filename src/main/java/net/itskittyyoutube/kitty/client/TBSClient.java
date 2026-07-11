package net.itskittyyoutube.kitty.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.itskittyyoutube.kitty.TBS;
import net.itskittyyoutube.kitty.config.TBSConfigs;
import net.itskittyyoutube.kitty.keybinds.TBSKeybindCategories;
import net.itskittyyoutube.kitty.keybinds.TBSKeybinds;
import net.itskittyyoutube.kitty.util.TBSBuiltinResourcePack;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;

public final class TBSClient implements ClientModInitializer {
    public static final String PACK_ID = "small_axolotl_buckets";
    public static final String PACK_ID1 = "spooky_season";
    public static final String PACK_ID2 = "old_redwood";
    public static final String PACK_ID3 = "halloween_icons";
    public static final String PACK_ID4 = "spoopy_season";
    public static final String PACK_ID5 = "halloween_foliage";
    public static final String PACK_ID6 = "old_dye";
    public static final String PACK_ID7 = "bedrocksmp_look";
    public static final String PACK_ID8 = "bedrocksmp_icons";

    @Override
    public void onInitializeClient() {
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID,
                Component.translatable("pack.kitty.small_axolotl_buckets")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID1,
                Component.translatable("pack.kitty.spooky_season")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID2,
                Component.translatable("pack.kitty.old_redwood")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID3,
                Component.translatable("pack.kitty.halloween_icons")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID4,
                Component.translatable("pack.kitty.spoopy_season")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID5,
                Component.translatable("pack.kitty.halloween_foliage")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID6,
                Component.translatable("pack.kitty.old_dye")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID7,
                Component.translatable("pack.kitty.bedrocksmp_look")
        );
        TBSBuiltinResourcePack.register(
                TBS.MOD_ID,
                PACK_ID8,
                Component.translatable("pack.kitty.bedrocksmp_icons")
        );

        TBSConfigs.load();

        // IMPORTANT: category first
        TBSKeybindCategories.register();
        TBSKeybinds.register();

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;

            var p = client.player;

            while (TBSKeybinds.GM_SURVIVAL.consumeClick()) run(p, "gamemode survival");
            while (TBSKeybinds.GM_CREATIVE.consumeClick()) run(p, "gamemode creative");
            while (TBSKeybinds.GM_ADVENTURE.consumeClick()) run(p, "gamemode adventure");
            while (TBSKeybinds.GM_SPECTATOR.consumeClick()) run(p, "gamemode spectator");

            while (TBSKeybinds.SPAWN_TNT.consumeClick()) run(p, "summon tnt");
            while (TBSKeybinds.SUMMON_LIGHTNING.consumeClick()) run(p, "summon lightning_bolt");

            while (TBSKeybinds.CLEAR_INVENTORY.consumeClick()) run(p, "clear @s");

            while (TBSKeybinds.KILL_EVERYTHING.consumeClick()) run(p, "kill @e[type=!player]");
            while (TBSKeybinds.KILL_ALL_ITEMS.consumeClick()) run(p, "kill @e[type=item]");

            while (TBSKeybinds.DIF_PEACEFUL.consumeClick()) run(p, "difficulty peaceful");
            while (TBSKeybinds.DIF_EASY.consumeClick()) run(p, "difficulty easy");
            while (TBSKeybinds.DIF_NORMAL.consumeClick()) run(p, "difficulty normal");
            while (TBSKeybinds.DIF_HARD.consumeClick()) run(p, "difficulty hard");
        });
    }

    private void run(LocalPlayer player, String command) {
        player.connection.sendCommand(command);
    }
}
