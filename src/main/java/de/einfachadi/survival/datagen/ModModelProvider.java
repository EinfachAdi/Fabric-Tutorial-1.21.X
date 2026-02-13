package de.einfachadi.survival.datagen;

import de.einfachadi.survival.Item.ModItems;
import de.einfachadi.survival.Survival;
import de.einfachadi.survival.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.equipment.EquipmentModel;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool netherEmeraldPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NETHER_EMERALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGICBLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.netheriteingot_diamondapple);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_EMERALD_GHOST_BLOCK);

        netherEmeraldPool.stairs(ModBlocks.NETHER_EMERALD_STAIRS);
        netherEmeraldPool.slab(ModBlocks.NETHER_EMERALD_SLAB);

        netherEmeraldPool.button(ModBlocks.NETHER_EMERALD_BUTTON);
        netherEmeraldPool.pressurePlate(ModBlocks.NETHER_EMERALD_PRESSURE_PLATE);

        netherEmeraldPool.fence(ModBlocks.NETHER_EMERALD_FENCE);
        netherEmeraldPool.fenceGate(ModBlocks.NETHER_EMERALD_FENCE_GATE);
        netherEmeraldPool.wall(ModBlocks.NETHER_EMERALD_WALL);

        }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NETHER_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NETHER_EMERALD, Models.GENERATED);
        itemModelGenerator.register(ModItems.EMERALD_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.Healthy_Snack, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHISEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.AIR_CHISEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHER_EMERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHER_EMERALD_HAMMER, Models.HANDHELD);


        itemModelGenerator.registerArmor(ModItems.NETHER_EMERALD_HELMET, Identifier.of(Survival.MOD_ID, "nether_emerald"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Survival.MOD_ID, "nether_emerald")).build(), EquipmentSlot.HEAD);
        itemModelGenerator.registerArmor( ModItems.NETHER_EMERALD_CHESTPLATE, Identifier.of(Survival.MOD_ID, "nether_emerald"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Survival.MOD_ID, "nether_emerald")).build(), EquipmentSlot.CHEST);
        itemModelGenerator.registerArmor( ModItems.NETHER_EMERALD_LEGGINGS, Identifier.of(Survival.MOD_ID, "nether_emerald"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Survival.MOD_ID, "nether_emerald")).build(), EquipmentSlot.LEGS);
        itemModelGenerator.registerArmor( ModItems.NETHER_EMERALD_BOOTS, Identifier.of(Survival.MOD_ID, "nether_emerald"),
                EquipmentModel.builder().addHumanoidLayers(Identifier.of(Survival.MOD_ID, "nether_emerald")).build(), EquipmentSlot.FEET);


    }
}
