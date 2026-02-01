package io.github.firebrantley.firesreflamed;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FiresReflamedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        /* Example for doors and trapdoors that have clear parts
         * BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_DOOR, RenderLayer.getCutout());
         * BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_GARNET_TRAPDOOR, RenderLayer.getCutout());
         */

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WILLOW_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_WILLOW_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WILLOW_SAPLING, RenderLayer.getCutout());

    }
}
