package thelianuniverse;


import net.minecraft.item.Item;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import thelianuniverse.api.main.Util.Logger;
import thelianuniverse.main.core.init.ModItems;
import static thelianuniverse.api.ThelianUniverseAPI.Thelian_ID;
import static thelianuniverse.thelianuniverse.MOD_ID;


@Mod(MOD_ID)
public final class thelianuniverse {
				
				public static final String MOD_ID = Thelian_ID;
				public static thelianuniverse instance;
				
				public thelianuniverse() {
								instance = this;
								
								FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
								FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
								
								MinecraftForge.EVENT_BUS.register(this);
				}
				
				private void setup(final FMLCommonSetupEvent event) {
								Logger.info("Setup Commencing");
				
				}
				
				private void clientRegistries(final FMLClientSetupEvent event) {
				
				}
				
				@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
				public static class RegistryEvents {
				
				}
				
}


