package com.ti.thelianuniverse.main.init;


import com.ti.thelianuniverse.api.registry.ItemRegisterer;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ThelianItem extends ItemRegisterer {
    public static final RegistryObject<Item> LOGO = ITEMS.register("logo",
            () -> new Item(new Item.Properties()));
}
