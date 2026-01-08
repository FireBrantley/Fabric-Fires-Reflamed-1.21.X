package io.github.firebrantley.firesreflamed.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class BatItem extends Item {

    public BatItem(ToolMaterial material, int damage, float speed, Settings settings) {
        super(settings.attributeModifiers(
                SwordItem.createAttributeModifiers(
                        material,
                        damage,
                        speed
                )
        ));
    }
}

