package net.itskittyyoutube.kitty.platform;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.itskittyyoutube.kitty.config.TBSConfigs;

public class ModMenu implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return TBSConfigs::getConfigScreen;
    }
}
