package de.einfachadi.survival.datagen;

import de.einfachadi.survival.Item.ModItems;
import de.einfachadi.survival.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
            .add(ModItems.NETHER_EMERALD)
            .add(ModItems.RAW_NETHER_EMERALD)
            .add(ModItems.EMERALD_COAL)
            .add(Items.NETHERITE_INGOT)
            .add(Items.NETHER_STAR);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.NETHER_EMERALD_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.NETHER_EMERALD_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.NETHER_EMERALD_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.NETHER_EMERALD_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.NETHER_EMERALD_HOE);

        getOrCreateTagBuilder(ModTags.Items.NETHER_EMERALD_REPAIR)
                .add(ModItems.NETHER_EMERALD);


        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.NETHER_EMERALD_HELMET)
                .add(ModItems.NETHER_EMERALD_CHESTPLATE)
                .add(ModItems.NETHER_EMERALD_LEGGINGS)
                .add(ModItems.NETHER_EMERALD_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(ModItems.NETHER_EMERALD);

    }

}
