package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output,
                               CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

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
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE)
                .add(ModBlocks.BLOCK_OF_AQUAMARINE)
                .add(ModBlocks.ICE_BRICKS)
                .add(ModBlocks.PACKED_ICE_BRICKS)
                .add(ModBlocks.BLUE_ICE_BRICKS);

        // Shovel Mineable
        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.SNOW_BRICKS);

        // --- Needs Tool Tags ---
        // Needs Iron Tool
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLOCK_OF_STEEL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.BLOCK_OF_RUBY);

        // Needs Diamond Tool
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.BLOCK_OF_TITANIUM)
                .add(ModBlocks.AQUAMARINE_ORE)
                .add(ModBlocks.DEEPSLATE_AQUAMARINE_ORE)
                .add(ModBlocks.BLOCK_OF_AQUAMARINE);

        // --- Wood Tags ---
        // Logs
        getOrCreateTagBuilder(ModTags.Blocks.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG)
                .add(ModBlocks.WILLOW_WOOD)
                .add(ModBlocks.STRIPPED_WILLOW_LOG)
                .add(ModBlocks.STRIPPED_WILLOW_WOOD);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(ModTags.Blocks.WILLOW_LOGS);
        
        // Fences
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.WILLOW_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.WILLOW_FENCE_GATE);

        // --- Misc Tags ---
        getOrCreateTagBuilder(ModTags.Blocks.MOSS_PLACEABLE)
                .add(ModBlocks.WILLOW_LOG)
                .add(ModBlocks.WILLOW_LEAVES);
    }
}