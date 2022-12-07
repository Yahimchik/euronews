package waits;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigManager;

import java.time.Duration;

public class Wait {
    private final WebDriverWait wait;

    public Wait() {
        wait = new WebDriverWait(Browser.getInstance(),
                Duration.ofSeconds(ConfigManager.getInt("timeOut")));
    }

    public void waitForElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public void waitForVisibleOfElementBy(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void waitPresenceOfElementLocated(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
