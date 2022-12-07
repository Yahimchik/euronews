package test;

import org.testng.annotations.DataProvider;
import utils.TestConfigManager;

import java.util.List;

public class DataProviderClass {

    @DataProvider(name = "languages")
    public static Object[][] getLanguages() {
        List<String> strings = TestConfigManager.getList("languages");
        return new Object[][]{
                {strings.get(0)},
                {strings.get(1)},
                {strings.get(2)},
                {strings.get(3)},
                {strings.get(4)},
                {strings.get(5)},
                {strings.get(6)},
                {strings.get(7)},
                {strings.get(8)},
                {strings.get(9)},
                {strings.get(10)},
                {strings.get(11)},
                {strings.get(12)},
                {strings.get(13)},
                {strings.get(14)},
                {strings.get(15)},
                {strings.get(16)},
        };
    }
}
