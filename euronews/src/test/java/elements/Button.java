package elements;

import browser.Browser;
import elements.interfaces.IButton;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Button extends Element implements IButton {

    public Button(By locator, String name) {
        super(locator, name);
    }

}
