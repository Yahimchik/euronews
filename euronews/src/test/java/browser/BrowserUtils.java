package browser;

import logger.LoggerUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void close() {
        LoggerUtils.info("Close current tab");
        Browser.getInstance().close();
    }

    public static Alert switchToAlert() {
        LoggerUtils.info("Switch to alert");
        return Browser.getInstance().switchTo().alert();
    }

    public static String getAlertText() {
        LoggerUtils.info("Get alert text");
        return switchToAlert().getText();
    }

    public static void acceptAlert() {
        LoggerUtils.info("Accept alert");
        switchToAlert().accept();
    }

    public static void sendKeysToAlert(String name) {
        LoggerUtils.info("Send keys to alert");
        switchToAlert().sendKeys(name);
    }

    public static void switchToFrame(String name) {
        LoggerUtils.info("Switch to frame");
        Browser.getInstance().switchTo().frame(name);
    }

    public static void switchToFrame(By element) {
        LoggerUtils.info("Switch to frame");
        Browser.getInstance().switchTo()
                .frame(Browser.getInstance()
                        .findElement(element));
    }

    public static void switchToMainFrame() {
        LoggerUtils.info("Open main frame");
        Browser.getInstance().switchTo()
                .window(Browser.getInstance().getWindowHandle());
    }

    public static void switchToNewTab() {
        LoggerUtils.info("Switch to new tab");
        List<String> tabs = new ArrayList<>(
                Browser.getInstance().getWindowHandles());
        Browser.getInstance()
                .switchTo()
                .window(tabs.get(tabs.size() - 1));
    }
}
