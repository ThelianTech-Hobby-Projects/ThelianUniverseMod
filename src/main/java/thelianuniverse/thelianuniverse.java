package thelianuniverse;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import thelianuniverse.main.init.ModInit;
import thelianuniverse.main.util.ItemGroupTU;
import static thelianuniverse.api.ThelianUniverseAPI.Thelian_ID;



@Mod(value = Thelian_ID)
public final class thelianuniverse {
				

				public static thelianuniverse instance;
				
				public thelianuniverse() {
								instance = this;
								
								ModInit.init();
								
								
								FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
								
				}
				
				private void clientSetup(final FMLCommonSetupEvent event) {
				
				
				}
				
				
}


