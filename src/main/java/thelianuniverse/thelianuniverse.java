package thelianuniverse;


import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import thelianuniverse.api.main.Util.Logger;
import thelianuniverse.main.init.ModInit;
import thelianuniverse.main.proxy.ClientProxy;
import thelianuniverse.main.proxy.CommonProxy;

import static thelianuniverse.api.ThelianUniverseAPI.Thelian_ID;


@Mod(value = Thelian_ID)
public final class thelianuniverse {

    public static thelianuniverse instance;
    public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public static Logger logger;

    public thelianuniverse() {

        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);
    }

    private void commonSetup(final FMLCommonSetupEvent evt) {

        ModInit.init();
    }

    private void clientSetup(final FMLClientSetupEvent evt) {


    }

    private void loadComplete(final FMLLoadCompleteEvent evt) {


    }

}


