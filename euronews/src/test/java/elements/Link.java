package elements;

import elements.interfaces.ILink;
import org.openqa.selenium.By;

public class Link extends Element implements ILink {

    public Link(By locator, String name) {
        super(locator, name);
    }

    @Override
    public String getHref() {
        return findElement().getAttribute("href");
    }
}
