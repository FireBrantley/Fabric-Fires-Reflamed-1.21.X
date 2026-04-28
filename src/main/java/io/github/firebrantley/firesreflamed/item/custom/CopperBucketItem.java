package io.github.firebrantley.firesreflamed.item.custom;

import io.github.firebrantley.firesreflamed.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.function.Supplier;

public class CopperBucketItem extends BucketItem {

    private final Supplier<Item> filledBucket;

    public CopperBucketItem(Fluid fluid, Supplier<Item> filledBucket, Item.Settings settings) {
        super(fluid, settings);
        this.filledBucket = filledBucket;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        TypedActionResult<ItemStack> result = super.use(world, user, hand);

        if (result.getValue().getItem() == net.minecraft.item.Items.WATER_BUCKET) {
            return TypedActionResult.success(new ItemStack(filledBucket.get()));
        }

        if (result.getValue().getItem() == net.minecraft.item.Items.BUCKET) {
            return TypedActionResult.success(new ItemStack(ModItems.COPPER_BUCKET));
        }

        return result;
    }
}