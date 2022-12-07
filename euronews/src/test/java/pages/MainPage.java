package pages;

import browser.Browser;
import elements.Button;
import forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends Form {

    private final Button worldButton = new Button(
            By.xpath("//div[contains(@class,'show-for-large-only')]//child::a[@href='//ru.euronews.com/news/international']"),
            "World Button"
    );
    WebDriverWait wait = new WebDriverWait(Browser.getInstance(), Duration.ofSeconds(20));

    private final Button languagesButton = new Button(
            By.xpath("//div[contains(@class,'c-menu-language')]"),
            "Languages button"
    );

    public MainPage() {
        super(By.xpath("//ul[@class='o-header-menu__list']"), "Main page");
    }

    public void clickLanguagesButton() {
        languagesButton.click();
    }

    public void chooseLanguageAndClick(String language) {
        Button languageButton = new Button(
                By.xpath(String.format("//div[contains(@class,'c-menu-language__list u-padding-x-1 u-padding-y-1 u-position-absolute js-menu-language__list')]" +
                        "//child::a[contains(@lang,'%s')]", language)),
                "Language button"
        );
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(languageButton.getLocator()));
        languageButton.click();
    }

    public void clickWorldButton() {
        worldButton.click();
    }
}
