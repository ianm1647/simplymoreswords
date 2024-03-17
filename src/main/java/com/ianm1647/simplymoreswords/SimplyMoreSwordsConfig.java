package com.ianm1647.simplymoreswords;

import com.ianm1647.simplymoreswords.compat.mythicupgrades.MythicConfig;
import com.ianm1647.simplymoreswords.config.BaseConfig;
import draylar.omegaconfig.OmegaConfig;
import net.fabricmc.api.ModInitializer;

public class SimplyMoreSwordsConfig implements ModInitializer {

    public static BaseConfig CONFIG = OmegaConfig.register(BaseConfig.class);
    public static MythicConfig MYTHIC = OmegaConfig.register(MythicConfig.class);

    @Override
    public void onInitialize() {

    }
}
