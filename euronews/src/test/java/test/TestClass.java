package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.forms.AgreeForm;

public class TestClass extends BaseTest {

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "languages")
    public void languageTest(String language) throws InterruptedException {
        AgreeForm agreeForm = new AgreeForm();
        Assert.assertTrue(agreeForm.isDisplayed(), "From is not displayed");
        agreeForm.clickAgreeButton();
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isDisplayed(), "Main page is not displayed");
        mainPage.clickLanguagesButton();
        mainPage.chooseLanguageAndClick(language);
        agreeForm.clickAgreeButton();
//        BrowserUtils.switchToNewTab();
//        mainPage.clickWorldButton();
//        WorldPage worldPage = new WorldPage();
//        Assert.assertTrue(worldPage.isDisplayed(), "World page is not displayed");
//        Assert.assertTrue(worldPage.isLogoTextEquals(), "Text is not equal");
//        worldPage.clickLogo();
//        Assert.assertTrue(mainPage.isDisplayed(), "Main page is not displayed");
        Thread.sleep(3_000);
    }
}
