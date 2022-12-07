package elements;

import browser.Browser;
import elements.interfaces.IElement;
import logger.LoggerUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import waits.Wait;

import java.util.List;

public class Element implements IElement {

    private final By locator;
    private final String name;
    private final Wait wait;

    public Element(By locator, String name) {
        this.locator = locator;
        this.name = name;
        wait = Browser.getWait();
    }


    @Override
    public By getLocator() {
        return locator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getText() {
        LoggerUtils.info(String.format("Get %s text", name));
        return findElement().getText();
    }

    @Override
    public String getAttribute(String attr) {
        LoggerUtils.info(String.format("Get %s text using attribute, Attribute is '%s'", name, findElement().getAttribute(attr)));
        return findElement().getAttribute(attr);
    }

    @Override
    public void SendKeys(String keys) {
        LoggerUtils.info(String.format("Send %s to element %s", keys, name));
        findElement().sendKeys(keys);
    }

    @Override
    public void click() {
        LoggerUtils.info(String.format("Click %s", name));
        wait.waitForVisibleOfElementBy(locator);
        findElement().click();
    }

    @Override
    public void jsClick() {
        LoggerUtils.info(String.format("Click %s", name));
        JavascriptExecutor executor = (JavascriptExecutor) Browser.getInstance();
        executor.executeScript("arguments[0].click();", findElement());
    }

    @Override
    public WebElement findElement() {
        return Browser.getInstance().findElement(locator);
    }

    @Override
    public List<WebElement> findElements() {
        return Browser.getInstance().findElements(locator);
    }
}
