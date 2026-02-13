package de.einfachadi.survival.datagen;

import de.einfachadi.survival.Item.ModItems;
import de.einfachadi.survival.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.NETHER_EMERALD_BLOCK);
        addDrop(ModBlocks.RAW_NETHER_EMERALD_BLOCK);
        addDrop(ModBlocks.MAGICBLOCK);
        addDrop(ModBlocks.netheriteingot_diamondapple);
        addDrop(ModBlocks.NETHER_EMERALD_GHOST_BLOCK);

        addDrop(ModBlocks.NETHER_EMERALD_STAIRS);
        addDrop(ModBlocks.NETHER_EMERALD_SLAB, slabDrops(ModBlocks.NETHER_EMERALD_SLAB));

        addDrop(ModBlocks.NETHER_EMERALD_BUTTON);
        addDrop(ModBlocks.NETHER_EMERALD_PRESSURE_PLATE);

        addDrop(ModBlocks.NETHER_EMERALD_FENCE);
        addDrop(ModBlocks.NETHER_EMERALD_FENCE_GATE);
        addDrop(ModBlocks.NETHER_EMERALD_WALL);


        addDrop(ModBlocks.NETHER_EMERALD_ORE, oreDrops(ModBlocks.NETHER_EMERALD_ORE, ModItems.NETHER_EMERALD));
    }
}
