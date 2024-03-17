package com.ianm1647.simplymoreswords.config;

import draylar.omegaconfig.api.Comment;
import draylar.omegaconfig.api.Config;

public class BaseConfig implements Config {

    @Comment("Positive Damage Modifier")
    public float longsword_positiveDamageModifier = 0.0F;
    public float twinblade_positiveDamageModifier = 0.0F;
    public float rapier_positiveDamageModifier = 0.0F;
    public float katana_positiveDamageModifier = 0.0F;
    public float sai_positiveDamageModifier = 0.0F;
    public float spear_positiveDamageModifier = 0.0F;
    public float glaive_positiveDamageModifier = 0.0F;
    public float warglaive_positiveDamageModifier = 0.0F;
    public float cutlass_positiveDamageModifier = 0.0F;
    public float claymore_positiveDamageModifier = 2.0F;
    public float greataxe_positiveDamageModifier = 3.0F;
    public float greathammer_positiveDamageModifier = 4.0F;
    public float chakram_positiveDamageModifier = 0.0F;
    public float scythe_positiveDamageModifier = 1.0F;
    public float halberd_positiveDamageModifier = 3.0F;

    @Comment("Negative Damage Modifier")
    public float longsword_negativeDamageModifier = 0.0F;
    public float twinblade_negativeDamageModifier = 0.0F;
    public float rapier_negativeDamageModifier = 1.0F;
    public float katana_negativeDamageModifier = 0.0F;
    public float sai_negativeDamageModifier = 3.0F;
    public float spear_negativeDamageModifier = 0.0F;
    public float glaive_negativeDamageModifier = 0.0F;
    public float warglaive_negativeDamageModifier = 0.0F;
    public float cutlass_negativeDamageModifier = 0.0F;
    public float claymore_negativeDamageModifier = 0.0F;
    public float greataxe_negativeDamageModifier = 0.0F;
    public float greathammer_negativeDamageModifier = 0.0F;
    public float chakram_negativeDamageModifier = 1.0F;
    public float scythe_negativeDamageModifier = 0.0F;
    public float halberd_negativeDamageModifier = 0.0F;

    @Comment("Attack Speed")
    public float longsword_attackSpeed = -2.4F;
    public float twinblade_attackSpeed = -2.0F;
    public float rapier_attackSpeed = -1.8F;
    public float katana_attackSpeed = -2.0F;
    public float sai_attackSpeed = -1.5F;
    public float spear_attackSpeed = -2.7F;
    public float glaive_attackSpeed = -2.6F;
    public float warglaive_attackSpeed = -2.2F;
    public float cutlass_attackSpeed = -2.0F;
    public float claymore_attackSpeed = -2.8F;
    public float greataxe_attackSpeed = -3.1F;
    public float greathammer_attackSpeed = -3.2F;
    public float chakram_attackSpeed = -3.0F;
    public float scythe_attackSpeed = -2.7F;
    public float halberd_attackSpeed = -2.8F;

    @Override
    public String getName() {
        return "config";
    }

    @Override
    public String getDirectory() {
        return "simplyswordsplus";
    }
}
