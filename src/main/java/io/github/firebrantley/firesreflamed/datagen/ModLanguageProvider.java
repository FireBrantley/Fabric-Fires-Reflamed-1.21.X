package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {

    public ModLanguageProvider(FabricDataOutput output,
                               CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup lookup, TranslationBuilder builder) {
        // Tags
        builder.add("tag.item.firesreflamed.willow_logs", "Willow Logs");

        // Item Group
        builder.add("itemGroup.firesreflamed.fires_reflamed", "Fire's Reflamed");

        // Titanium Items & Blocks
        builder.add(ModItems.TITANIUM_INGOT, "Titanium Ingot");
        builder.add(ModItems.TITANIUM_NUGGET, "Titanium Nugget");
        builder.add(ModItems.RAW_TITANIUM, "Raw Titanium");
        builder.add(ModBlocks.BLOCK_OF_TITANIUM, "Block of Titanium");
        builder.add(ModBlocks.TITANIUM_ORE, "Titanium Ore");
        builder.add(ModBlocks.DEEPSLATE_TITANIUM_ORE, "Deepslate Titanium Ore");

        // Titanium Tool Set
        builder.add(ModItems.TITANIUM_SHOVEL, "Titanium Shovel");
        builder.add(ModItems.TITANIUM_PICKAXE, "Titanium Pickaxe");
        builder.add(ModItems.TITANIUM_AXE, "Titanium Axe");
        builder.add(ModItems.TITANIUM_HOE, "Titanium Hoe");
        builder.add(ModItems.TITANIUM_SWORD, "Titanium Sword");
        builder.add(ModItems.TITANIUM_BAT, "Titanium Bat");

        // Titanium Armor Set
        builder.add(ModItems.TITANIUM_HELMET, "Titanium Helmet");
        builder.add(ModItems.TITANIUM_CHESTPLATE, "Titanium Chestplate");
        builder.add(ModItems.TITANIUM_LEGGINGS, "Titanium Leggings");
        builder.add(ModItems.TITANIUM_BOOTS, "Titanium Boots");

        // Steel Items & Blocks
        builder.add(ModItems.STEEL_INGOT, "Steel Ingot");
        builder.add(ModItems.STEEL_NUGGET, "Steel Nugget");
        builder.add(ModItems.CARBONIZED_IRON, "Carbonized Iron");
        builder.add(ModBlocks.BLOCK_OF_STEEL, "Block of Steel");
        builder.add(ModBlocks.STEEL_CHAIN, "Steel Chain");
        builder.add(ModBlocks.STEEL_LANTERN, "Steel Lantern");
        builder.add(ModBlocks.STEEL_BARS, "Steel Bars");

        // Steel Tool Set
        builder.add(ModItems.STEEL_SHOVEL, "Steel Shovel");
        builder.add(ModItems.STEEL_PICKAXE, "Steel Pickaxe");
        builder.add(ModItems.STEEL_AXE, "Steel Axe");
        builder.add(ModItems.STEEL_HOE, "Steel Hoe");
        builder.add(ModItems.STEEL_SWORD, "Steel Sword");
        builder.add(ModItems.STEEL_BAT, "Steel Bat");

        // Steel Armor Set
        builder.add(ModItems.STEEL_HELMET, "Steel Helmet");
        builder.add(ModItems.STEEL_CHESTPLATE, "Steel Chestplate");
        builder.add(ModItems.STEEL_LEGGINGS, "Steel Leggings");
        builder.add(ModItems.STEEL_BOOTS, "Steel Boots");

        // Ruby Items & Blocks
        builder.add(ModItems.RUBY_GEM, "Ruby Gem");
        builder.add(ModItems.RUBY_CRYSTALS, "Ruby Crystals");
        builder.add(ModBlocks.BLOCK_OF_RUBY, "Block of Ruby");
        builder.add(ModBlocks.RUBY_BRICKS, "Ruby Bricks");
        builder.add(ModBlocks.RUBY_BRICK_STAIRS, "Ruby Brick Stairs");
        builder.add(ModBlocks.RUBY_BRICK_SLAB, "Ruby Brick Slab");
        builder.add(ModBlocks.RUBY_BRICK_WALL, "Ruby Brick Wall");
        builder.add(ModBlocks.RUBY_ORE, "Ruby Ore");
        builder.add(ModBlocks.DEEPSLATE_RUBY_ORE, "Deepslate Ruby Ore");
        builder.add(ModBlocks.RUBY_CLUSTER, "Ruby Cluster");

        // Ruby Tool Set
        builder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        builder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        builder.add(ModItems.RUBY_AXE, "Ruby Axe");
        builder.add(ModItems.RUBY_HOE, "Ruby Hoe");
        builder.add(ModItems.RUBY_SWORD, "Ruby Sword");
        builder.add(ModItems.RUBY_BAT, "Ruby Bat");

        // Aquamarine Items & Blocks
        builder.add(ModItems.AQUAMARINE_SHARD, "Aquamarine Shard");
        builder.add(ModBlocks.BLOCK_OF_AQUAMARINE, "Block of Aquamarine");
        builder.add(ModBlocks.AQUAMARINE_ORE, "Aquamarine Ore");
        builder.add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE, "Deepslate Aquamarine Ore");

        // Aquamarine Armor Set
        builder.add(ModItems.AQUAMARINE_HELMET, "Aquamarine Helmet");
        builder.add(ModItems.AQUAMARINE_CHESTPLATE, "Aquamarine Chestplate");
        builder.add(ModItems.AQUAMARINE_LEGGINGS, "Aquamarine Leggings");
        builder.add(ModItems.AQUAMARINE_BOOTS, "Aquamarine Boots");

        // Willow Blocks & Items
        builder.add(ModBlocks.WILLOW_LOG, "Willow Log");
        builder.add(ModBlocks.WILLOW_WOOD, "Willow Wood");
        builder.add(ModBlocks.STRIPPED_WILLOW_LOG, "Stripped Willow Log");
        builder.add(ModBlocks.STRIPPED_WILLOW_WOOD, "Stripped Willow Wood");
        builder.add(ModBlocks.WILLOW_PLANKS, "Willow Planks");
        builder.add(ModBlocks.WILLOW_STAIRS, "Willow Stairs");
        builder.add(ModBlocks.WILLOW_SLAB, "Willow Slab");
        builder.add(ModBlocks.WILLOW_FENCE, "Willow Fence");
        builder.add(ModBlocks.WILLOW_FENCE_GATE, "Willow Fence Gate");
        builder.add(ModBlocks.WILLOW_DOOR, "Willow Door");
        builder.add(ModBlocks.WILLOW_TRAPDOOR, "Willow Trapdoor");
        builder.add(ModBlocks.WILLOW_PRESSURE_PLATE, "Willow Pressure Plate");
        builder.add(ModBlocks.WILLOW_BUTTON, "Willow Button");
        builder.add(ModBlocks.HANGING_WILLOW_LEAVES, "Hanging Willow Leaves");
        builder.add(ModBlocks.WILLOW_LEAVES, "Willow Leaves");
        builder.add(ModBlocks.WILLOW_SAPLING, "Willow Sapling");
        builder.add(ModBlocks.POTTED_WILLOW_SAPLING, "Potted Willow Sapling");
        builder.add(ModItems.WILLOW_BOAT, "Willow Boat");
        builder.add(ModItems.WILLOW_CHEST_BOAT, "Willow Chest Boat");

        // Snow Blocks
        builder.add(ModBlocks.SNOW_BRICKS, "Snow Bricks");
        builder.add(ModBlocks.SNOW_BRICK_STAIRS, "Snow Brick Stairs");
        builder.add(ModBlocks.SNOW_BRICK_SLAB, "Snow Brick Slab");
        builder.add(ModBlocks.SNOW_BRICK_WALL, "Snow Brick Wall");

        // Misc Items
        builder.add(ModItems.DRILL_BIT, "Drill Bit");
        builder.add(ModItems.DRILL, "Drill");
        builder.add(ModItems.WOODEN_BAT, "Wooden Bat");
    }
}