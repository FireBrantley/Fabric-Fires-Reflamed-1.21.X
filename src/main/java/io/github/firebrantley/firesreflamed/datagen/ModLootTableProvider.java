package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registries
    ) {
        super(output, registries);
    }

    @Override
    public void generate() {
        // Titanium Blocks
        addOreDrop(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM);
        addOreDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM);
        addDrop(ModBlocks.BLOCK_OF_TITANIUM);

        // Steel Blocks
        addDrop(ModBlocks.BLOCK_OF_STEEL);

        // Ruby Blocks
        addMultiDropOre(ModBlocks.RUBY_ORE,
                ModItems.RUBY_CRYSTALS,
                ModItems.RUBY_CRYSTALS);
        addMultiDropOre(ModBlocks.DEEPSLATE_RUBY_ORE,
                ModItems.RUBY_CRYSTALS,
                ModItems.RUBY_CRYSTALS);
        addDrop(ModBlocks.BLOCK_OF_RUBY);

        // Aquamarine Blocks
        addMultiDropOre(ModBlocks.AQUAMARINE_ORE,
                ModItems.AQUAMARINE_SHARD,
                ModItems.AQUAMARINE_SHARD);
        addMultiDropOre(ModBlocks.DEEPSLATE_AQUAMARINE_ORE,
                ModItems.AQUAMARINE_SHARD,
                ModItems.AQUAMARINE_SHARD);
        addDrop(ModBlocks.BLOCK_OF_AQUAMARINE);
        
        // Willow Blocks
        addDrop(ModBlocks.WILLOW_LOG);
        addDrop(ModBlocks.WILLOW_WOOD);
        addDrop(ModBlocks.STRIPPED_WILLOW_LOG);
        addDrop(ModBlocks.STRIPPED_WILLOW_WOOD);
        
        addDrop(ModBlocks.WILLOW_PLANKS);
        addDrop(ModBlocks.WILLOW_STAIRS);
        addDrop(ModBlocks.WILLOW_SLAB, slabDrops(ModBlocks.WILLOW_SLAB));

        addDrop(ModBlocks.WILLOW_FENCE);
        addDrop(ModBlocks.WILLOW_FENCE_GATE);

        addDrop(ModBlocks.WILLOW_DOOR, doorDrops(ModBlocks.WILLOW_DOOR));
        addDrop(ModBlocks.WILLOW_TRAPDOOR);

        addDrop(ModBlocks.WILLOW_PRESSURE_PLATE);
        addDrop(ModBlocks.WILLOW_BUTTON);

        addDrop(ModBlocks.HANGING_WILLOW_LEAVES, BlockLootTableGenerator::dropsWithShears);
        addDrop(ModBlocks.WILLOW_LEAVES, leavesDrops(
                ModBlocks.WILLOW_LEAVES,
                ModBlocks.WILLOW_SAPLING,
                    0.0625f));
        addDrop(ModBlocks.WILLOW_SAPLING);
        addPottedPlantDrops(ModBlocks.POTTED_WILLOW_SAPLING);

        // Ice/Snow Blocks
        addDrop(ModBlocks.ICE_BRICKS);
        addDrop(ModBlocks.PACKED_ICE_BRICKS);
        addDrop(ModBlocks.BLUE_ICE_BRICKS);
        addDrop(ModBlocks.SNOW_BRICKS);
    }

    // --- Helper Methods ---
    // Single Ore Drop Table
    private void addOreDrop(Block ore, Item drop) {
        addDrop(ore, oreDrops(ore, drop));
    }

    // Multiple Ore Drop Table
    private void addMultiDropOre(Block ore, Item primary, Item bonus) {
        addDrop(ore, LootTable.builder()
                // Primary Drop
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(primary))
                        .apply(SetCountLootFunction.builder(
                                UniformLootNumberProvider.create(1.0f, 3.0f)
                        ))
                        .apply(ApplyBonusLootFunction.oreDrops(
                                registryLookup
                                        .getWrapperOrThrow(net.minecraft.registry.RegistryKeys.ENCHANTMENT)
                                        .getOrThrow(Enchantments.FORTUNE)
                        ))
                )

                // Bonus Drop
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(2))
                        .with(ItemEntry.builder(bonus))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)))
        );
    }
}
