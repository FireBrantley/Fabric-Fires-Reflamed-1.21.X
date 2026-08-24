package io.github.firebrantley.firesreflamed.block;

import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.block.custom.HangingMossBlock;
import io.github.firebrantley.firesreflamed.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    //Titanium
    public static final Block TITANIUM_ORE = registerBlock(
            "titanium_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider
                            .create(2,5),
                    AbstractBlock.Settings
                            .create()
                            .strength(3f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.STONE
                            )
            )
    );
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock(
            "deepslate_titanium_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider
                            .create(2,5),
                    AbstractBlock.Settings
                            .create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.DEEPSLATE
                            )
            )
    );
    public static final Block BLOCK_OF_TITANIUM = registerBlock(
            "block_of_titanium",
            new Block(
                    AbstractBlock.Settings
                            .create()
                            .strength(3)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.NETHERITE
                            )
            )
    );

    // Steel
    public static final Block BLOCK_OF_STEEL = registerBlock(
            "block_of_steel",
            new Block(
                    AbstractBlock.Settings
                            .create()
                            .strength(5)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.METAL
                            )
            )
    );
    public static final Block STEEL_CHAIN = registerBlock(
            "steel_chain",
            new ChainBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(5)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.CHAIN
                            )
            )
    );
    public static final Block STEEL_LANTERN = registerBlock(
            "steel_lantern",
            new LanternBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(3.5f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.LANTERN
                            )
                            .luminance(state -> 15)
                            .nonOpaque()
            )
    );

    // Ruby
    public static final Block RUBY_ORE = registerBlock(
            "ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider
                            .create(3,7),
                    AbstractBlock.Settings
                            .create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.STONE
                            )
            )
    );
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock(
            "deepslate_ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider
                            .create(3,7),
                    AbstractBlock.Settings
                            .create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.DEEPSLATE
                            )
            )
    );
    public static final Block BLOCK_OF_RUBY = registerBlock(
            "block_of_ruby",
            new Block(
                    AbstractBlock.Settings
                            .create()
                            .strength(4)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.AMETHYST_BLOCK
                            )
            )
    );
    public static final Block RUBY_BRICKS = registerBlock(
            "ruby_bricks",
            new Block(
                    AbstractBlock.Settings
                            .create()
                            .strength(4)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.AMETHYST_BLOCK
                            )
            )
    );
    public static final Block RUBY_BRICK_STAIRS = registerBlock(
            "ruby_stairs",
            new StairsBlock(
                    ModBlocks.RUBY_BRICKS.getDefaultState(),
                    AbstractBlock.Settings
                            .create()
                            .strength(4)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.AMETHYST_BLOCK
                            )
            )
    );
    public static final Block RUBY_BRICK_SLAB = registerBlock(
            "ruby_slab",
            new SlabBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(4)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.AMETHYST_BLOCK
                            )
            )
    );
    public static final Block RUBY_BRICK_WALL = registerBlock(
            "ruby_wall",
            new WallBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(4)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.AMETHYST_BLOCK
                            )
            )
    );
    public static final Block RUBY_CLUSTER = registerBlock(
            "ruby_cluster",
            new AmethystClusterBlock(
                    7, 3,
                    AbstractBlock.Settings
                            .create()
                            .strength(1.0f, 1.0f)
                            .sounds(
                                    BlockSoundGroup.AMETHYST_CLUSTER
                            )
                            .nonOpaque()
                            .requiresTool()
                            .luminance(state -> 7)
            )
    );

    // Aquamarine
    public static final Block AQUAMARINE_ORE = registerBlock(
            "aquamarine_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider
                            .create(3,7),
                    AbstractBlock.Settings
                            .create()
                            .strength(4f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.STONE
                            )
            )
    );
    public static final Block DEEPSLATE_AQUAMARINE_ORE = registerBlock(
            "deepslate_aquamarine_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider
                            .create(3,7),
                    AbstractBlock.Settings
                            .create()
                            .strength(4.5f)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.DEEPSLATE
                            )
            )
    );
    public static final Block BLOCK_OF_AQUAMARINE = registerBlock(
            "block_of_aquamarine",
            new Block(
                    AbstractBlock.Settings
                            .create()
                            .strength(4)
                            .requiresTool()
                            .sounds(
                                    BlockSoundGroup.AMETHYST_BLOCK
                            )
            )
    );

    // Willow
    public static final Block WILLOW_LOG = registerBlock(
            "willow_log",
            new PillarBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.OAK_LOG)
            )
    );
    public static final Block WILLOW_WOOD = registerBlock(
            "willow_wood",
            new PillarBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.OAK_WOOD)
            )
    );
    public static final Block STRIPPED_WILLOW_LOG = registerBlock(
            "stripped_willow_log",
            new PillarBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.STRIPPED_OAK_LOG)
            )
    );
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock(
            "stripped_willow_wood",
            new PillarBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.STRIPPED_OAK_WOOD)
            )
    );

    public static final Block WILLOW_PLANKS = registerBlock(
            "willow_planks",
            new Block(
                    AbstractBlock.Settings
                            .copy(Blocks.OAK_PLANKS)
            )
    );

    public static final Block WILLOW_STAIRS = registerBlock(
            "willow_stairs",
            new StairsBlock(
                    ModBlocks.WILLOW_PLANKS.getDefaultState(),
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
            )
    );
    public static final Block WILLOW_SLAB = registerBlock(
            "willow_slab",
            new SlabBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
            )
    );

    public static final Block WILLOW_FENCE = registerBlock(
            "willow_fence",
            new FenceBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
            )
    );
    public static final Block WILLOW_FENCE_GATE = registerBlock(
            "willow_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
            )
    );

    public static final Block WILLOW_DOOR = registerBlock(
            "willow_door",
            new DoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
                            .nonOpaque()
            )
    );
    public static final Block WILLOW_TRAPDOOR = registerBlock(
            "willow_trapdoor",
            new TrapdoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
                            .nonOpaque()
            )
    );

    public static final Block WILLOW_PRESSURE_PLATE = registerBlock(
            "willow_pressure_plate",
            new PressurePlateBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
            )
    );
    public static final Block WILLOW_BUTTON = registerBlock(
            "willow_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings
                            .create()
                            .strength(2f)
                            .noCollision()
            )
    );
    public static final Block WILLOW_LEAVES = registerBlock(
            "willow_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.OAK_LEAVES)
            )
    );
    public static final Block HANGING_WILLOW_LEAVES = registerBlock(
            "hanging_willow_leaves",
            new HangingMossBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.VINE)
                            .noCollision()
                            .breakInstantly()
                            .sounds(
                                    BlockSoundGroup.MOSS_CARPET
                            )
            )
    );
    public static final Block WILLOW_SAPLING = registerBlock(
            "willow_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.WILLOW,
                    AbstractBlock.Settings
                            .copy(Blocks.OAK_SAPLING)
            )
    );
    public static final Block POTTED_WILLOW_SAPLING = registerNonPickableBlock(
            "potted_willow_sapling",
            new FlowerPotBlock(
                    ModBlocks.WILLOW_SAPLING,
                    AbstractBlock.Settings
                            .copy(Blocks.POTTED_OAK_SAPLING)
            )
    );

    private static final Identifier WILLOW_SIGN_TEXTURE = Identifier.of(
            FiresReflamed.MOD_ID,
            "entity/signs/willow"
    );
    private static final Identifier WILLOW_HANGING_SIGN_TEXTURE = Identifier.of(
            FiresReflamed.MOD_ID,
            "entity/signs/hanging/willow"
    );
    private static final Identifier WILLOW_HANGING_SIGN_GUI_TEXTURE = Identifier.of(
            FiresReflamed.MOD_ID,
            "textures/gui/hanging_signs/willow"
    );

    public static final TerraformSignBlock WILLOW_SIGN = (TerraformSignBlock) registerBlock(
            "willow_sign",
            new TerraformSignBlock(
                    WILLOW_SIGN_TEXTURE,
                    AbstractBlock.Settings
                            .create()
                            .solid()
                            .instrument(
                                    NoteBlockInstrument.BASS
                            )
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
            )
    );
    public static final TerraformWallSignBlock WILLOW_WALL_SIGN = (TerraformWallSignBlock) registerBlock(
            "willow_wall_sign",
            new TerraformWallSignBlock(
                    WILLOW_SIGN_TEXTURE,
                    AbstractBlock.Settings
                            .create()
                            .solid()
                            .instrument(
                                    NoteBlockInstrument.BASS
                            )
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
            )
    );
    public static final TerraformHangingSignBlock WILLOW_HANGING_SIGN = (TerraformHangingSignBlock) registerBlock(
            "willow_hanging_sign",
            new TerraformHangingSignBlock(
                    WILLOW_HANGING_SIGN_TEXTURE,
                    WILLOW_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings
                            .create()
                            .solid()
                            .instrument(
                                    NoteBlockInstrument.BASS
                            )
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
            )
    );
    public static final TerraformWallHangingSignBlock WILLOW_WALL_HANGING_SIGN = (TerraformWallHangingSignBlock) registerBlock(
            "willow_wall_hanging_sign",
            new TerraformWallHangingSignBlock(
                    WILLOW_HANGING_SIGN_TEXTURE,
                    WILLOW_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings
                            .create()
                            .solid()
                            .instrument(
                                    NoteBlockInstrument.BASS
                            )
                            .noCollision()
                            .strength(1.0F)
                            .burnable()
            )
    );

    // Snow
    public static final Block SNOW_BRICKS = registerBlock(
            "snow_bricks",
            new Block(
                    AbstractBlock.Settings
                            .create()
                            .strength(0.5f)
                            .sounds(
                                    BlockSoundGroup.SNOW
                            )
                            .requiresTool()
            )
    );
    public static final Block SNOW_BRICK_STAIRS = registerBlock(
            "snow_brick_stairs",
            new StairsBlock(
                    ModBlocks.SNOW_BRICKS.getDefaultState(),
                    AbstractBlock.Settings
                            .create()
                            .strength(0.5f)
                            .sounds(
                                    BlockSoundGroup.SNOW
                            )
                            .requiresTool()
            )
    );
    public static final Block SNOW_BRICK_SLAB = registerBlock(
            "snow_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(0.5f)
                            .sounds(
                                    BlockSoundGroup.SNOW
                            )
                            .requiresTool()
            )
    );
    public static final Block SNOW_BRICK_WALL = registerBlock(
            "snow_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings
                            .create()
                            .strength(0.5f)
                            .sounds(
                                    BlockSoundGroup.SNOW
                            )
                            .requiresTool()
            )
    );

    // Misc
    public static final Block YELLOW_BIRCH_LEAVES = registerBlock(
            "yellow_birch_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings
                            .copy(Blocks.BIRCH_LEAVES)
            )
    );
    public static final Block YELLOW_BIRCH_SAPLING = registerBlock(
            "yellow_birch_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.YELLOW_BIRCH,
                    AbstractBlock.Settings
                            .copy(Blocks.BIRCH_SAPLING)
            )
    );
    public static final Block POTTED_YELLOW_BIRCH_SAPLING = registerNonPickableBlock(
            "potted_yellow_birch_sapling",
            new FlowerPotBlock(
                    ModBlocks.YELLOW_BIRCH_SAPLING,
                    AbstractBlock.Settings
                            .copy(Blocks.POTTED_BIRCH_SAPLING)
            )
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FiresReflamed.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FiresReflamed.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerNonPickableBlock(String name, Block block) {
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(FiresReflamed.MOD_ID, name),
                block
        );
    }

    public static void registerModBlocks() {
        FiresReflamed.LOGGER.info("Registering Blocks Items for " + FiresReflamed.MOD_ID);
    }
}