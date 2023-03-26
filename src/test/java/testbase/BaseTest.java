package testbase;

import org.junit.After;
import org.junit.Before;

import static base.BasePage.closeBrowser;
import static base.BasePage.openMainPage;

public class BaseTest {
    @Before
    public void setUp() {
        openMainPage();
    }

    @After
    public void close() {
        closeBrowser();

    }
}
