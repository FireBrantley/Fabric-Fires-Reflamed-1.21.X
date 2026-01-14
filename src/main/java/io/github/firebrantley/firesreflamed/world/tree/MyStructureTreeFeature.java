package io.github.firebrantley.firesreflamed.world.tree;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.DefaultFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.minecraft.structure.StructurePlacementData;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.structure.StructureTemplateManager;

import java.util.List;
import java.util.Optional;

public class MyStructureTreeFeature extends Feature<DefaultFeatureConfig> {
    private static final List<Identifier> WILLOW_VARIANTS = List.of(
            Identifier.of("firesreflamed", "willow_tree_medium_1"),
            Identifier.of("firesreflamed", "willow_tree_small_1"),
            Identifier.of("firesreflamed", "willow_tree_small_2"),
            Identifier.of("firesreflamed", "willow_tree_small_3")
    );

    public MyStructureTreeFeature(Codec<DefaultFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean generate(FeatureContext<DefaultFeatureConfig> context) {
        StructureTemplateManager manager = context.getWorld().toServerWorld().getStructureTemplateManager();
        Random random = context.getRandom();

        // Pick a random ID from the list
        Identifier selectedId = WILLOW_VARIANTS.get(random.nextInt(WILLOW_VARIANTS.size()));
        Optional<StructureTemplate> template = manager.getTemplate(selectedId);

        if (template.isEmpty()) return false;

        StructureTemplate tree = template.get();
        BlockPos origin = context.getOrigin();

        // Center the structure based on its size
        Vec3i size = tree.getSize();
        BlockPos placementPos = origin.add(-size.getX() / 2, 0, -size.getZ() / 2);

        StructurePlacementData data = new StructurePlacementData()
                .setIgnoreEntities(false);

        return tree.place(
                context.getWorld(),
                placementPos,
                placementPos,
                data,
                random,
                Block.NOTIFY_LISTENERS
        );
    }
}