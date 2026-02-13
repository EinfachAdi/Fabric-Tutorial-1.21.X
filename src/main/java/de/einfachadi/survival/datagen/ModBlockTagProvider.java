package de.einfachadi.survival.datagen;

import de.einfachadi.survival.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.NETHER_EMERALD_BLOCK)
                .add(ModBlocks.RAW_NETHER_EMERALD_BLOCK)
                .add(ModBlocks.NETHER_EMERALD_ORE)
                .add(ModBlocks.MAGICBLOCK)
                .add(ModBlocks.netheriteingot_diamondapple)
                .add(ModBlocks.NETHER_EMERALD_GHOST_BLOCK);

getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
        .add(ModBlocks.NETHER_EMERALD_BLOCK)
        .add(ModBlocks.RAW_NETHER_EMERALD_BLOCK)
        .add(ModBlocks.NETHER_EMERALD_BLOCK)
        .add(ModBlocks.NETHER_EMERALD_GHOST_BLOCK);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NETHER_EMERALD_ORE);

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.NETHER_EMERALD_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.NETHER_EMERALD_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.NETHER_EMERALD_WALL);

    }
}
