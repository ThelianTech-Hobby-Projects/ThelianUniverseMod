package thelianuniverse.api.main.Util;


import org.apache.logging.log4j.Level;
import thelianuniverse.api.ThelianUniverseAPI;
import thelianuniverse.main.init.ThelianConfig.Main;


@UtilityClass
public final class Logger {

    private static final org.apache.logging.log4j.Logger LOGGER;

    static {
        LOGGER = org.apache.logging.log4j.LogManager.getLogger(ThelianUniverseAPI.Thelian_ID.toUpperCase());
    }

    private Logger() {

    }

    public static void thelianDebug(String format, Object... data) {

        if (Main.ThelianDebug.get()) {

            LOGGER.log(Level.DEBUG, format, data);
        }
    }

    public static void debug(String format, Object... data) {

        LOGGER.log(Level.DEBUG, format, data);
    }

    public static void trace(String format, Object... data) {

        LOGGER.log(Level.TRACE, format, data);
    }

    public static void info(String format, Object... data) {

        LOGGER.log(Level.INFO, format, data);
    }

    public static void warn(String format, Object... data) {

        LOGGER.log(Level.WARN, format, data);
    }

    public static void error(String format, Object... data) {

        LOGGER.log(Level.ERROR, format, data);
    }

    public static void fatal(String format, Object... data) {

        LOGGER.log(Level.FATAL, format, data);
    }
}
