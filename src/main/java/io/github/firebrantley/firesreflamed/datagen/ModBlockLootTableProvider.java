package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ModBlockLootTableProvider(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registries
    ) {
        super(output, registries);
    }

    @Override
    public void generate() {
        addSelfDrop(ModBlocks.BLOCK_OF_STEEL);
        addSelfDrop(ModBlocks.BLOCK_OF_TITANIUM);
        addOreDrop(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM);
    }

    // --- Helper Methods ---
    // Self Drop Table
    private void addSelfDrop(Block block) {
        addDrop(block);
    }

    // Single Ore Drop Table
    private void addOreDrop(Block ore, Item drop) {
        addDrop(ore, oreDrops(ore, drop));
    }

    // Slab Drop Table
    private void addSlabDrop(Block slab) {
        addDrop(slab, slabDrops(slab));
    }

    // Door Drop Table
    private void addDoorDrop(Block door) {
        addDrop(door, doorDrops(door));
    }

    // Leaves Drop Table
    private void addLeavesDrop(Block leaves, Block sapling, float chance) {
        addDrop(leaves, leavesDrops(leaves, sapling, chance));
    }
}
