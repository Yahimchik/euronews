package utils;

import aquality.selenium.core.utilities.JsonSettingsFile;
import constant.FileConstant;

public class ConfigManager {

    public static String getString(String key) {
        return new JsonSettingsFile(FileConstant.CONFIG_FILE).getValue(String.format("/%s", key)).toString();
    }

    public static int getInt(String key) {
        return (int) new JsonSettingsFile(FileConstant.CONFIG_FILE).getValue(String.format("/%s", key));
    }

    public static boolean getBoolean(String key) {
        return (boolean) new JsonSettingsFile(FileConstant.CONFIG_FILE).getValue(String.format("/%s", key));
    }
}
