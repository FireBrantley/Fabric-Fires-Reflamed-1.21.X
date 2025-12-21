package io.github.firebrantley.firesreflamed.util;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        // Empty, but still here in case needed later

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(
                    RegistryKeys.BLOCK,
                    Identifier.of(FiresReflamed.MOD_ID, name)
            );
        }
    }

}
