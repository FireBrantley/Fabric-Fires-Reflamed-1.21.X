package io.github.firebrantley.firesreflamed.item;

import io.github.firebrantley.firesreflamed.FiresReflamed;
import io.github.firebrantley.firesreflamed.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FIRES_REFLAMED = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FiresReflamed.MOD_ID, "fires_reflamed"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_TITANIUM))
                    .displayName(Text.translatable("itemgroup.firesreflamed.fires_reflamed"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLOCK_OF_TITANIUM);
                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);

                    }).build());

    public static void registerItemGroups() {

        FiresReflamed.LOGGER.info("Register Item Groups for " + FiresReflamed.MOD_ID);
    }
}
