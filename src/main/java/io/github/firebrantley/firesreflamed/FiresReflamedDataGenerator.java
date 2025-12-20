package io.github.firebrantley.firesreflamed;

import io.github.firebrantley.firesreflamed.datagen.ModLanguageProvider;
import io.github.firebrantley.firesreflamed.datagen.ModModelProvider;
import io.github.firebrantley.firesreflamed.datagen.ModRecipeProvider;
import io.github.firebrantley.firesreflamed.item.ModItemTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class FiresReflamedDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModLanguageProvider::new);
        pack.addProvider(ModRecipeProvider::new);
    }
}
