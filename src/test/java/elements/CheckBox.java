package elements;

import elements.interfaces.ICheckBox;
import org.openqa.selenium.By;

public class CheckBox extends Element implements ICheckBox {

    public CheckBox(By locator, String name) {
        super(locator, name);
    }

    @Override
    public void check() {
        findElement().click();
    }

    @Override
    public boolean isChecked() {
        return findElement().isSelected();
    }

    @Override
    public void toggle() {

    }

    @Override
    public void uncheck() {
        findElement().click();
    }
}
