package io.github.firebrantley.firesreflamed.world;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.LargeOakFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;

import java.util.List;
// For trees using structures
// import static io.github.firebrantley.firesreflamed.world.ModFeatures.STRUCTURE_TREE;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY =
            registerKey(
                    "titanium_ore"
            );
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY =
            registerKey(
                    "ruby_ore"
            );
    public static final RegistryKey<ConfiguredFeature<?, ?>> AQUAMARINE_ORE_KEY =
            registerKey(
                    "aquamarine_ore"
            );

    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_KEY =
            registerKey(
                    "willow"
            );
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_BIRCH_KEY =
            registerKey(
                    "yellow_birch"
            );

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldTitaniumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables,
                                ModBlocks.TITANIUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables,
                                ModBlocks.DEEPSLATE_TITANIUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables,
                                ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables,
                                ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAquamarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables,
                                ModBlocks.AQUAMARINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables,
                                ModBlocks.DEEPSLATE_AQUAMARINE_ORE.getDefaultState()));

        // Ores
        register(context, TITANIUM_ORE_KEY,
                Feature.ORE,
                new OreFeatureConfig(overworldTitaniumOres,
                        10));
        register(context, RUBY_ORE_KEY,
                Feature.ORE,
                new OreFeatureConfig(overworldRubyOres,
                        8));
        register(context, AQUAMARINE_ORE_KEY,
                Feature.ORE,
                new OreFeatureConfig(overworldAquamarineOres,
                        7));

        // Trees
        // Example for structure trees
        // register(context, STRUCTURE_KEY, STRUCTURE_TREE, new DefaultFeatureConfig());

        register(context, WILLOW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.WILLOW_LOG),
                new LargeOakTrunkPlacer(
                        6,
                        3,
                        2
                ),
                BlockStateProvider.of(ModBlocks.WILLOW_LEAVES),
                new LargeOakFoliagePlacer(
                        ConstantIntProvider.create(2),
                        ConstantIntProvider.create(3),
                        4),
                new TwoLayersFeatureSize(
                        1,
                        0,
                        2
                )
                )
                .build()
        );

        register(context, YELLOW_BIRCH_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(Blocks.BIRCH_LOG),
                new StraightTrunkPlacer(
                        5,
                        2,
                        0
                ),
                BlockStateProvider.of(ModBlocks.YELLOW_BIRCH_LEAVES),
                new BlobFoliagePlacer(
                        ConstantIntProvider.create(2),
                        ConstantIntProvider.create(0),
                        3),
                new TwoLayersFeatureSize(
                        1,
                        0,
                        1
                )
                )
                .build()
        );
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(FiresReflamed.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}