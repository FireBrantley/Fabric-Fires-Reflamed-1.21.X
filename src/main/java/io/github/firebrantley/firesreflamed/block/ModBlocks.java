package io.github.firebrantley.firesreflamed.block;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    //Titanium
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,5),
                    AbstractBlock.Settings.create().strength(3f)
            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLOCK_OF_TITANIUM = registerBlock("block_of_titanium",
            new Block(AbstractBlock.Settings.create().strength(3)
            .requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    // Steel
    public static final Block BLOCK_OF_STEEL = registerBlock("block_of_steel",
            new Block(AbstractBlock.Settings.create().strength(5)
            .requiresTool().sounds(BlockSoundGroup.METAL)));

    // Ruby
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().strength(4f)
            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLOCK_OF_RUBY = registerBlock("block_of_ruby",
            new Block(AbstractBlock.Settings.create().strength(4)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    // Aquamarine
    public static final Block AQUAMARINE_ORE = registerBlock("aquamarine_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,7),
                    AbstractBlock.Settings.create().strength(4f)
            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block BLOCK_OF_AQUAMARINE = registerBlock("block_of_aquamarine",
            new Block(AbstractBlock.Settings.create().strength(4)
            .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(FiresReflamed.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(FiresReflamed.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        FiresReflamed.LOGGER.info("Registering Blocks Items for " + FiresReflamed.MOD_ID);
    }
}