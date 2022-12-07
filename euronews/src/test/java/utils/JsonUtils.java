package utils;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JsonUtils {
    public static JSONObject readFromJsonFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists()) {
                InputStream is = new FileInputStream(file);
                return new JSONObject(IOUtils.toString(is, StandardCharsets.UTF_8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
