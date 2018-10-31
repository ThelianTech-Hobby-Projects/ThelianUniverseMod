package thelianuniverse.api.config.core;


import java.io.File;

import thelianuniverse.api.config.Config;
import thelianuniverse.api.config.properties.ConfigPropertyBoolean;


@SuppressWarnings("WeakerAccess")
public class ThelianUniverseConfig extends Config {

    public final ConfigPropertyBoolean ENABLE_DEBUGGING;


    public ThelianUniverseConfig(File configFile) {

        super(configFile);

        ENABLE_DEBUGGING = new ConfigPropertyBoolean(
                "Enable Debugging",
                "Debug",
                "WARNING: This should only be enabled if you know what you're doing.",
                false
        );
        this.addProperty(ENABLE_DEBUGGING);
    }



}
