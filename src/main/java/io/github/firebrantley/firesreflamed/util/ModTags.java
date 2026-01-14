package io.github.firebrantley.firesreflamed.util;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> WILLOW_LOGS = createTag("willow_logs");
        public static final TagKey<Block> MOSS_PLACEABLE = createTag("moss_placeable");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(
                    RegistryKeys.BLOCK,
                    Identifier.of(FiresReflamed.MOD_ID, name)
            );
        }
    }

    public static class Items {
        // Recipes MUST use these Item tags
        public static final TagKey<Item> WILLOW_LOGS = createItemTag("willow_logs");

        private static TagKey<Item> createItemTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FiresReflamed.MOD_ID, name));
        }
    }
}
