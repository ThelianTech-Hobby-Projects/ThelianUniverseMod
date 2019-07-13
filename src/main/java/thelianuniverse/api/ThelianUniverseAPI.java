package thelianuniverse.api;

import java.nio.file.Path;

import thelianuniverse.api.config.core.ThelianUniverseConfig;
import thelianuniverse.api.main.Util.UtilityClass;

@UtilityClass
public final class ThelianUniverseAPI {

    public static final String TU_API_ID = "tuapi";
    public static final String VERSION = "@API_VERSION@";
    public static final String Thelian_ID = "thelianuniverse";
    public static final String TU_WORLDTYPE_ID = "THELIANUNIVERSE";

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
