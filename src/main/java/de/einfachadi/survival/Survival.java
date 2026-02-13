package de.einfachadi.survival;

import de.einfachadi.survival.Item.ModItemGroups;
import de.einfachadi.survival.Item.ModItems;
import de.einfachadi.survival.block.ModBlocks;
import de.einfachadi.survival.component.ModDataComponentTypes;
import de.einfachadi.survival.enchantment.ModEnchantmentEffects;
import de.einfachadi.survival.enchantment.ModEnchantments;
import de.einfachadi.survival.util.HammerUsageEvent;
import de.einfachadi.survival.villager.ModVillagers;
import de.einfachadi.survival.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Survival implements ModInitializer {
	public static final String MOD_ID = "survival";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDataComponentTypes.registerDataComponentTypes();
		ModEnchantmentEffects.registerEnchantmentEffects();
		ModWorldGeneration.generateModWorldGen();
		ModVillagers.registerVillagers();
		FuelRegistryEvents.BUILD.register(((builder, context) -> {
			builder.add(ModItems.EMERALD_COAL, 24000);
		}));
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());


		TradeOfferHelper.registerVillagerOffers(ModVillagers.NETHERALDER, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ModItems.NETHER_EMERALD, 3), 4, 7, 0.04f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ModItems.RAW_NETHER_EMERALD, 4), 4, 7, 0.04f));
		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.NETHERALDER, 2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 10),
					new ItemStack(ModItems.CHISEL, 1), 4, 7, 0.04f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 9),
					new ItemStack(ModBlocks.NETHER_EMERALD_BLOCK, 1), 3, 12, 0.09f));
		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.NETHERALDER, 3, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 7),
					new ItemStack(ModItems.NETHER_EMERALD_LEGGINGS, 1), 4, 7, 0.04f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 8),
					new ItemStack(ModItems.NETHER_EMERALD_CHESTPLATE, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 4),
					new ItemStack(ModItems.NETHER_EMERALD_BOOTS, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 8),
					new ItemStack(ModItems.NETHER_EMERALD_HELMET, 1), 3, 12, 0.09f));

		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.NETHERALDER, 4, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 2),
					new ItemStack(ModItems.NETHER_EMERALD_SWORD, 1), 4, 7, 0.04f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 3),
					new ItemStack(ModItems.NETHER_EMERALD_PICKAXE, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 3),
					new ItemStack(ModItems.NETHER_EMERALD_AXE, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 1),
					new ItemStack(ModItems.NETHER_EMERALD_SHOVEL, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 2),
					new ItemStack(ModItems.NETHER_EMERALD_HOE, 1), 3, 12, 0.09f));

		});

		TradeOfferHelper.registerVillagerOffers(ModVillagers.NETHERALDER, 5, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 8),
					new ItemStack(ModItems.NETHER_EMERALD_HAMMER, 1), 4, 7, 0.04f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 3),
					new ItemStack(ModItems.END_BOW, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 2),
					new ItemStack(ModItems.EMERALD_COAL, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(ModItems.NETHER_EMERALD, 1),
					new ItemStack(ModItems.AIR_CHISEL, 1), 3, 12, 0.09f));

			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.BEDROCK, 1),
					new ItemStack(ModItems.Healthy_Snack, 1), 3, 12, 0.09f));

		});
	}
}