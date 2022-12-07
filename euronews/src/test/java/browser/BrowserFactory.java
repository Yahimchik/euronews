package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import utils.ConfigManager;

public enum BrowserFactory {
    CHROME {
        public WebDriver createDriver() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver(getOptions());
        }

        private ChromeOptions getOptions() {
            ChromeOptions chromeOptions = new ChromeOptions();
            if (ConfigManager.getBoolean("maximized")) {
                chromeOptions.addArguments("--start-maximized");
            }
            chromeOptions.addArguments("--lang=" + ConfigManager.getString("language"));
            if (ConfigManager.getBoolean("incognito")) {
                chromeOptions.addArguments("--incognito");
            }

            return chromeOptions;
        }
    },

    FIREFOX {
        public WebDriver createDriver() {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver(getOptions());
        }

        private FirefoxOptions getOptions() {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            if (ConfigManager.getBoolean("maximized")) {
                firefoxOptions.addArguments("--start-maximized");
            }
            firefoxOptions.addArguments("--lang=" + ConfigManager.getString("language"));
            if (ConfigManager.getBoolean("incognito")) {
                firefoxOptions.addArguments("--incognito");
            }
            return firefoxOptions;
        }
    },

    EDGE {
        public WebDriver createDriver() {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver(getOptions());
        }

        private EdgeOptions getOptions() {
            EdgeOptions edgeOptions = new EdgeOptions();
            if (ConfigManager.getBoolean("maximized")) {
                edgeOptions.addArguments("--start-maximized");
            }
            edgeOptions.addArguments("--lang=" + ConfigManager.getString("language"));
            if (ConfigManager.getBoolean("incognito")) {
                edgeOptions.addArguments("--incognito");
            }
            return edgeOptions;
        }
    },

    SAFARI {
        public WebDriver createDriver() {
            WebDriverManager.safaridriver().setup();
            return new SafariDriver(getOptions());
        }

        private SafariOptions getOptions() {
            SafariOptions safariOptions = new SafariOptions();
            safariOptions.setAutomaticInspection(false);

            return safariOptions;
        }
    };

    public static WebDriver setDriver() {
        return switch (ConfigManager.getString("browser")) {
            case "chrome" -> BrowserFactory.CHROME.createDriver();
            case "firefox" -> BrowserFactory.FIREFOX.createDriver();
            case "edge" -> BrowserFactory.EDGE.createDriver();
            case "safari" -> BrowserFactory.SAFARI.createDriver();
            default -> throw new IllegalArgumentException("Incorrect BrowserName");
        };
    }

    public abstract WebDriver createDriver();
}
