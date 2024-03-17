package com.ianm1647.simplymoreswords.compat;


import com.ianm1647.simplymoreswords.SimplyMoreSwordsConfig;
import dev.architectury.registry.registries.RegistrySupplier;
import java.util.HashMap;

import net.minecraft.item.Item;

public class CompatHelper {
    private static final HashMap<String, Integer> DAMAGE_MODS = new HashMap();
    private static final HashMap<String, Float> ATTACK_SPEED_MODS = new HashMap();

    public CompatHelper() {
    }

    public static int getDamageMod(String weaponType) {
        return (Integer)DAMAGE_MODS.get(weaponType);
    }

    public static float getAttackSpeedMod(String weaponType) {
        return (Float)ATTACK_SPEED_MODS.get(weaponType);
    }

    public RegistrySupplier<Item> addCompat() {
        return null;
    }

    public static void build() {
    }

    static {
        DAMAGE_MODS.put("longsword", (int)(SimplyMoreSwordsConfig.CONFIG.longsword_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.longsword_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("longsword", SimplyMoreSwordsConfig.CONFIG.longsword_attackSpeed);
        DAMAGE_MODS.put("twinblade", (int)(SimplyMoreSwordsConfig.CONFIG.twinblade_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.twinblade_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("twinblade", SimplyMoreSwordsConfig.CONFIG.twinblade_attackSpeed);
        DAMAGE_MODS.put("rapier", (int)(SimplyMoreSwordsConfig.CONFIG.rapier_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.rapier_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("rapier", SimplyMoreSwordsConfig.CONFIG.rapier_attackSpeed);
        DAMAGE_MODS.put("katana", (int)(SimplyMoreSwordsConfig.CONFIG.katana_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.katana_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("katana", SimplyMoreSwordsConfig.CONFIG.katana_attackSpeed);
        DAMAGE_MODS.put("sai", (int)(SimplyMoreSwordsConfig.CONFIG.sai_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.sai_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("sai", SimplyMoreSwordsConfig.CONFIG.sai_attackSpeed);
        DAMAGE_MODS.put("spear", (int)(SimplyMoreSwordsConfig.CONFIG.spear_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.spear_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("spear", SimplyMoreSwordsConfig.CONFIG.spear_attackSpeed);
        DAMAGE_MODS.put("glaive", (int)(SimplyMoreSwordsConfig.CONFIG.glaive_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.glaive_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("glaive", SimplyMoreSwordsConfig.CONFIG.glaive_attackSpeed);
        DAMAGE_MODS.put("warglaive", (int)(SimplyMoreSwordsConfig.CONFIG.warglaive_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.warglaive_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("warglaive", SimplyMoreSwordsConfig.CONFIG.warglaive_attackSpeed);
        DAMAGE_MODS.put("cutlass", (int)(SimplyMoreSwordsConfig.CONFIG.cutlass_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.cutlass_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("cutlass", SimplyMoreSwordsConfig.CONFIG.cutlass_attackSpeed);
        DAMAGE_MODS.put("claymore", (int)(SimplyMoreSwordsConfig.CONFIG.claymore_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.claymore_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("claymore", SimplyMoreSwordsConfig.CONFIG.claymore_attackSpeed);
        DAMAGE_MODS.put("greathammer", (int)(SimplyMoreSwordsConfig.CONFIG.greathammer_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.greathammer_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("greathammer", SimplyMoreSwordsConfig.CONFIG.greathammer_attackSpeed);
        DAMAGE_MODS.put("greataxe", (int)(SimplyMoreSwordsConfig.CONFIG.greataxe_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.greataxe_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("greataxe", SimplyMoreSwordsConfig.CONFIG.greataxe_attackSpeed);
        DAMAGE_MODS.put("chakram", (int)(SimplyMoreSwordsConfig.CONFIG.chakram_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.chakram_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("chakram", SimplyMoreSwordsConfig.CONFIG.chakram_attackSpeed);
        DAMAGE_MODS.put("scythe", (int)(SimplyMoreSwordsConfig.CONFIG.scythe_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.scythe_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("scythe", SimplyMoreSwordsConfig.CONFIG.scythe_attackSpeed);
        DAMAGE_MODS.put("halberd", (int)(SimplyMoreSwordsConfig.CONFIG.halberd_positiveDamageModifier - SimplyMoreSwordsConfig.CONFIG.halberd_negativeDamageModifier));
        ATTACK_SPEED_MODS.put("halberd", SimplyMoreSwordsConfig.CONFIG.halberd_attackSpeed);
    }
}
