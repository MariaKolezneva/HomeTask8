package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import testbase.BaseTest;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static page.ScatterPlotPage.*;

public class ScatterPlotPageTest extends BaseTest {
    @Test
    public void testGetHistogram() {
        openScatterPlotPage();
        getScatterDiagram().shouldBe(visible);
    }
    @Test
    public void testGetX_AttributeMenu() {
        openScatterPlotPage();
        List<String> expectedX_AttributeMenu = Arrays.asList("Avg fill price","Exec size","Num of executions","Price","Size","Execution price volatility","Permanent market impact", "Realized market impact", "Participation rate","Shortfall","Multiplier","Tick size");
        List<SelenideElement> actualX_AttributeMenu = getX_AttributeMenu();
        for (SelenideElement element : actualX_AttributeMenu) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualX_AttributeMenu) {
            String expectedValue = expectedX_AttributeMenu.get(actualX_AttributeMenu.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        List<String> expectedX_AttributeMenu2 = Arrays.asList("Permanent market impact", "Realized market impact", "Participation rate","Shortfall","Multiplier","Tick size","Currency code","Sequence number","Db sequence number","Benchmark price","Price imp. (ticks)","Price imp. (amount)");
        List<SelenideElement> actualX_AttributeMenu2 = getX_AttributeMenu();
        for (SelenideElement element : actualX_AttributeMenu2) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualX_AttributeMenu2) {
            String expectedValue = expectedX_AttributeMenu2.get(actualX_AttributeMenu2.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
    }
    @Test
    public void testGetY_AttributeMenu() {
        openScatterPlotPage();
        List<String> expectedY_AttributeMenu = Arrays.asList("Avg fill price","Exec size","Num of executions","Price","Size","Execution price volatility","Permanent market impact", "Realized market impact", "Participation rate","Shortfall","Multiplier","Tick size");
        List<SelenideElement> actualY_AttributeMenu = getY_AttributeMenu();
        for (SelenideElement element : actualY_AttributeMenu) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualY_AttributeMenu) {
            String expectedValue = expectedY_AttributeMenu.get(actualY_AttributeMenu.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
        Selenide.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);");
        List<String> expectedY_AttributeMenu2 = Arrays.asList("Permanent market impact", "Realized market impact", "Participation rate","Shortfall","Multiplier","Tick size","Currency code","Sequence number","Db sequence number","Benchmark price","Price imp. (ticks)","Price imp. (amount)");
        List<SelenideElement> actualY_AttributeMenu2 = getY_AttributeMenu();
        for (SelenideElement element : actualY_AttributeMenu2) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualY_AttributeMenu2) {
            String expectedValue = expectedY_AttributeMenu2.get(actualY_AttributeMenu2.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
    }
    @Test
    public void testGetIntervalsMenu() {
        openScatterPlotPage();
        List<String> expectedIntervalsMenu = Arrays.asList("5", "10", "25","50");
        List<SelenideElement> actualIntervalsMenu = getIntervalsMenu();
        for (SelenideElement element : actualIntervalsMenu) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualIntervalsMenu) {
            String expectedValue = expectedIntervalsMenu.get(actualIntervalsMenu.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }

    }

}
