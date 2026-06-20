package io.github.firebrantley.firesreflamed;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.entity.ModBoats;
import io.github.firebrantley.firesreflamed.item.ModItemGroups;
import io.github.firebrantley.firesreflamed.item.ModItems;
import io.github.firebrantley.firesreflamed.util.HammerUsageEvent;
import io.github.firebrantley.firesreflamed.world.ModFeatures;
import io.github.firebrantley.firesreflamed.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FiresReflamed implements ModInitializer {
	public static final String MOD_ID = "firesreflamed";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModWorldGeneration.generateModWorldGen();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModBoats.registerBoats();

        ModFeatures.registerFeatures();

        PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

        StrippableBlockRegistry.register(ModBlocks.WILLOW_LOG, ModBlocks.STRIPPED_WILLOW_LOG);
        StrippableBlockRegistry.register(ModBlocks.WILLOW_WOOD, ModBlocks.STRIPPED_WILLOW_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WILLOW_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WILLOW_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WILLOW_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.HANGING_WILLOW_LEAVES, 30, 60);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_BIRCH_LEAVES, 30, 60);
	}
}