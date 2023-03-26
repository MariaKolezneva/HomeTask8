package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static base.BasePage.closeBrowser;
import static base.BasePage.setConfiguration;
import static com.codeborne.selenide.Condition.visible;
import static page.LoginPage.*;


public class LoginPageTest {
    @Before
    public void open() {
        setConfiguration();
        openAuthorizationPage();
    }

    @Test
    public void testAuthorizationSuccessful() {
        setAuthorization();
        getMainPage().shouldBe(visible);
    }

    @Test
    public void testAuthorizationWrongLogin() {
        setWrongLogin();
        getFailedMassage();
    }

    @Test
    public void testAuthorizationWrongPassword() {
        setWrongPassword();
        getFailedMassage();
    }

    @Test
    public void testAuthorizationWrongNameAndPassword() {
        setWrongNameAndPassword();
        getFailedMassage();
    }

    @After
    public void close() {
        closeBrowser();
    }
}



