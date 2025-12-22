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

        // Item Group
        builder.add("itemGroup.firesreflamed.fires_reflamed", "Fire's Reflamed");

        // Titanium Items & Blocks
        builder.add(ModItems.TITANIUM_INGOT, "Titanium Ingot");
        builder.add(ModItems.RAW_TITANIUM, "Raw Titanium");
        builder.add(ModBlocks.BLOCK_OF_TITANIUM, "Block of Titanium");
        builder.add(ModBlocks.TITANIUM_ORE, "Titanium Ore");

        // Titanium Tool Set
        builder.add(ModItems.TITANIUM_SHOVEL, "Titanium Shovel");
        builder.add(ModItems.TITANIUM_PICKAXE, "Titanium Pickaxe");
        builder.add(ModItems.TITANIUM_AXE, "Titanium Axe");
        builder.add(ModItems.TITANIUM_HOE, "Titanium Hoe");
        builder.add(ModItems.TITANIUM_SWORD, "Titanium Sword");

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

        // Steel Tool Set
        builder.add(ModItems.STEEL_SHOVEL, "Steel Shovel");
        builder.add(ModItems.STEEL_PICKAXE, "Steel Pickaxe");
        builder.add(ModItems.STEEL_AXE, "Steel Axe");
        builder.add(ModItems.STEEL_HOE, "Steel Hoe");
        builder.add(ModItems.STEEL_SWORD, "Steel Sword");

        // Steel Armor Set
        builder.add(ModItems.STEEL_HELMET, "Steel Helmet");
        builder.add(ModItems.STEEL_CHESTPLATE, "Steel Chestplate");
        builder.add(ModItems.STEEL_LEGGINGS, "Steel Leggings");
        builder.add(ModItems.STEEL_BOOTS, "Steel Boots");

        // Ruby Items & Blocks
        builder.add(ModItems.RUBY_GEM, "Ruby Gem");
        builder.add(ModItems.RUBY_CRYSTALS, "Ruby Crystals");
        builder.add(ModBlocks.BLOCK_OF_RUBY, "Block of Ruby");
        builder.add(ModBlocks.RUBY_ORE, "Ruby Ore");

        // Ruby Tool Set
        builder.add(ModItems.RUBY_SHOVEL, "Ruby Shovel");
        builder.add(ModItems.RUBY_PICKAXE, "Ruby Pickaxe");
        builder.add(ModItems.RUBY_AXE, "Ruby Axe");
        builder.add(ModItems.RUBY_HOE, "Ruby Hoe");
        builder.add(ModItems.RUBY_SWORD, "Ruby Sword");

        // Aquamarine Items & Blocks
        builder.add(ModItems.AQUAMARINE_SHARD, "Aquamarine Shard");
        builder.add(ModBlocks.BLOCK_OF_AQUAMARINE, "Block of Aquamarine");
        builder.add(ModBlocks.AQUAMARINE_ORE, "Aquamarine Ore");

        // Aquamarine Armor Set
        builder.add(ModItems.AQUAMARINE_HELMET, "Aquamarine Helmet");
        builder.add(ModItems.AQUAMARINE_CHESTPLATE, "Aquamarine Chestplate");
        builder.add(ModItems.AQUAMARINE_LEGGINGS, "Aquamarine Leggings");
        builder.add(ModItems.AQUAMARINE_BOOTS, "Aquamarine Boots");
    }
}