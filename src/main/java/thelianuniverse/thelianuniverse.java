package thelianuniverse;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static thelianuniverse.api.ThelianUniverseAPI.Thelian_ID;
import static thelianuniverse.thelianuniverse.*;

import thelianuniverse.main.proxy.ClientProxy;
import thelianuniverse.main.proxy.CommonProxy;

@Mod(
        modid = MOD_ID,
        name =  MOD_NAME,
        version = MOD_VERSION,
        acceptableRemoteVersions = "*"
)

public final class thelianuniverse {

    public static final String MOD_ID = Thelian_ID;
    public static final String MOD_NAME = "ThelianUniverse";
    public static final String MOD_VERSION = "@MOD_VERSION@";
    private static final thelianuniverse instance = new thelianuniverse();
    @SidedProxy(serverSide = CommonProxy.LOCATION, clientSide = ClientProxy.LOCATION)
    public static CommonProxy proxy;

    private thelianuniverse() {

    }

    @Mod.InstanceFactory
    public static thelianuniverse getInstance(){

        return instance;
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        proxy.postInit(event);
    }
    @EventHandler
    public void loadComplete(FMLLoadCompleteEvent event) {

        proxy.loadComplete();
    }
















}


