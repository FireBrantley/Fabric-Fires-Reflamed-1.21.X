package io.github.firebrantley.firesreflamed.datagen;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.block.custom.HangingMossBlock;
import io.github.firebrantley.firesreflamed.item.ModItems;
import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Titanium Items
        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_NUGGET, Models.GENERATED);

        // Titanium Tool Set
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_BAT, Models.HANDHELD);

        // Titanium Armor Set
        itemModelGenerator.register(ModItems.TITANIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_BOOTS, Models.GENERATED);

        // Steel Items
        itemModelGenerator.register(ModItems.CARBONIZED_IRON, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_NUGGET, Models.GENERATED);

        // Steel Tool Set
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_BAT, Models.HANDHELD);

        // Steel Armor Set
        itemModelGenerator.register(ModItems.STEEL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BOOTS, Models.GENERATED);

        // Ruby Items
        itemModelGenerator.register(ModItems.RUBY_GEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_CRYSTALS, Models.GENERATED);

        // Ruby Tool Set
        itemModelGenerator.register(ModItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_BAT, Models.HANDHELD);

        // Aquamarine Items
        itemModelGenerator.register(ModItems.AQUAMARINE_SHARD, Models.GENERATED);

        // Aquamarine Armor Set
        itemModelGenerator.register(ModItems.AQUAMARINE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUAMARINE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUAMARINE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.AQUAMARINE_BOOTS, Models.GENERATED);

        // Misc Items
        itemModelGenerator.register(ModItems.DRILL_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRILL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_BAT, Models.HANDHELD);
        itemModelGenerator.register(ModBlocks.HANGING_WILLOW_LEAVES.asItem(), Models.GENERATED);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // Pools
        BlockStateModelGenerator.BlockTexturePool willowPool =
                blockStateModelGenerator
                        .registerCubeAllModelTexturePool(ModBlocks.WILLOW_PLANKS);
        BlockStateModelGenerator.BlockTexturePool rubyPool =
                blockStateModelGenerator
                        .registerCubeAllModelTexturePool(ModBlocks.RUBY_BRICKS);
        BlockStateModelGenerator.BlockTexturePool snowPool =
                blockStateModelGenerator
                        .registerCubeAllModelTexturePool(ModBlocks.SNOW_BRICKS);

        // Titanium Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_TITANIUM);

        // Steel Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_STEEL);

        // Ruby Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_RUBY);
        rubyPool.stairs(ModBlocks.RUBY_BRICK_STAIRS);
        rubyPool.slab(ModBlocks.RUBY_BRICK_SLAB);
        rubyPool.wall(ModBlocks.RUBY_BRICK_WALL);
        blockStateModelGenerator.registerAmethyst(ModBlocks.RUBY_CLUSTER);
        blockStateModelGenerator.registerItemModel(ModBlocks.RUBY_CLUSTER);

        // Aquamarine Blocks
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AQUAMARINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AQUAMARINE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_AQUAMARINE);

        // Willow Blocks
        blockStateModelGenerator.registerLog(ModBlocks.WILLOW_LOG)
                .log(ModBlocks.WILLOW_LOG)
                .wood(ModBlocks.WILLOW_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WILLOW_LOG)
                .log(ModBlocks.STRIPPED_WILLOW_LOG)
                .wood(ModBlocks.STRIPPED_WILLOW_WOOD);

        willowPool.stairs(ModBlocks.WILLOW_STAIRS);
        willowPool.slab(ModBlocks.WILLOW_SLAB);

        willowPool.fence(ModBlocks.WILLOW_FENCE);
        willowPool.fenceGate(ModBlocks.WILLOW_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.WILLOW_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.WILLOW_TRAPDOOR);

        willowPool.pressurePlate(ModBlocks.WILLOW_PRESSURE_PLATE);
        willowPool.button(ModBlocks.WILLOW_BUTTON);

        blockStateModelGenerator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(ModBlocks.HANGING_WILLOW_LEAVES)
                        .coordinate(
                                BlockStateModelGenerator.createBooleanModelMap(
                                        HangingMossBlock.TIP,

                                        // FALSE -> TIP MODEL (Creates hanging_willow_leaves_tip.json)
                                        Models.CROSS.upload(
                                                ModBlocks.HANGING_WILLOW_LEAVES,
                                                "_tip",
                                                TextureMap.cross(Identifier.of(FiresReflamed.MOD_ID, "block/hanging_willow_leaves_tip")),
                                                blockStateModelGenerator.modelCollector
                                        ),

                                        // TRUE -> BASE MODEL (Creates hanging_willow_leaves.json)
                                        // We removed the "_body" suffix here
                                        Models.CROSS.upload(
                                                ModBlocks.HANGING_WILLOW_LEAVES,
                                                TextureMap.cross(Identifier.of(FiresReflamed.MOD_ID, "block/hanging_willow_leaves")),
                                                blockStateModelGenerator.modelCollector
                                        )
                                )
                        )
        );
        blockStateModelGenerator.registerSingleton(ModBlocks.WILLOW_LEAVES,
                TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlocks.WILLOW_SAPLING,
                BlockStateModelGenerator
                        .TintType.NOT_TINTED);
        blockStateModelGenerator.blockStateCollector.accept(
                BlockStateModelGenerator.createSingletonBlockState(
                        ModBlocks.POTTED_WILLOW_SAPLING,
                        Models.FLOWER_POT_CROSS.upload(
                                ModBlocks.POTTED_WILLOW_SAPLING,
                                TextureMap.plant(ModBlocks.WILLOW_SAPLING),
                                blockStateModelGenerator.modelCollector
                        )
                )
        );

        // Snow Blocks
        snowPool.stairs(ModBlocks.SNOW_BRICK_STAIRS);
        snowPool.slab(ModBlocks.SNOW_BRICK_SLAB);
        snowPool.wall(ModBlocks.SNOW_BRICK_WALL);
    }
}
