package io.github.firebrantley.firesreflamed.world.tree;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator WILLOW =
            new SaplingGenerator(
                    FiresReflamed.MOD_ID + ":willow",
                    Optional.empty(),
                    Optional.of(
                            ModConfiguredFeatures.WILLOW_KEY),
                    Optional.empty());
}