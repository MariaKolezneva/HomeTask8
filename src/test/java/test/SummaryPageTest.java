package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import testbase.BaseTest;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static page.SummaryPage.*;

public class SummaryPageTest extends BaseTest {


    @Test
    public void testTableAlgoPerformance() {
        getNameAlgoPerformance().shouldBe(visible);
        getWidgetAlgoPerformance().shouldBe(visible);

    }

    @Test
    public void testCheckHeaderTitlesDisplayed() {
        List<String> expectedTitles = Arrays.asList("All", "Negative", "Positive");
        List<SelenideElement> actualTitles = getHeaderTitlesElements();
        for (SelenideElement element : actualTitles) {
            element.shouldBe(visible);
        }
        for (SelenideElement title : actualTitles) {
            String expectedTitle = expectedTitles.get(actualTitles.indexOf(title));
            title.shouldHave(Condition.text(expectedTitle));
        }
    }
    @Test
    public void testCheckLineNamesDisplayed() {
        List<String> expectedLines = Arrays.asList("ICEBERG", "PVOL", "TWAP");
        List<SelenideElement> actualLines = getLineNamesElements();
        for (SelenideElement element : actualLines) {
            element.shouldBe(visible);
        }
        for (SelenideElement line : actualLines) {
            String expectedLine = expectedLines.get(actualLines.indexOf(line));
            line.shouldHave(Condition.text(expectedLine));
        }
    }
    @Test
    public void testCheckStringValuesDisplayed() {
        List<String> expectedValues = Arrays.asList("16,915", "16,351", "157","15,721","8,631","6,861","16,770","8,489","8,090");
        List<SelenideElement> actualValues = getStringValuesOfTable();
        for (SelenideElement element : actualValues) {
            element.shouldBe(visible);
        }
        for (SelenideElement value : actualValues) {
            String expectedValue = expectedValues.get(actualValues.indexOf(value));
            value.shouldHave(Condition.attribute(expectedValue));
        }
    }

    }


