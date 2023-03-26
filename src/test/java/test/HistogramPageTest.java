package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import testbase.BaseTest;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static page.HistogramPage.*;

public class HistogramPageTest extends BaseTest {

    @Test
    public void testGetHistogram() {
        openHistogramPage();
        getHistogram().shouldBe(visible);
    }
    @Test
    public void testGetAttributeMenu() {
        openHistogramPage();
        List<String> expectedAttributeMenu = Arrays.asList("Avg fill price","Exec size","Num of executions","Price","Size","Execution price volatility","Permanent market impact", "Realized market impact", "Participation rate","Shortfall","Multiplier","Tick size");
        List<SelenideElement> actualAttributeMenu = getAttributeMenu();
        for (SelenideElement element : actualAttributeMenu) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualAttributeMenu) {
            String expectedValue = expectedAttributeMenu.get(actualAttributeMenu.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        List<String> expectedAttributeMenu2 = Arrays.asList("Permanent market impact", "Realized market impact", "Participation rate","Shortfall","Multiplier","Tick size","Currency code","Sequence number","Db sequence number","Benchmark price","Price imp. (ticks)","Price imp. (amount)");
        List<SelenideElement> actualAttributeMenu2 = getAttributeMenu();
        for (SelenideElement element : actualAttributeMenu2) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualAttributeMenu2) {
            String expectedValue = expectedAttributeMenu2.get(actualAttributeMenu2.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
    }

    @Test
    public void testGetIntervalMenu() {
        openHistogramPage();
        List<String> expectedIntervalMenu = Arrays.asList("5", "10", "25","50");
        List<SelenideElement> actualIntervalMenu = getIntervalMenu();
        for (SelenideElement element : actualIntervalMenu) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualIntervalMenu) {
            String expectedValue = expectedIntervalMenu.get(actualIntervalMenu.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }

    }
}
