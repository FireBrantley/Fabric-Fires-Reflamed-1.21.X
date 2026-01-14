package io.github.firebrantley.firesreflamed.block.custom;

import io.github.firebrantley.firesreflamed.util.ModTags;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class HangingMossBlock extends Block implements Fertilizable {

    public static final BooleanProperty TIP = BooleanProperty.of("tip");

    public HangingMossBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(TIP, true));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TIP);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());

        // Checks if the block above is in a custom "moss_placeable" tag OR is this moss
        return above.isIn(ModTags.Blocks.MOSS_PLACEABLE) || above.isOf(this);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state,
            Direction direction,
            BlockState neighborState,
            WorldAccess world,
            BlockPos pos,
            BlockPos neighborPos
    ) {
        if (!canPlaceAt(state, world, pos)) {
            return Blocks.AIR.getDefaultState();
        }

        if (direction == Direction.DOWN) {
            return state.with(TIP, !neighborState.isOf(this));
        }

        return state;
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        // Can only be bonemealed if the block below is AIR
        return world.getBlockState(pos.down()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        // This is usually true for simple plants
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        // Place the moss block below the current one
        BlockPos growPos = pos.down();
        world.setBlockState(growPos, this.getDefaultState());
    }

}
