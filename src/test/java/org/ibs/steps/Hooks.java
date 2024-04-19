package org.ibs.steps;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.security.auth.login.Configuration;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver;
    @Before
    public static void Before () throws Exception {
        System.setProperty("REMOTE", "true");

        String browser = System.getProperty("type.browser");
        String browserVersion = System.getProperty("version.browser");

        if (Boolean.parseBoolean (System.getProperty ("REMOTE"))) {
            DesiredCapabilities capabilities = new DesiredCapabilities ();
            capabilities.setCapability ("browserName", browser);
            capabilities.setCapability ("browserVersion", browserVersion);
            capabilities.setCapability ("selenoid:options", Map.<String, Object>of (
                    "enableVNC", true,
                    "enableVideo", false
            ));
            driver = new RemoteWebDriver(
                    new URL("http://149.154.71.152:4444/wd/hub"),
                    capabilities


            );
        } else {
            System.setProperty ("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();

        }
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        driver.manage ().window ().maximize ();
        driver.get ("http://149.154.71.152:8080/");

    }

}
