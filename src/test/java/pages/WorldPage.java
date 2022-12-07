package pages;

import constant.StringConstant;
import elements.Label;
import forms.Form;
import org.openqa.selenium.By;

public class WorldPage extends Form {

    private static final Label logo = new Label(
            By.xpath("//a[@class='o-site-header__logo']"),
            "Logo"
    );

    public WorldPage() {
        super(By.xpath("//section[@class='o-section c-section o-block-topstories-newsy']"), "World Page");
    }

    public boolean isLogoTextEquals() {
        return logo.getAttribute("aria-label").equals(StringConstant.LOGO_TEXT);
    }

    public void clickLogo() {
        logo.click();
    }
}
