package io.github.firebrantley.firesreflamed.world.tree;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;

public class MyStructureTreeFeature extends Feature<DefaultFeatureConfig> {
    /* Example use
     *
     * private static final List<Identifier> EXAMPLE_VARIANTS = List.of(
     *      Identifier.of("firesreflamed", "example_tree_medium_1"),
     *      Identifier.of("firesreflamed", "example_tree_small_1"),
     *      Identifier.of("firesreflamed", "example_tree_small_2"),
     *      Identifier.of("firesreflamed", "example_tree_small_3")
     * );
     *
     * private static final List<Identifier> BIG_EXAMPLE_VARIANTS = List.of(
     *      Identifier.of("firesreflamed", "example_tree_large_1")
     * );
     */

    public MyStructureTreeFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        return true;
    }
}