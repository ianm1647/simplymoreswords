package com.ianm1647.simplymoreswords.compat.mythicupgrades;

import com.ianm1647.simplymoreswords.SimplyMoreSwords;
import com.ianm1647.simplymoreswords.SimplyMoreSwordsConfig;
import com.ianm1647.simplymoreswords.compat.CompatHelper;
import com.ianm1647.simplymoreswords.compat.ToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.trique.mythicupgrades.MythicUpgrades;
import net.trique.mythicupgrades.effect.MUEffects;
import net.trique.mythicupgrades.item.MythicEffectsSwordItem;
import net.trique.mythicupgrades.item.SapphireSwordItem;
import net.trique.mythicupgrades.util.ItemEffectsList;
import net.trique.mythicupgrades.util.ItemEffectsListBuilder;

import java.util.Locale;

public class MythicRegistry {

    public static void bootstrap() {
        Items.bootstrap();
    }

    private static class Items {

        private static final ItemEffectsList levitationSwordItemEffects = (new ItemEffectsListBuilder()).addForHit(StatusEffects.LEVITATION, (int)(MythicUpgrades.CONFIG.ametrineConfig.sword_levitation_duration() * 20.0F), MythicUpgrades.CONFIG.ametrineConfig.sword_levitation_amplifier()).build();
        private static final ItemEffectsList freezeSwordItemEffects = (new ItemEffectsListBuilder()).addForHit(MUEffects.FREEZE, (int)(MythicUpgrades.CONFIG.aquamarineConfig.sword_freeze_duration() * 20.0F), 0).build();;
        private static final ItemEffectsList poisonSwordItemEffects = (new ItemEffectsListBuilder()).addForHit(StatusEffects.POISON, (int)(MythicUpgrades.CONFIG.jadeConfig.sword_poison_duration() * 20.0F), MythicUpgrades.CONFIG.jadeConfig.sword_poison_amplifier()).build();
        private static final ItemEffectsList hasteSwordItemEffects = (new ItemEffectsListBuilder()).addForMainHand(StatusEffects.HASTE, -1, MythicUpgrades.CONFIG.rubyConfig.haste_sword_amplifier()).build();


        static {
            registerAmetrine("cutlass");
            registerAmetrine("chakram");
            registerAmetrine("claymore");
            registerAmetrine("glaive");
            registerAmetrine("greataxe");
            registerAmetrine("greathammer");
            registerAmetrine("halberd");
            registerAmetrine("katana");
            registerAmetrine("longsword");
            registerAmetrine("rapier");
            registerAmetrine("sai");
            registerAmetrine("scythe");
            registerAmetrine("spear");
            registerAmetrine("twinblade");
            registerAmetrine("warglaive");

            registerAquamarine("cutlass");
            registerAquamarine("chakram");
            registerAquamarine("claymore");
            registerAquamarine("glaive");
            registerAquamarine("greataxe");
            registerAquamarine("greathammer");
            registerAquamarine("halberd");
            registerAquamarine("katana");
            registerAquamarine("longsword");
            registerAquamarine("rapier");
            registerAquamarine("sai");
            registerAquamarine("scythe");
            registerAquamarine("spear");
            registerAquamarine("twinblade");
            registerAquamarine("warglaive");

            registerJade("cutlass");
            registerJade("chakram");
            registerJade("claymore");
            registerJade("glaive");
            registerJade("greataxe");
            registerJade("greathammer");
            registerJade("halberd");
            registerJade("katana");
            registerJade("longsword");
            registerJade("rapier");
            registerJade("sai");
            registerJade("scythe");
            registerJade("spear");
            registerJade("twinblade");
            registerJade("warglaive");

            registerRuby("cutlass");
            registerRuby("chakram");
            registerRuby("claymore");
            registerRuby("glaive");
            registerRuby("greataxe");
            registerRuby("greathammer");
            registerRuby("halberd");
            registerRuby("katana");
            registerRuby("longsword");
            registerRuby("rapier");
            registerRuby("sai");
            registerRuby("scythe");
            registerRuby("spear");
            registerRuby("twinblade");
            registerRuby("warglaive");

            registerSapphire("cutlass");
            registerSapphire("chakram");
            registerSapphire("claymore");
            registerSapphire("glaive");
            registerSapphire("greataxe");
            registerSapphire("greathammer");
            registerSapphire("halberd");
            registerSapphire("katana");
            registerSapphire("longsword");
            registerSapphire("rapier");
            registerSapphire("sai");
            registerSapphire("scythe");
            registerSapphire("spear");
            registerSapphire("twinblade");
            registerSapphire("warglaive");

            registerTopaz("cutlass");
            registerTopaz("chakram");
            registerTopaz("claymore");
            registerTopaz("glaive");
            registerTopaz("greataxe");
            registerTopaz("greathammer");
            registerTopaz("halberd");
            registerTopaz("katana");
            registerTopaz("longsword");
            registerTopaz("rapier");
            registerTopaz("sai");
            registerTopaz("scythe");
            registerTopaz("spear");
            registerTopaz("twinblade");
            registerTopaz("warglaive");
        }
        public static void bootstrap () {}

