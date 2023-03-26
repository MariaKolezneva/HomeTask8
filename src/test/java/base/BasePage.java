package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;

import static page.LoginPage.setAuthorization;
import static page.LoginPage.openAuthorizationPage;


public class BasePage {

    public static void setConfiguration() {
        Configuration.browser = "chrome";
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
        Configuration.timeout = 60000;

    }
    public static void openMainPage() {
        setConfiguration();
        openAuthorizationPage();
        setAuthorization();
    }
    public static void closeBrowser() {
        WebDriverRunner.getWebDriver().quit();
        Selenide.closeWebDriver();
    }


}
