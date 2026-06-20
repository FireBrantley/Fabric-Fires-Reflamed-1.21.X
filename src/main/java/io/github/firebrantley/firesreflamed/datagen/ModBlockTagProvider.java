package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output,
                               CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final TagKey<Block> C_CLUSTERS = TagKey.of(
            RegistryKeys.BLOCK,
            Identifier.of("c", "clusters")
    );

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // Pickaxe Mineable
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.BLOCK_OF_TITANIUM)
                .add(ModBlocks.BLOCK_OF_STEEL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.BLOCK_OF_RUBY)
                .add(ModBlocks.RUBY_BRICKS)
                .add(ModBlocks.RUBY_BRICK_STAIRS)
                .add(ModBlocks.RUBY_BRICK_SLAB)
                .add(ModBlocks.RUBY_BRICK_WALL)
                .add(ModBlocks.RUBY_CLUSTER)
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE)
                .add(ModBlocks.BLOCK_OF_AQUAMARINE)
                .add(ModBlocks.STEEL_CHAIN)
                .add(ModBlocks.STEEL_LANTERN);
        // Axe Mineable
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(BlockTags.WOODEN_DOORS)
                .addTag(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WILLOW_LOG)
                .add(ModBlocks.WILLOW_WOOD)
                .add(ModBlocks.STRIPPED_WILLOW_LOG)
                .add(ModBlocks.STRIPPED_WILLOW_WOOD)
                .add(ModBlocks.WILLOW_PLANKS)
                .add(ModBlocks.WILLOW_STAIRS)
                .add(ModBlocks.WILLOW_SLAB)
                .add(ModBlocks.WILLOW_FENCE)
                .add(ModBlocks.WILLOW_FENCE_GATE)
                .add(ModBlocks.WILLOW_PRESSURE_PLATE)
                .add(ModBlocks.WILLOW_BUTTON)
                .add(ModBlocks.WILLOW_LEAVES)
                .add(ModBlocks.HANGING_WILLOW_LEAVES)
                .add(ModBlocks.YELLOW_BIRCH_LEAVES);
        // Shovel Mineable
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.SNOW_BRICKS)
                .add(ModBlocks.SNOW_BRICK_STAIRS)
                .add(ModBlocks.SNOW_BRICK_SLAB)
                .add(ModBlocks.SNOW_BRICK_WALL);

        // --- Needs Tool Tags ---
        // Needs Iron Tool
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCK_OF_STEEL)
                .add(ModBlocks.STEEL_CHAIN)
                .add(ModBlocks.STEEL_LANTERN)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.BLOCK_OF_RUBY)
                .add(ModBlocks.RUBY_BRICKS)
                .add(ModBlocks.RUBY_BRICK_STAIRS)
                .add(ModBlocks.RUBY_BRICK_SLAB)
                .add(ModBlocks.RUBY_BRICK_WALL)
                .add(ModBlocks.RUBY_CLUSTER);

        // Needs Diamond Tool
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.BLOCK_OF_TITANIUM)
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE)
                .add(ModBlocks.BLOCK_OF_AQUAMARINE);

        // --- Misc Tags ---
        // Logs
        getOrCreateTagBuilder(ModTags.Blocks.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG)
                .add(ModBlocks.WILLOW_WOOD)
                .add(ModBlocks.STRIPPED_WILLOW_LOG)
                .add(ModBlocks.STRIPPED_WILLOW_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.WILLOW_LOGS);

        // Saplings & Leaves
        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.WILLOW_SAPLING)
                .add(ModBlocks.YELLOW_BIRCH_SAPLING);
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.WILLOW_LEAVES)
                .add(ModBlocks.YELLOW_BIRCH_LEAVES);

        // Doors
        getOrCreateTagBuilder(BlockTags.MOB_INTERACTABLE_DOORS)
                .add(ModBlocks.WILLOW_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.WILLOW_DOOR);
        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.WILLOW_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WILLOW_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.WILLOW_TRAPDOOR);

        // Fences
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.WILLOW_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.WILLOW_FENCE_GATE);

        // Slabs & Stairs
        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.WILLOW_SLAB)
                .add(ModBlocks.RUBY_BRICK_SLAB)
                .add(ModBlocks.SNOW_BRICK_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.WILLOW_SLAB);
        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.WILLOW_STAIRS)
                .add(ModBlocks.RUBY_BRICK_STAIRS)
                .add(ModBlocks.SNOW_BRICK_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.WILLOW_STAIRS);

        // Buttons & Pressure Plates
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.WILLOW_BUTTON);
        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.WILLOW_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.WILLOW_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.WILLOW_PRESSURE_PLATE);

        // Walls
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.SNOW_BRICK_WALL)
                .add(ModBlocks.RUBY_BRICK_WALL);

        // Moss Placeables
        getOrCreateTagBuilder(ModTags.Blocks.MOSS_PLACEABLE)
                .add(ModBlocks.WILLOW_LOG)
                .add(ModBlocks.WILLOW_LEAVES);

        // Clusters
        getOrCreateTagBuilder(C_CLUSTERS)
                .add(ModBlocks.RUBY_CLUSTER);

        // Flower Pots
        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(ModBlocks.POTTED_WILLOW_SAPLING)
                .add(ModBlocks.POTTED_YELLOW_BIRCH_SAPLING);
    }
}