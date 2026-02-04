package io.github.firebrantley.firesreflamed.world;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY =
            registerKey("titanium_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY =
            registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> AQUAMARINE_ORE_PLACED_KEY =
            registerKey("aquamarine_ore_placed");

    public static final RegistryKey<PlacedFeature> WILLOW_PLACED_KEY =
            registerKey("willow_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, TITANIUM_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.TITANIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(
                                YOffset.fixed(-80),
                                YOffset.fixed(32))));
        register(context, RUBY_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(
                                YOffset.fixed(-16),
                                YOffset.fixed(64))));
        register(context, AQUAMARINE_ORE_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.AQUAMARINE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(
                                YOffset.fixed(-16),
                                YOffset.fixed(48))));

        register(context, WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILLOW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.25f, 1),
                        ModBlocks.WILLOW_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(FiresReflamed.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}