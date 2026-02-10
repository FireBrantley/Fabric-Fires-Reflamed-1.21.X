package io.github.firebrantley.firesreflamed.item;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FIRES_REFLAMED = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FiresReflamed.MOD_ID, "fires_reflamed"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_TITANIUM))
                    .displayName(Text.translatable("itemGroup.firesreflamed.fires_reflamed"))
                    .entries((displayContext, entries) -> {
                        // Titanium Items & Blocks
                        entries.add(ModBlocks.BLOCK_OF_TITANIUM);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

                        //Titanium Tool Set
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_HOE);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_BAT);

                        //Titanium Armor Set
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        // Steel Items & Blocks
                        entries.add(ModBlocks.BLOCK_OF_STEEL);
                        entries.add(ModItems.CARBONIZED_IRON);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.STEEL_NUGGET);

                        // Steel Tool Set
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_BAT);

                        // Steel Armor Set
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        // Ruby Items & Blocks
                        entries.add(ModBlocks.BLOCK_OF_RUBY);
                        entries.add(ModBlocks.RUBY_BRICKS);
                        entries.add(ModBlocks.RUBY_BRICK_STAIRS);
                        entries.add(ModBlocks.RUBY_BRICK_SLAB);
                        entries.add(ModBlocks.RUBY_BRICK_WALL);
                        entries.add(ModBlocks.RUBY_CLUSTER);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModItems.RUBY_CRYSTALS);
                        entries.add(ModItems.RUBY_GEM);

                        // Ruby Tool Set
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_SWORD);
                        entries.add(ModItems.RUBY_BAT);

                        // Aquamarine Items & Blocks
                        entries.add(ModBlocks.BLOCK_OF_AQUAMARINE);
                        entries.add(ModBlocks.AQUAMARINE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE);
                        entries.add(ModItems.AQUAMARINE_SHARD);

                        // Aquamarine Armor Set
                        entries.add(ModItems.AQUAMARINE_HELMET);
                        entries.add(ModItems.AQUAMARINE_CHESTPLATE);
                        entries.add(ModItems.AQUAMARINE_LEGGINGS);
                        entries.add(ModItems.AQUAMARINE_BOOTS);

                        // Willow Items & Blocks
                        entries.add(ModBlocks.WILLOW_LOG);
                        entries.add(ModBlocks.WILLOW_WOOD);
                        entries.add(ModBlocks.STRIPPED_WILLOW_LOG);
                        entries.add(ModBlocks.STRIPPED_WILLOW_WOOD);

                        entries.add(ModBlocks.WILLOW_PLANKS);
                        entries.add(ModBlocks.WILLOW_STAIRS);
                        entries.add(ModBlocks.WILLOW_SLAB);

                        entries.add(ModBlocks.WILLOW_FENCE);
                        entries.add(ModBlocks.WILLOW_FENCE_GATE);

                        entries.add(ModBlocks.WILLOW_DOOR);
                        entries.add(ModBlocks.WILLOW_TRAPDOOR);

                        entries.add(ModBlocks.WILLOW_PRESSURE_PLATE);
                        entries.add(ModBlocks.WILLOW_BUTTON);

                        entries.add(ModBlocks.HANGING_WILLOW_LEAVES);
                        entries.add(ModBlocks.WILLOW_LEAVES);
                        entries.add(ModBlocks.WILLOW_SAPLING);

                        // Snow Blocks
                        entries.add(ModBlocks.SNOW_BRICKS);
                        entries.add(ModBlocks.SNOW_BRICK_STAIRS);
                        entries.add(ModBlocks.SNOW_BRICK_SLAB);
                        entries.add(ModBlocks.SNOW_BRICK_WALL);

                        // Misc Items
                        entries.add(ModItems.DRILL_BIT);
                        entries.add(ModItems.DRILL);
                        entries.add(ModItems.WOODEN_BAT);
                    }).build());

    public static void registerItemGroups() {

        FiresReflamed.LOGGER.info("Register Item Groups for " + FiresReflamed.MOD_ID);
    }
}
