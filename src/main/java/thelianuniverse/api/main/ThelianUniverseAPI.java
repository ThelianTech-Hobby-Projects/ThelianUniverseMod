package thelianuniverse.api.main;

import java.nio.file.Path;

import thelianuniverse.api.config.core.ThelianUniverseConfig;

public class ThelianUniverseAPI {

    public static final String Thelian_ID = "thelianuniverse";
    private static Path configPath;
    private static ThelianUniverseConfig thelainConfig;

    private ThelianUniverseAPI() {

    }

    public static void setConfig(ThelianUniverseConfig config) {

        if (thelainConfig == null) {
            thelainConfig = config;
        }
    }

    public static Path getConfigPath() {

        return configPath;
    }

    public static void setConfigPath(Path path) {

        if (configPath == null) {
            configPath = path;
        }
    }

    public static ThelianUniverseConfig config() {
        return thelainConfig;
    }
}
