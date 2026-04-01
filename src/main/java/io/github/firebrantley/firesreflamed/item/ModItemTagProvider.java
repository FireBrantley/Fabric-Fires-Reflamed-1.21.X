package io.github.firebrantley.firesreflamed.item;

import io.github.firebrantley.firesreflamed.block.ModBlocks;
import io.github.firebrantley.firesreflamed.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    public static final TagKey<Item> C_TOOLS = TagKey.of(
            RegistryKeys.ITEM,
            Identifier.of("c", "tools")
    );
    public static final TagKey<Item> C_CLUSTERS = TagKey.of(
            RegistryKeys.ITEM,
            Identifier.of("c", "clusters")
    );

    /* Hypothetical cross-mod compat tags
    // c: material convention tags
    public static final TagKey<Item> C_INGOTS_TITANIUM = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "ingots/titanium"));
    public static final TagKey<Item> C_INGOTS_STEEL = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "ingots/steel"));
    public static final TagKey<Item> C_RAW_MATERIALS_TITANIUM = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "raw_materials/titanium"));
    public static final TagKey<Item> C_NUGGETS_STEEL = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "nuggets/steel"));
    public static final TagKey<Item> C_GEMS_RUBY = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "gems/ruby"));
    public static final TagKey<Item> C_SHARDS_AQUAMARINE = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "shards/aquamarine"));

    // Broad parent c: tags
    public static final TagKey<Item> C_INGOTS = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "ingots"));
    public static final TagKey<Item> C_RAW_MATERIALS = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "raw_materials"));
    public static final TagKey<Item> C_NUGGETS = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "nuggets"));
    public static final TagKey<Item> C_GEMS = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "gems"));
    public static final TagKey<Item> C_SHARDS = TagKey.of(
            RegistryKeys.ITEM, Identifier.of("c", "shards")); */

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // --- Tool & Armor Tags ---
        // Swords
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.TITANIUM_SWORD)
                .add(ModItems.STEEL_SWORD)
                .add(ModItems.RUBY_SWORD);

        // Pickaxes
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.TITANIUM_PICKAXE)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.DRILL);

        // Shovels
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.TITANIUM_SHOVEL)
                .add(ModItems.STEEL_SHOVEL)
                .add(ModItems.RUBY_SHOVEL);

        // Axes
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.TITANIUM_AXE)
                .add(ModItems.STEEL_AXE)
                .add(ModItems.RUBY_AXE);

        // Hoes
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.TITANIUM_HOE)
                .add(ModItems.STEEL_HOE)
                .add(ModItems.RUBY_HOE);

        // Armor
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.AQUAMARINE_HELMET)
                .add(ModItems.AQUAMARINE_CHESTPLATE)
                .add(ModItems.AQUAMARINE_LEGGINGS)
                .add(ModItems.AQUAMARINE_BOOTS);

        // Armor slot tags
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.AQUAMARINE_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.AQUAMARINE_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.AQUAMARINE_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.AQUAMARINE_BOOTS);

        // Enchantability - Swords
        getOrCreateTagBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.TITANIUM_BAT)
                .add(ModItems.STEEL_BAT)
                .add(ModItems.RUBY_BAT);

        // Enchantability - Tools
        getOrCreateTagBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.TITANIUM_PICKAXE)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.DRILL);
        getOrCreateTagBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.TITANIUM_PICKAXE)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.DRILL);
        getOrCreateTagBuilder(ItemTags.SHARP_WEAPON_ENCHANTABLE)
                .add(ModItems.TITANIUM_SWORD)
                .add(ModItems.STEEL_SWORD)
                .add(ModItems.RUBY_SWORD);

        // Enchantability - Armor
        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.AQUAMARINE_HELMET)
                .add(ModItems.AQUAMARINE_CHESTPLATE)
                .add(ModItems.AQUAMARINE_LEGGINGS)
                .add(ModItems.AQUAMARINE_BOOTS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.STEEL_HELMET)
                .add(ModItems.AQUAMARINE_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.STEEL_CHESTPLATE)
                .add(ModItems.AQUAMARINE_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.STEEL_LEGGINGS)
                .add(ModItems.AQUAMARINE_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_BOOTS)
                .add(ModItems.STEEL_BOOTS)
                .add(ModItems.AQUAMARINE_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.BATS)
                .add(ModItems.WOODEN_BAT)
                .add(ModItems.TITANIUM_BAT)
                .add(ModItems.STEEL_BAT)
                .add(ModItems.RUBY_BAT);

        getOrCreateTagBuilder(ItemTags.VANISHING_ENCHANTABLE)
                .addTag(ModTags.Items.BATS);

        getOrCreateTagBuilder(ItemTags.FIRE_ASPECT_ENCHANTABLE)
                .addTag(ModTags.Items.BATS);

        getOrCreateTagBuilder(ItemTags.WEAPON_ENCHANTABLE)
                .addTag(ModTags.Items.BATS);

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .addTag(ModTags.Items.BATS);

        getOrCreateTagBuilder(C_TOOLS)
                .addTag(ModTags.Items.BATS);

        // --- Wooden Tags ---
        // Wood
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WILLOW_LOG.asItem())
                .add(ModBlocks.WILLOW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.asItem());
        getOrCreateTagBuilder(ModTags.Items.WILLOW_LOGS)
                .add(ModBlocks.WILLOW_LOG.asItem())
                .add(ModBlocks.WILLOW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WILLOW_LOG.asItem())
                .add(ModBlocks.STRIPPED_WILLOW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.WILLOW_PLANKS.asItem());

        // Saplings & Leaves
        getOrCreateTagBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.WILLOW_SAPLING.asItem());
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.WILLOW_LEAVES.asItem());

        // Slabs & Stairs
        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.WILLOW_SLAB.asItem())
                .add(ModBlocks.RUBY_BRICK_SLAB.asItem())
                .add(ModBlocks.SNOW_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.WILLOW_SLAB.asItem());
        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.WILLOW_STAIRS.asItem())
                .add(ModBlocks.RUBY_BRICK_STAIRS.asItem())
                .add(ModBlocks.SNOW_BRICK_STAIRS.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.WILLOW_STAIRS.asItem());

        // Buttons & Pressure Plates
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.WILLOW_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(ModBlocks.WILLOW_BUTTON.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.WILLOW_PRESSURE_PLATE.asItem());

        // Walls
        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.RUBY_BRICK_WALL.asItem())
                .add(ModBlocks.SNOW_BRICK_WALL.asItem());

        // Fences
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.WILLOW_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(ModBlocks.WILLOW_FENCE.asItem());
        getOrCreateTagBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.WILLOW_FENCE_GATE.asItem());

        // Doors
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.WILLOW_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.DOORS)
                .add(ModBlocks.WILLOW_DOOR.asItem());
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.WILLOW_TRAPDOOR.asItem());
        getOrCreateTagBuilder(ItemTags.TRAPDOORS)
                .add(ModBlocks.WILLOW_TRAPDOOR.asItem());

        // Signs
        getOrCreateTagBuilder(ItemTags.SIGNS)
                .add(ModItems.WILLOW_SIGN);
        getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
                .add(ModItems.WILLOW_HANGING_SIGN);

        // Boats
        getOrCreateTagBuilder(ItemTags.BOATS)
                .add(ModItems.WILLOW_BOAT)
                .add(ModItems.WILLOW_CHEST_BOAT);
        getOrCreateTagBuilder(ItemTags.CHEST_BOATS)
                .add(ModItems.WILLOW_CHEST_BOAT);

        // Clusters
        getOrCreateTagBuilder(C_CLUSTERS)
                .add(ModBlocks.RUBY_CLUSTER.asItem());

        /* Hypothetical cross-mod compat tags
        // c: material convention tags (cross-mod compat)
        getOrCreateTagBuilder(C_INGOTS_TITANIUM)
                .add(ModItems.TITANIUM_INGOT);
        getOrCreateTagBuilder(C_INGOTS_STEEL)
                .add(ModItems.STEEL_INGOT);
        getOrCreateTagBuilder(C_RAW_MATERIALS_TITANIUM)
                .add(ModItems.RAW_TITANIUM);
        getOrCreateTagBuilder(C_NUGGETS_STEEL)
                .add(ModItems.STEEL_NUGGET);
        getOrCreateTagBuilder(C_GEMS_RUBY)
                .add(ModItems.RUBY_GEM)
                .add(ModItems.RUBY_CRYSTALS);
        getOrCreateTagBuilder(C_SHARDS_AQUAMARINE)
                .add(ModItems.AQUAMARINE_SHARD);

        // Broad parent c: tags (for mods that check the top-level tag)
        getOrCreateTagBuilder(C_INGOTS)
                .addTag(C_INGOTS_TITANIUM)
                .addTag(C_INGOTS_STEEL);
        getOrCreateTagBuilder(C_RAW_MATERIALS)
                .addTag(C_RAW_MATERIALS_TITANIUM);
        getOrCreateTagBuilder(C_NUGGETS)
                .addTag(C_NUGGETS_STEEL);
        getOrCreateTagBuilder(C_GEMS)
                .addTag(C_GEMS_RUBY);
        getOrCreateTagBuilder(C_SHARDS)
                .addTag(C_SHARDS_AQUAMARINE); */
    }
}