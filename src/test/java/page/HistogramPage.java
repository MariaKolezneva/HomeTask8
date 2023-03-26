package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import testbase.BaseTest;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class HistogramPage extends BaseTest {
    public static final SelenideElement HISTOGRAM_BUTTON = $x("(//div[@class='align-items-center d-flex modes__item-link' and @title='Histogram'])");
    public static final SelenideElement HISTOGRAM = $x("//div[@class='histogram-container']");
    public static final SelenideElement ATTRIBUTE_FIELD = $x("//input[contains(@class, 'autocomplete-input') and @readonly and @title='Price imp. (amount)']");

    public static final List<SelenideElement> ATTRIBUTE_MENU = $$(By.xpath("//ul[@class='autocomplete-dropdown-item']")).filterBy(Condition.visible);
    public static final SelenideElement INTERVAL_FIELD = $x("//input[contains(@class, 'autocomplete-input') and @title='10']");
    public static final List<SelenideElement> INTERVAL_MENU = $$(By.xpath("//ul[@class='autocomplete-dropdown-item']"));

    public static void openHistogramPage() {
        HISTOGRAM_BUTTON.shouldBe(visible);
        HISTOGRAM_BUTTON.click();
    }

    public static SelenideElement getHistogram() {
        return $(HISTOGRAM);
    }

    public static List<SelenideElement> getAttributeMenu() {
        $(ATTRIBUTE_FIELD).click();
        return(ATTRIBUTE_MENU);
    }

    public static List<SelenideElement> getIntervalMenu() {
        $(INTERVAL_FIELD).click();
        return (INTERVAL_MENU);
    }


}
