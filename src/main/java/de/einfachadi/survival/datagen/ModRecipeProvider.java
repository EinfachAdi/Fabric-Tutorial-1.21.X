package de.einfachadi.survival.datagen;

import de.einfachadi.survival.Item.ModItems;
import de.einfachadi.survival.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {

                List<ItemConvertible> NETHER_EMERALD_SMELTABLES = List.of(ModItems.RAW_NETHER_EMERALD, ModBlocks.NETHER_EMERALD_ORE);

                offerSmelting( NETHER_EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.NETHER_EMERALD, 0.25f, 200,"nether_emerald");
                offerBlasting( NETHER_EMERALD_SMELTABLES, RecipeCategory.MISC, ModItems.NETHER_EMERALD, 0.50f, 100,"nether_emerald");

                offerReversibleCompactingRecipes( RecipeCategory.BUILDING_BLOCKS, ModItems.NETHER_EMERALD, RecipeCategory.DECORATIONS, ModBlocks.NETHER_EMERALD_BLOCK);

                List<ItemConvertible> NETHER_EMERALD_SMELTABLES1 = List.of(ModItems.NETHER_EMERALD, ModBlocks.NETHER_EMERALD_BLOCK);

                offerBlasting( NETHER_EMERALD_SMELTABLES1, RecipeCategory.MISC, Items.BEDROCK, 100.0f, 2000,"bedrock");

                List<ItemConvertible> NETHER_EMERALD_SMELTABLES2 = List.of( ModBlocks.NETHER_EMERALD_BLOCK);

                offerBlasting( NETHER_EMERALD_SMELTABLES2, RecipeCategory.MISC, ModBlocks.NETHER_EMERALD_GHOST_BLOCK, 100.0f, 2000,"nether_emerald_ghost_block");


                createShaped(RecipeCategory.MISC, ModBlocks.NETHER_EMERALD_GHOST_BLOCK)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.NETHER_EMERALD_BLOCK)
                        .criterion(hasItem(ModBlocks.NETHER_EMERALD_BLOCK), conditionsFromItem(ModBlocks.NETHER_EMERALD_BLOCK))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "TutorialMod Recipes";
    }
}
