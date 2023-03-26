package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;


public class SummaryPage {
    public static final SelenideElement ALGO_PERFORMANCE = $x("//div[@class='app-title flex-1 widget__header' and text()='Algo Performance']");
    public static final SelenideElement WIDGET = $x("(//div[@class='widget-icon' and @title='Expand'])[2]");
    private static final List<SelenideElement> HEADER_TITLES = $$(By.xpath("//div[contains(@class, 'simple-table__row simple-table__row_grid-template-columns-4')]//div[contains(@class, 'text-right simple-table__header-title')]"));
    private static final List<SelenideElement> LINE_NAMES = $$(By.xpath("//div[contains(@class, 'simple-table__grid')]//div[contains(@class, 'simple-table__row simple-table__row_grid-template-columns')]//div[contains(@class, 'pl-1 simple-table__row-value')]"));
    private static final List<SelenideElement> STRING_VALUES = $$(By.xpath("//div[contains(@class, 'simple-table__grid')]//div[contains(@class, 'simple-table__subgrid')]//div[contains(@class, 'text-right simple-table__row-value')]"));

    public static SelenideElement getNameAlgoPerformance() {
        return $(ALGO_PERFORMANCE);
    }

    public static SelenideElement getWidgetAlgoPerformance() {
        return $(WIDGET);
    }

    public static List<SelenideElement> getHeaderTitlesElements() {
        return HEADER_TITLES;
    }

    public static List<SelenideElement> getLineNamesElements() {
        return LINE_NAMES;
    }

    public static List<SelenideElement> getStringValuesOfTable() {
        return STRING_VALUES;
    }

}




