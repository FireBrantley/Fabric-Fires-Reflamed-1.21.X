package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.item.ModItems;
import io.github.firebrantley.firesreflamed.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        // --- Titanium Recipes ---
        // Crafting
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_TITANIUM);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.TITANIUM_NUGGET,
                RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                "titanium_ingot_from_nuggets", null, // Names for Ingot
                "titanium_nugget_from_ingot", null);  // Names for Nugget

        createShovelRecipe(exporter,
                ModItems.TITANIUM_SHOVEL,
                ModItems.TITANIUM_INGOT);
        createPickaxeRecipe(exporter,
                ModItems.TITANIUM_PICKAXE,
                ModItems.TITANIUM_INGOT);
        createAxeRecipe(exporter,
                ModItems.TITANIUM_AXE,
                ModItems.TITANIUM_INGOT);
        createFlippedAxeRecipe(exporter,
                ModItems.TITANIUM_AXE,
                ModItems.TITANIUM_INGOT);
        createHoeRecipe(exporter,
                ModItems.TITANIUM_HOE,
                ModItems.TITANIUM_INGOT);
        createFlippedHoeRecipe(exporter,
                ModItems.TITANIUM_HOE,
                ModItems.TITANIUM_INGOT);
        createSwordRecipe(exporter,
                ModItems.TITANIUM_SWORD,
                ModItems.TITANIUM_INGOT);
        createBatRecipe(
                exporter,
                ModItems.TITANIUM_BAT,
                Ingredient.ofItems(ModBlocks.BLOCK_OF_TITANIUM),
                ModItems.TITANIUM_INGOT
        );

        createHelmetRecipe(exporter,
                ModItems.TITANIUM_HELMET,
                ModItems.TITANIUM_INGOT);
        createChestplateRecipe(exporter,
                ModItems.TITANIUM_CHESTPLATE,
                ModItems.TITANIUM_INGOT);
        createLeggingsRecipe(exporter,
                ModItems.TITANIUM_LEGGINGS,
                ModItems.TITANIUM_INGOT);
        createBootsRecipe(exporter,
                ModItems.TITANIUM_BOOTS,
                ModItems.TITANIUM_INGOT);

        // Smelting & Blasting
        offerSmelting(exporter,
                List.of(ModItems.RAW_TITANIUM, ModBlocks.TITANIUM_ORE),
                RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 200, "titanium");
        offerBlasting(exporter,
                List.of(ModItems.RAW_TITANIUM, ModBlocks.TITANIUM_ORE),
                RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 100, "titanium");
        offerSmelting(exporter,
                List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE),
                RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 300, "titanium");
        offerBlasting(exporter,
                List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE),
                RecipeCategory.MISC, ModItems.TITANIUM_INGOT,
                0.7f, 150, "titanium");

        // --- Steel Recipes ---
        // Crafting
        createCarbonizedIronRecipe(exporter, ModItems.CARBONIZED_IRON, Items.IRON_NUGGET);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.STEEL_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_STEEL);
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.STEEL_NUGGET,
                RecipeCategory.MISC, ModItems.STEEL_INGOT,
                "steel_ingot_from_nuggets", null, // Names for Ingot
                "steel_nugget_from_ingot", null);  // Names for Nugget
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_CHAIN)
                .pattern("I")
                .pattern("I")
                .pattern("I")
                .input('I', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_LANTERN)
                .pattern("NNN")
                .pattern("NTN")
                .pattern("NNN")
                .input('N', ModItems.STEEL_NUGGET)
                .input('T', Items.TORCH)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.STEEL_BARS, 16)
                .pattern("III")
                .pattern("III")
                .input('I', ModItems.STEEL_INGOT)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);

        createShovelRecipe(exporter,
                ModItems.STEEL_SHOVEL,
                ModItems.STEEL_INGOT);
        createPickaxeRecipe(exporter,
                ModItems.STEEL_PICKAXE,
                ModItems.STEEL_INGOT);
        createAxeRecipe(exporter,
                ModItems.STEEL_AXE,
                ModItems.STEEL_INGOT);
        createFlippedAxeRecipe(exporter,
                ModItems.STEEL_AXE,
                ModItems.STEEL_INGOT);
        createHoeRecipe(exporter,
                ModItems.STEEL_HOE,
                ModItems.STEEL_INGOT);
        createFlippedHoeRecipe(exporter,
                ModItems.STEEL_HOE,
                ModItems.STEEL_INGOT);
        createSwordRecipe(exporter,
                ModItems.STEEL_SWORD,
                ModItems.STEEL_INGOT);
        createBatRecipe(
                exporter,
                ModItems.STEEL_BAT,
                Ingredient.ofItems(ModBlocks.BLOCK_OF_STEEL),
                ModItems.STEEL_INGOT
        );

        createHelmetRecipe(exporter,
                ModItems.STEEL_HELMET,
                ModItems.STEEL_INGOT);
        createChestplateRecipe(exporter,
                ModItems.STEEL_CHESTPLATE,
                ModItems.STEEL_INGOT);
        createLeggingsRecipe(exporter,
                ModItems.STEEL_LEGGINGS,
                ModItems.STEEL_INGOT);
        createBootsRecipe(exporter,
                ModItems.STEEL_BOOTS,
                ModItems.STEEL_INGOT);

        // Smelting & Blasting
        offerSmelting(exporter,
                List.of(ModItems.CARBONIZED_IRON),
                RecipeCategory.MISC, ModItems.STEEL_INGOT,
                0.7f, 100, "steel");
        offerBlasting(exporter,
                List.of(ModItems.CARBONIZED_IRON),
                RecipeCategory.MISC, ModItems.STEEL_INGOT,
                0.7f, 50, "steel");

        // --- Ruby Recipes ---
        // Crafting
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.RUBY_GEM,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_RUBY);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_CLUSTER)
                .pattern(" R ")
                .pattern("RRR")
                .input('R', ModItems.RUBY_GEM)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter,
                        Identifier.of(
                                "firesreflamed",
                                getItemPath(ModBlocks.RUBY_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_BRICKS, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.BLOCK_OF_RUBY)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter,
                        Identifier.of(
                                "firesreflamed",
                                getItemPath(ModBlocks.RUBY_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY_GEM, 1)
                .pattern("R")
                .pattern("R")
                .input('R', ModItems.STEEL_NUGGET)
                .criterion(hasItem(ModItems.STEEL_NUGGET), conditionsFromItem(ModItems.STEEL_NUGGET))
                .offerTo(exporter,
                        Identifier.of(
                                "firesreflamed",
                                getItemPath(ModItems.RUBY_GEM) + "_from_crystals"));

        createShovelRecipe(exporter,
                ModItems.RUBY_SHOVEL,
                ModItems.RUBY_GEM);
        createPickaxeRecipe(exporter,
                ModItems.RUBY_PICKAXE,
                ModItems.RUBY_GEM);
        createAxeRecipe(exporter,
                ModItems.RUBY_AXE,
                ModItems.RUBY_GEM);
        createFlippedAxeRecipe(exporter,
                ModItems.RUBY_AXE,
                ModItems.RUBY_GEM);
        createHoeRecipe(exporter,
                ModItems.RUBY_HOE,
                ModItems.RUBY_GEM);
        createFlippedHoeRecipe(exporter,
                ModItems.RUBY_HOE,
                ModItems.RUBY_GEM);
        createSwordRecipe(exporter,
                ModItems.RUBY_SWORD,
                ModItems.RUBY_GEM);
        createBatRecipe(
                exporter,
                ModItems.RUBY_BAT,
                Ingredient.ofItems(ModBlocks.BLOCK_OF_RUBY),
                ModItems.RUBY_GEM
        );

        // Stonecutter
        offerStonecuttingRecipe(exporter,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.RUBY_BRICKS,
                ModBlocks.BLOCK_OF_RUBY
        );

        // Smelting & Blasting
        offerSmelting(exporter,
                List.of(ModBlocks.RUBY_ORE),
                RecipeCategory.MISC, ModItems.RUBY_GEM,
                1.0f, 200, "ruby");
        offerBlasting(exporter,
                List.of(ModBlocks.RUBY_ORE),
                RecipeCategory.MISC, ModItems.RUBY_GEM,
                1.0f, 100, "ruby");

        // --- Aquamarine Recipes ---
        // Crafting
        offerReversibleCompactingRecipes(exporter,
                RecipeCategory.MISC, ModItems.AQUAMARINE_SHARD,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLOCK_OF_AQUAMARINE);

        createHelmetRecipe(exporter,
                ModItems.AQUAMARINE_HELMET,
                ModItems.AQUAMARINE_SHARD);
        createChestplateRecipe(exporter,
                ModItems.AQUAMARINE_CHESTPLATE,
                ModItems.AQUAMARINE_SHARD);
        createLeggingsRecipe(exporter,
                ModItems.AQUAMARINE_LEGGINGS,
                ModItems.AQUAMARINE_SHARD);
        createBootsRecipe(exporter,
                ModItems.AQUAMARINE_BOOTS,
                ModItems.AQUAMARINE_SHARD);

        // Smelting & Blasting
        offerSmelting(exporter,
                List.of(ModBlocks.AQUAMARINE_ORE),
                RecipeCategory.MISC, ModItems.AQUAMARINE_SHARD,
                0.8f, 200, "aquamarine");
        offerBlasting(exporter,
                List.of(ModBlocks.AQUAMARINE_ORE),
                RecipeCategory.MISC, ModItems.AQUAMARINE_SHARD,
                0.8f, 100, "aquamarine");

        // --- Willow Recipes ---
        // Crafting
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WILLOW_PLANKS, 4)
                .input(ModTags.Items.WILLOW_LOGS)
                .criterion("has_willow_logs", conditionsFromTag(ModTags.Items.WILLOW_LOGS))
                .offerTo(exporter);
        createStairsRecipe(
                ModBlocks.WILLOW_STAIRS,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.WILLOW_SLAB,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        createFenceRecipe(
                ModBlocks.WILLOW_FENCE,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(
                ModBlocks.WILLOW_FENCE_GATE,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(
                ModBlocks.WILLOW_DOOR,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        createTrapdoorRecipe(
                ModBlocks.WILLOW_TRAPDOOR,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        createPressurePlateRecipe(RecipeCategory.REDSTONE,
                ModBlocks.WILLOW_PRESSURE_PLATE,
                Ingredient.ofItems(ModBlocks.WILLOW_PLANKS))
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WILLOW_BUTTON, 1)
                .input(ModBlocks.WILLOW_PLANKS)
                .criterion(hasItem(ModBlocks.WILLOW_PLANKS), conditionsFromItem(ModBlocks.WILLOW_PLANKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.WILLOW_BOAT, 1)
                .pattern("P P")
                .pattern("PPP")
                .input('P', ModBlocks.WILLOW_PLANKS)
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ModItems.WILLOW_CHEST_BOAT, 1)
                .input(Items.CHEST)
                .input(ModItems.WILLOW_BOAT)
                .criterion(hasItem(ModItems.WILLOW_BOAT), conditionsFromItem(ModItems.WILLOW_BOAT))
                .criterion(hasItem(Items.WATER_BUCKET), conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter);

        // --- Snow Recipes ---
        // Crafting
        offer2x2CompactingRecipe(exporter,
                RecipeCategory.BUILDING_BLOCKS,
                ModBlocks.SNOW_BRICKS,
                Blocks.SNOW_BLOCK
        );


        // --- Misc Item Recipes ---
        // Crafting
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRILL_BIT, 1)
                .pattern(" N ")
                .pattern("NIN")
                .pattern("   ")
                .input('I', ModItems.STEEL_INGOT)
                .input('N', ModItems.STEEL_NUGGET)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRILL, 1)
                .pattern("B  ")
                .pattern(" G ")
                .pattern("   ")
                .input('B', ModItems.DRILL_BIT)
                .input('G', Items.GOLD_BLOCK)
                .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                .offerTo(exporter);
        createBatRecipe(
                exporter,
                ModItems.WOODEN_BAT,
                Ingredient.fromTag(ItemTags.LOGS),
                Items.STICK
        );
    }

    // --- Helper Methods ---
    // Misc Recipe Templates
    private void createCarbonizedIronRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible ironInput) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .input(ironInput)
                .input(ItemTags.COALS)
                .criterion(hasItem(ironInput), conditionsFromItem(ironInput))
                .offerTo(exporter);
    }

    // Tool Recipe Templates
    private void createShovelRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern(" I ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createPickaxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("III")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createAxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("II ")
                .pattern("IS ")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createFlippedAxeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern(" II")
                .pattern(" SI")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, getItemPath(output) + "_flipped");
    }

    private void createHoeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern("II ")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createFlippedHoeRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .pattern(" II")
                .pattern(" S ")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, getItemPath(output) + "_flipped");
    }

    private void createSwordRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" S ")
                .input('I', input)
                .input('S', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createBatRecipe(
            RecipeExporter exporter,
            ItemConvertible output,
            Ingredient blade,
            ItemConvertible handle
    ) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern(" B ")
                .pattern(" B ")
                .pattern(" H ")
                .input('B', blade)
                .input('H', handle)
                .criterion("has_blade", conditionsFromItem(handle))
                .offerTo(exporter);
    }

    // Armor Recipe Templates
    private void createHelmetRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("III")
                .pattern("I I")
                .pattern("   ")
                .input('I', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createChestplateRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("I I")
                .pattern("III")
                .pattern("III")
                .input('I', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createLeggingsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("III")
                .pattern("I I")
                .pattern("I I")
                .input('I', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void createBootsRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("   ")
                .pattern("I I")
                .pattern("I I")
                .input('I', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter);
    }
}