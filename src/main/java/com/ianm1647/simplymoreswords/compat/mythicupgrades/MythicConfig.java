package com.ianm1647.simplymoreswords.compat.mythicupgrades;

import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;

public class MythicConfig implements Config {
    @Comment("Sapphire Percent Damage")
    public int sapphire_damage_percent = 5;

    @Comment("Material Modifications")
    public int ametrine_damage = 4;
    public int aquamarine_damage = 4;
    public int jade_damage = 4;
    public int ruby_damage = 4;
    public int sapphire_damage = 4;
    public float topaz_damage = 4.5f;

    @Override
    public String getName() {
        return "mythicupgrades";
    }

    @Override
    public String getDirectory() {
        return "simplyswordsplus";
    }
}
