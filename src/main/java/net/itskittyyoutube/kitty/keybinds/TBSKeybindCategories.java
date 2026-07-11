package net.itskittyyoutube.kitty.keybinds;

import net.minecraft.client.KeyMapping;
import net.minecraft.resources.Identifier;

public class TBSKeybindCategories {

    public static KeyMapping.Category TBS;

    public static void register() {
        TBS = KeyMapping.Category.register(
                Identifier.fromNamespaceAndPath(net.itskittyyoutube.kitty.TBS.MOD_ID, "tbs")
        );
    }
}