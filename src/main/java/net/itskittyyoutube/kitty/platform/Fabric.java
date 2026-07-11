package net.itskittyyoutube.kitty.platform;

import net.fabricmc.api.ModInitializer;
import net.itskittyyoutube.kitty.config.TBSCompat;
import net.itskittyyoutube.kitty.config.TBSConfigs;

public class Fabric implements ModInitializer {

    @Override
    public void onInitialize() {
        if (TBSCompat.isClothConfigLoaded()) TBSConfigs.load();
    }
}
