package test;

import browser.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigManager;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        Browser.getInstance().manage().window().maximize();
        Browser.goTo(ConfigManager.getString("url"));
    }

    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }
}
