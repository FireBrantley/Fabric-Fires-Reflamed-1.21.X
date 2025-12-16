package io.github.firebrantley.firesreflamed.util;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL =
                createBlockTag("needs_titanium_tool");

        public static final TagKey<Block> INCORRECT_FOR_TITANIUM_TOOL =
                createBlockTag("incorrect_for_titanium_tool");

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(
                    RegistryKeys.BLOCK,
                    Identifier.of(FiresReflamed.MOD_ID, name)
            );
        }
    }

}
