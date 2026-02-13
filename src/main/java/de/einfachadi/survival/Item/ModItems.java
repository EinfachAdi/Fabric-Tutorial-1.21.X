package de.einfachadi.survival.Item;

import de.einfachadi.survival.Item.custom.AirChiselItem;
import de.einfachadi.survival.Item.custom.ChiselItem;
import de.einfachadi.survival.Item.custom.HammerItem;
import de.einfachadi.survival.Item.custom.ModArmorItem;
import de.einfachadi.survival.Survival;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModItems {

    //normal items
    public static final Item EMERALD_COAL = registerItem("emerald_coal", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID,"emerald_coal")))));
    public static final Item NETHER_EMERALD = registerItem("nether_emerald", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID,"nether_emerald")))));
    public static final Item RAW_NETHER_EMERALD = registerItem("raw_nether_emerald", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID,"raw_nether_emerald")))));
    //tools
    public static final Item NETHER_EMERALD_SWORD = registerItem("nether_emerald_sword",
            new SwordItem(ModToolMaterials.NETHER_EMERALD, 3, -2.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_sword")))));
    public static final Item NETHER_EMERALD_PICKAXE = registerItem("nether_emerald_pickaxe",
            new PickaxeItem(ModToolMaterials.NETHER_EMERALD, 1, -2.8f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_pickaxe")))));
    public static final Item NETHER_EMERALD_SHOVEL = registerItem("nether_emerald_shovel",
            new ShovelItem(ModToolMaterials.NETHER_EMERALD, 1.5f, -3.0f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_shovel")))));
    public static final Item NETHER_EMERALD_AXE = registerItem("nether_emerald_axe",
            new AxeItem(ModToolMaterials.NETHER_EMERALD, 6, -3.2f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_axe")))));
    public static final Item NETHER_EMERALD_HOE = registerItem("nether_emerald_hoe",
            new HoeItem(ModToolMaterials.NETHER_EMERALD, 0, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_hoe")))));

    public static final Item NETHER_EMERALD_HAMMER = registerItem("nether_emerald_hammer",
            new HammerItem(ModToolMaterials.NETHER_EMERALD, 7, -3.4f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_hammer")))));
    public static final Item AIR_CHISEL = registerItem("air_chisel", new AirChiselItem(new Item.Settings().maxDamage(16).fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID,"air_chisel")))));
    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32).fireproof().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID,"air_chisel")))));
    //food
    public static final Item Healthy_Snack = registerItem("healthy_snack", new Item(new Item.Settings().food(ModFoodComponent.HealthySnack).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID,"healthy_snack")))));


    public static final Item NETHER_EMERALD_HELMET = registerItem("nether_emerald_helmet",
            new ModArmorItem(ModArmorMaterials.NETHER_EMERALD_ARMOR_MATERIAL, EquipmentType.HELMET, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_helmet")))));
    public static final Item NETHER_EMERALD_CHESTPLATE = registerItem("nether_emerald_chestplate",
            new ArmorItem(ModArmorMaterials.NETHER_EMERALD_ARMOR_MATERIAL, EquipmentType.CHESTPLATE, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_chestplate")))));
    public static final Item NETHER_EMERALD_LEGGINGS = registerItem("nether_emerald_leggings",
            new ArmorItem(ModArmorMaterials.NETHER_EMERALD_ARMOR_MATERIAL, EquipmentType.LEGGINGS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_leggings")))));
    public static final Item NETHER_EMERALD_BOOTS = registerItem("nether_emerald_boots",
            new ArmorItem(ModArmorMaterials.NETHER_EMERALD_ARMOR_MATERIAL, EquipmentType.BOOTS, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "nether_emerald_boots")))));

    public static final Item END_BOW = registerItem("end_bow",
            new BowItem(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Survival.MOD_ID, "end_bow"))).maxDamage(500)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Survival.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Survival.LOGGER.info("Registering Mod Items for" + Survival.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(NETHER_EMERALD);
            entries.add(RAW_NETHER_EMERALD);
            entries.add(AIR_CHISEL);
            entries.add(CHISEL);
        });
    }
}