package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static final String LOGIN_PAGE_URL = "http://app.tca.deltixuat.com";
    private static final String LOGIN = "selenium_chrome";
    private static final String PASSWORD_USER = "Axa@Demo";
    private static final SelenideElement USERNAME = $x("//input[@formcontrolname='username']");
    private static final SelenideElement PASSWORD = $x("//input[@formcontrolname='password']");
    private static final SelenideElement SIGN_IN = $x("//button[@type='submit']");
    private static final SelenideElement MAIN_PAGE = $x("//div[@class='d-flex h-100 flex-column p-2']");
    private static final SelenideElement FAILED_MESSAGE = $x("//div[@role='alert' and @class='alert alert-danger alert-dismissible']");

    public static void openAuthorizationPage() {
        open(LOGIN_PAGE_URL);
    }

    public static void setAuthorization() {
        $(USERNAME).shouldBe(visible).sendKeys(LOGIN);
        $(PASSWORD).shouldBe(visible).sendKeys(PASSWORD_USER);
        SIGN_IN.click();
    }
    public static void setWrongLogin() {
        $(USERNAME).shouldBe(visible).sendKeys("selenium");
        $(PASSWORD).shouldBe(visible).sendKeys(PASSWORD_USER);
        SIGN_IN.click();
    }
    public static void setWrongPassword() {
        $(USERNAME).shouldBe(visible).sendKeys(LOGIN);
        $(PASSWORD).shouldBe(visible).sendKeys("axademo");
        SIGN_IN.click();
    }
    public static void setWrongNameAndPassword() {
        $(USERNAME).shouldBe(visible).sendKeys("selenium");
        $(PASSWORD).shouldBe(visible).sendKeys("axademo");
        SIGN_IN.click();
    }

    public static SelenideElement getMainPage() {
        return $(MAIN_PAGE);
    }
    public static SelenideElement getFailedMassage() {
        return $(FAILED_MESSAGE);
    }
}
