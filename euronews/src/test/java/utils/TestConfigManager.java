package utils;

import constant.FileConstant;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestConfigManager {
    public static List<String> getList(String key) {
        List<String> languages = new ArrayList<>();
        JSONArray s = Objects
                .requireNonNull(JsonUtils
                        .readFromJsonFile(FileConstant.LANGUAGES))
                .getJSONArray(key);
        for (int i = 0; i < s.length(); ++i) {
            languages.add(s.getString(i));
        }
        return languages;
    }
}
