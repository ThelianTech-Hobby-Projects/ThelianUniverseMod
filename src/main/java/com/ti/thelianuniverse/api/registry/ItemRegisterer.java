package com.ti.thelianuniverse.api.registry;


import com.ti.thelianuniverse.api.ThelianUniverseAPI;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisterer {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThelianUniverseAPI.Thelian_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
