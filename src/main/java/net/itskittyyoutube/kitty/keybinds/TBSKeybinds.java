package net.itskittyyoutube.kitty.keybinds;

import com.mojang.blaze3d.platform.InputConstants;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class TBSKeybinds {

    public static KeyMapping GM_SURVIVAL;
    public static KeyMapping GM_CREATIVE;
    public static KeyMapping GM_ADVENTURE;
    public static KeyMapping GM_SPECTATOR;
    public static KeyMapping SPAWN_TNT;
    public static KeyMapping SUMMON_LIGHTNING;
    public static KeyMapping ANGEL_DEATH_SWORD;
    public static KeyMapping CLEAR_INVENTORY;
    public static KeyMapping KILL_EVERYTHING;
    public static KeyMapping KILL_ALL_ITEMS;
    public static KeyMapping DIF_PEACEFUL;
    public static KeyMapping DIF_EASY;
    public static KeyMapping DIF_NORMAL;
    public static KeyMapping DIF_HARD;

    public static void register() {

        GM_SURVIVAL = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.gm_survival",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_F6,
                        TBSKeybindCategories.TBS
                )
        );

        GM_CREATIVE = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.gm_creative",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_F7,
                        TBSKeybindCategories.TBS
                )
        );

        GM_ADVENTURE = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.gm_adventure",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_F8,
                        TBSKeybindCategories.TBS
                )
        );

        GM_SPECTATOR = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.gm_spectator",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_F9,
                        TBSKeybindCategories.TBS
                )
        );

        SPAWN_TNT = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.spawn_tnt",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        SUMMON_LIGHTNING = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.summon_lightning",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        CLEAR_INVENTORY = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.clear_inventory",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        KILL_EVERYTHING = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.kill_everything",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        KILL_ALL_ITEMS = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.kill_all_items",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        DIF_PEACEFUL = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.dif_peaceful",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        DIF_EASY = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.dif_easy",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        DIF_NORMAL = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.dif_normal",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );

        DIF_HARD = KeyMappingHelper.registerKeyMapping(
                new KeyMapping(
                        "key.kitty.dif_hard",
                        InputConstants.Type.KEYSYM,
                        GLFW.GLFW_KEY_UNKNOWN,
                        TBSKeybindCategories.TBS
                )
        );
    }
}