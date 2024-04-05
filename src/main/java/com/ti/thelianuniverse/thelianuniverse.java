package com.ti.thelianuniverse;


import com.mojang.logging.LogUtils;
import com.ti.thelianuniverse.api.registry.BlockRegisterer;
import com.ti.thelianuniverse.api.registry.ItemRegisterer;
import com.ti.thelianuniverse.main.util.CreativeTabTU;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.ti.thelianuniverse.api.ThelianUniverseAPI.Thelian_ID;


@Mod(value = Thelian_ID)
public final class thelianuniverse {
    public static final Logger LOGGER = LogUtils.getLogger();
    public thelianuniverse() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CreativeTabTU.register(modEventBus);
        ItemRegisterer.register(modEventBus);
        BlockRegisterer.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::clientSetup);
        modEventBus.addListener(this::loadComplete);

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event){


    }

    private void commonSetup(final FMLCommonSetupEvent evt) {

    }

    private void clientSetup(final FMLClientSetupEvent evt) {
    }

    private void loadComplete(final FMLLoadCompleteEvent evt) {
    }
}


