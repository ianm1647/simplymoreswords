package com.ianm1647.simplymoreswords;

import com.ianm1647.simplymoreswords.compat.mythicupgrades.MythicRegistry;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplyMoreSwords implements ModInitializer {

	public static final String MODID = "simplymoreswords";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "group"));

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.literal("Simply More Swords"))
				.icon(() -> new ItemStack(Items.NETHERITE_SWORD))
				.build());

		if (FabricLoader.getInstance().isModLoaded("mythicupgrades")) {
			MythicRegistry.bootstrap();
		}

	}
}