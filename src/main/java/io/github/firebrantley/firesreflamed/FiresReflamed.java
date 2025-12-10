package io.github.firebrantley.firesreflamed;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.item.ModItemGroups;
import io.github.firebrantley.firesreflamed.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FiresReflamed implements ModInitializer {
	public static final String MOD_ID = "firesreflamed";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
	}
}