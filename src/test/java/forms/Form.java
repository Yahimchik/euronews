package forms;

import browser.Browser;
import logger.LoggerUtils;
import org.openqa.selenium.By;

public abstract class Form {

    private final By locator;
    private final String name;

    protected Form(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }

    public boolean isDisplayed() {
        LoggerUtils.info(String.format("%s is opened", name));
        return Browser.getInstance().findElement(locator).isDisplayed();
    }
}
