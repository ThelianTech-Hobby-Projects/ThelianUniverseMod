package thelianuniverse;


import net.minecraft.item.Item;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import thelianuniverse.api.main.Util.Logger;
import thelianuniverse.main.core.init.ModInit;
import thelianuniverse.main.util.ItemGroupTU;
import static thelianuniverse.api.ThelianUniverseAPI.Thelian_ID;



@Mod(value = Thelian_ID)
public final class thelianuniverse {
				

				public static thelianuniverse instance;
				
				public thelianuniverse() {
								instance = this;
								
								ItemGroupTU.init();
								ModInit.init();
								
								
								FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
								
				}
				
				private void clientSetup(final FMLCommonSetupEvent event) {
				
				
				}
				
				
}


