package pages.forms;

import elements.Button;
import forms.Form;
import org.openqa.selenium.By;

public class AgreeForm extends Form {

    private final Button agreeButton = new Button(
            By.xpath("//button[@id='didomi-notice-agree-button']"),
            "Agree button"
    );

    public AgreeForm() {
        super(By.xpath("//div[@class='didomi-popup-view']"), "Agree form");
    }

    public void clickAgreeButton() {
        agreeButton.click();
    }

}
