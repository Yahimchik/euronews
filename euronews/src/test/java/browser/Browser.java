package browser;

import org.openqa.selenium.WebDriver;
import waits.Wait;

public class Browser {
    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = BrowserFactory.setDriver();
        }
        return driver;
    }

    public static Wait getWait() {
        return new Wait();
    }

    public static void quit() {
        getInstance().quit();
        driver = null;
    }

    public static void goTo(String url) {
        getInstance().get(url);
    }
}
