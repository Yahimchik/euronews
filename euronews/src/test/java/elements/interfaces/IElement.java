package elements.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public interface IElement {
    By getLocator();

    String getName();

    String getText();

    String getAttribute(String attr);

    void SendKeys(String keys);

    void click();

    void jsClick();

    WebElement findElement();

    List<WebElement> findElements();
}