        private static Item registerAmetrine(String id) {
            ToolMaterial material = ToolMaterials.AMETRINE;
            Item item = Registry.register(Registries.ITEM, new Identifier(SimplyMoreSwords.MODID, "mythicupgrades/" + material.toString().toLowerCase(Locale.ROOT) + "/" + id),
                    new MythicEffectsSwordItem(material, SimplyMoreSwordsConfig.MYTHIC.ametrine_damage + CompatHelper.getDamageMod(id), CompatHelper.getAttackSpeedMod(id), new FabricItemSettings().fireproof(), levitationSwordItemEffects, material.toString().toLowerCase(Locale.ROOT) + "_sword.description", Formatting.LIGHT_PURPLE));
            ItemGroupEvents.modifyEntriesEvent(SimplyMoreSwords.GROUP).register(entries -> entries.add(item));
            return item;
        }

        private static Item registerAquamarine(String id) {
            ToolMaterial material = ToolMaterials.AQUAMARINE;
            Item item = Registry.register(Registries.ITEM, new Identifier(SimplyMoreSwords.MODID, "mythicupgrades/" + material.toString().toLowerCase(Locale.ROOT) + "/" + id),
                    new MythicEffectsSwordItem(material, SimplyMoreSwordsConfig.MYTHIC.aquamarine_damage + CompatHelper.getDamageMod(id), CompatHelper.getAttackSpeedMod(id), new FabricItemSettings().fireproof(), freezeSwordItemEffects, material.toString().toLowerCase(Locale.ROOT) + "_axe.description", Formatting.AQUA));
            ItemGroupEvents.modifyEntriesEvent(SimplyMoreSwords.GROUP).register(entries -> entries.add(item));
            return item;
        }

        private static Item registerJade(String id) {
            ToolMaterial material = ToolMaterials.JADE;
            Item item = Registry.register(Registries.ITEM, new Identifier(SimplyMoreSwords.MODID, "mythicupgrades/" + material.toString().toLowerCase(Locale.ROOT) + "/" + id),
                    new MythicEffectsSwordItem(material, SimplyMoreSwordsConfig.MYTHIC.jade_damage + CompatHelper.getDamageMod(id), CompatHelper.getAttackSpeedMod(id), new FabricItemSettings().fireproof(), poisonSwordItemEffects, material.toString().toLowerCase(Locale.ROOT) + "_sword.description", Formatting.GREEN));
            ItemGroupEvents.modifyEntriesEvent(SimplyMoreSwords.GROUP).register(entries -> entries.add(item));
            return item;
        }

        private static Item registerRuby(String id) {
            ToolMaterial material = ToolMaterials.RUBY;
            Item item = Registry.register(Registries.ITEM, new Identifier(SimplyMoreSwords.MODID, "mythicupgrades/" + material.toString().toLowerCase(Locale.ROOT) + "/" + id),
                    new MythicEffectsSwordItem(material, SimplyMoreSwordsConfig.MYTHIC.ruby_damage + CompatHelper.getDamageMod(id), CompatHelper.getAttackSpeedMod(id), new FabricItemSettings().fireproof(), hasteSwordItemEffects, material.toString().toLowerCase(Locale.ROOT) + "_sword.description", Formatting.RED));
            ItemGroupEvents.modifyEntriesEvent(SimplyMoreSwords.GROUP).register(entries -> entries.add(item));
            return item;
        }

        private static Item registerSapphire(String id) {
            ToolMaterial material = ToolMaterials.SAPPHIRE;
            Item item = Registry.register(Registries.ITEM, new Identifier(SimplyMoreSwords.MODID, "mythicupgrades/" + material.toString().toLowerCase(Locale.ROOT) + "/" + id),
                    new SapphireSwordItem(SimplyMoreSwordsConfig.MYTHIC.sapphire_damage + CompatHelper.getDamageMod(id), SimplyMoreSwordsConfig.MYTHIC.sapphire_damage_percent, CompatHelper.getAttackSpeedMod(id), new FabricItemSettings().fireproof(), new ItemEffectsList(), material.toString().toLowerCase(Locale.ROOT) + "_sword.description", Formatting.BLUE));
            ItemGroupEvents.modifyEntriesEvent(SimplyMoreSwords.GROUP).register(entries -> entries.add(item));
            return item;
        }

        private static Item registerTopaz(String id) {
            ToolMaterial material = ToolMaterials.TOPAZ;
            Item item = Registry.register(Registries.ITEM, new Identifier(SimplyMoreSwords.MODID, "mythicupgrades/" + material.toString().toLowerCase(Locale.ROOT) + "/" + id),
                    new SwordItem(material, (int) (SimplyMoreSwordsConfig.MYTHIC.topaz_damage + CompatHelper.getDamageMod(id)), CompatHelper.getAttackSpeedMod(id), new FabricItemSettings().fireproof()));
            ItemGroupEvents.modifyEntriesEvent(SimplyMoreSwords.GROUP).register(entries -> entries.add(item));
            return item;
        }
    }

}
