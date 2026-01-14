package io.github.firebrantley.firesreflamed.world;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.world.tree.MyStructureTreeFeature;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;

public class ModFeatures {
    public static final Feature<DefaultFeatureConfig> STRUCTURE_TREE = new MyStructureTreeFeature(DefaultFeatureConfig.CODEC);

    public static void registerFeatures() {
        Registry.register(Registries.FEATURE, Identifier.of("firesreflamed", "structure_tree"), STRUCTURE_TREE);
    }
}