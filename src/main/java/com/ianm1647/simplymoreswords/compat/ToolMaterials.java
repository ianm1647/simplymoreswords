package com.ianm1647.simplymoreswords.compat;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public enum ToolMaterials implements ToolMaterial {
    JADE(4, 2106, 9.0F, 4.0F, 18, "mythicupgrades:jade_ingot"),
    TOPAZ(4, 6318, 10.0F, 4.5F, 18, "mythicupgrades:topaz_ingot"),
    AQUAMARINE(4, 2106, 9.0F, 4.0F, 18, "mythicupgrades:aquamarine_ingot"),
    SAPPHIRE(4, 2106, 9.0F, 4.0F, 18, "mythicupgrades:sapphire_ingot"),
    RUBY(4, 2106, 12.0F, 4.0F, 18, "mythicupgrades:ruby_ingot"),
    AMETRINE(4, 2106, 9.0F, 4.0F, 18, "mythicupgrades:ametrine_ingot");

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final String repairIngredient;

    private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, String repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Registries.ITEM.get(new Identifier(this.repairIngredient)));
    }
}
