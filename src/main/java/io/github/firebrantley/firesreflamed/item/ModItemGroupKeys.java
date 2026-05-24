package io.github.firebrantley.firesreflamed.item;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItemGroupKeys {
    public static final RegistryKey<ItemGroup> FIRES_REFLAMED = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            Identifier.of(FiresReflamed.MOD_ID, "fires_reflamed")
    );
}