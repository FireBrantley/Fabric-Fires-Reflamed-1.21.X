package io.github.firebrantley.firesreflamed.item;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //Titanium Items
    public static final  Item RAW_TITANIUM = registerItem("raw_titanium",
            new Item(new Item.Settings()));
    public static final  Item TITANIUM_INGOT = registerItem("titanium_ingot",
            new Item(new Item.Settings()));

    //Titanium Tool Set
    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM,
                            -1, -2.4f))));
    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM,
                            -2, -2.8f))));
    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM,
                            8, -3.0f))));
    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM,
                            -8, -2.4f))));
    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.TITANIUM,
                            5, -2.4f))));

    //Titanium Armor Set
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL,
                    ArmorItem.Type.HELMET, new Item.Settings().maxCount(1)));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL,
                    ArmorItem.Type.CHESTPLATE, new Item.Settings().maxCount(1)));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL,
                    ArmorItem.Type.LEGGINGS, new Item.Settings().maxCount(1)));
    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new ArmorItem(ModArmorMaterials.TITANIUM_ARMOR_MATERIAL,
                    ArmorItem.Type.BOOTS, new Item.Settings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FiresReflamed.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FiresReflamed.LOGGER.info("Registering Mod Items for " + FiresReflamed.MOD_ID);
    }
}
