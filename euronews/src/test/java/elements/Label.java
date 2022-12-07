package elements;

import elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class Label extends Element implements ILabel {
    public Label(By locator, String name) {
        super(locator, name);
    }
}
