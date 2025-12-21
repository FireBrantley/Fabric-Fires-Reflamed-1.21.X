package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

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
    }

    // --- Helper Methods ---
    // Misc Recipe Templates
    private void createCarbonizedIronRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible ironInput) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .input(ironInput)
                .input(ItemTags.COALS)
                // Just use the ironInput for the unlock condition to keep it simple!
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
                .pattern(" II") // Moved from "II " to " II"
                .pattern(" SI") // Moved from "IS " to " SI"
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
                .pattern(" II") // Moved from "II " to " II"
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