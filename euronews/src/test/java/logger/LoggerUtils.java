package logger;

import org.apache.log4j.Logger;

public class LoggerUtils {
    private static final Logger LOGGER = Logger.getLogger(Class.class);

    public static void debug(String message) {
        LOGGER.debug(message);
    }

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void warn(String message) {
        LOGGER.warn(message);
    }

    public static void error(String message) {
        LOGGER.error(message);
    }

    public static void fatal(String message) {
        LOGGER.fatal(message);
    }

    public static void debug(String key, Object... objects) {
        LOGGER.debug(String.format(key, objects));
    }

    public static void info(String key, Object... objects) {
        LOGGER.info(String.format(key, objects));
    }

    public static void warn(String key, Object... objects) {
        LOGGER.warn(String.format(key, objects));
    }

    public static void error(String key, Object... objects) {
        LOGGER.error(String.format(key, objects));
    }

    public static void fatal(String key, Object... objects) {
        LOGGER.fatal(String.format(key, objects));
    }

}
