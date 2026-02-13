package de.einfachadi.survival.Item;

import de.einfachadi.survival.Survival;
import de.einfachadi.survival.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NETHER_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Survival.MOD_ID, "usually_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NETHER_EMERALD))
                    .displayName(Text.translatable("itemgroup.survival.usually_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.NETHER_EMERALD);
                      entries.add(ModItems.RAW_NETHER_EMERALD);
                    }).build());

        public static final ItemGroup NETHER_BLOCKS = Registry.register(Registries.ITEM_GROUP,
                Identifier.of(Survival.MOD_ID, "building_blocks"),
                FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.NETHER_EMERALD_BLOCK))
                        .displayName(Text.translatable("itemgroup.survival.building_blocks"))
                        .entries((displayContext, entries) -> {
                            entries.add(ModBlocks.NETHER_EMERALD_BLOCK);
                            entries.add(ModBlocks.RAW_NETHER_EMERALD_BLOCK);
                            entries.add(ModBlocks.NETHER_EMERALD_ORE);
                            entries.add(ModBlocks.MAGICBLOCK);
                            entries.add(ModBlocks.netheriteingot_diamondapple);

                            entries.add(ModBlocks.NETHER_EMERALD_STAIRS);
                            entries.add(ModBlocks.NETHER_EMERALD_SLAB);

                            entries.add(ModBlocks.NETHER_EMERALD_BUTTON);
                            entries.add(ModBlocks.NETHER_EMERALD_PRESSURE_PLATE);

                            entries.add(ModBlocks.NETHER_EMERALD_FENCE);
                            entries.add(ModBlocks.NETHER_EMERALD_FENCE_GATE);
                            entries.add(ModBlocks.NETHER_EMERALD_WALL);



                        }).build());
    public static final ItemGroup GHOST_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Survival.MOD_ID, "ghost_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.NETHER_EMERALD_GHOST_BLOCK))
                    .displayName(Text.translatable("itemgroup.survival.ghost_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.NETHER_EMERALD_GHOST_BLOCK);

                    }).build());

    public static final ItemGroup TOOLS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Survival.MOD_ID, "tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CHISEL))
                    .displayName(Text.translatable("itemgroup.survival.tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.AIR_CHISEL);

                        entries.add(ModItems.NETHER_EMERALD_SWORD);
                        entries.add(ModItems.NETHER_EMERALD_SHOVEL);
                        entries.add(ModItems.NETHER_EMERALD_HOE);
                        entries.add(ModItems.NETHER_EMERALD_PICKAXE);
                        entries.add(ModItems.NETHER_EMERALD_AXE);
                        entries.add(ModItems.NETHER_EMERALD_HAMMER);
                        entries.add(ModItems.END_BOW);

                        entries.add(ModItems.NETHER_EMERALD_BOOTS);
                        entries.add(ModItems.NETHER_EMERALD_CHESTPLATE);
                        entries.add(ModItems.NETHER_EMERALD_HELMET);
                        entries.add(ModItems.NETHER_EMERALD_LEGGINGS);
                    }).build());


    public static final ItemGroup FOOD = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Survival.MOD_ID, "food"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.Healthy_Snack))
                    .displayName(Text.translatable("itemgroup.survival.food"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.Healthy_Snack);
                    }).build());

    public static final ItemGroup FUEL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Survival.MOD_ID, "fuel"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EMERALD_COAL))
                    .displayName(Text.translatable("itemgroup.survival.fuel"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EMERALD_COAL);
                    }).build());


    public static void registerItemGroups() {
        Survival.LOGGER.info("Registering Item Groups for" + Survival.MOD_ID);
    }
}
