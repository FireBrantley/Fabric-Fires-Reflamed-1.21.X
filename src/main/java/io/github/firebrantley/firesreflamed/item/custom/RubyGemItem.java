package io.github.firebrantley.firesreflamed.item.custom;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RubyGemItem extends Item {

    public RubyGemItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos clickedPos = context.getBlockPos();
        BlockPos placePos = clickedPos.up();

        if (world.getBlockState(clickedPos).isOf(ModBlocks.RUBY_GEM)
                || world.getBlockState(placePos).isOf(ModBlocks.RUBY_GEM)) {
            return ActionResult.FAIL;
        }

        // must be empty space
        if (!world.getBlockState(placePos).isAir()) {
            return ActionResult.FAIL;
        }

        if (!world.isClient) {
            world.setBlockState(
                    placePos,
                    ModBlocks.RUBY_GEM.getDefaultState()
            );

            world.playSound(
                    null,
                    placePos,
                    ModBlocks.RUBY_GEM
                            .getDefaultState()
                            .getSoundGroup()
                            .getPlaceSound(),
                    SoundCategory.BLOCKS,
                    1.0f,
                    1.0f
            );

            if (!context.getPlayer().isCreative()) {
                context.getStack().decrement(1);
            }
        }

        return ActionResult.SUCCESS;
    }

}
