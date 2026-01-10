package io.github.firebrantley.firesreflamed;

import io.github.firebrantley.firesreflamed.datagen.*;
import io.github.firebrantley.firesreflamed.item.ModItemTagProvider;
import io.github.firebrantley.firesreflamed.world.ModConfiguredFeatures;
import io.github.firebrantley.firesreflamed.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class FiresReflamedDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModLanguageProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModBlockLootTableProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {

        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
