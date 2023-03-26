package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GridPage {
    public static final SelenideElement GRID_BUTTON = $x("(//div[@class='align-items-center d-flex modes__item-link' and @title='Grid & chart'])");
    public static final SelenideElement GRID_TABLE_HEADER = $x("//div[@class='app-title flex-1 widget__header']");
    public static final SelenideElement ORDERS = $x("//div[@class='app-title flex-1 widget__header']/../../..");
    public static final SelenideElement ORDER_TABLE_HEADER = $x("//div[@class='app-title flex-1 widget__header']");
    public static final SelenideElement ID_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Id')]/../../..");
    public static final SelenideElement TYPE_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Type')]/../../..");
    public static final SelenideElement INSTRUMENT_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Instrument')]/../../..");
    public static final SelenideElement SIDE_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Side')]/../../..");
    public static final SelenideElement START_TIME_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Start')]/../../..");
    public static final SelenideElement END_TIME_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'End')]/../../..");
    public static final SelenideElement EXEC_TYPE_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Exec')][contains(text(), 'type')]/../../..");
    public static final SelenideElement EXEC_SIZE_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Exec')][contains(text(), 'size')]/../../..");
    public static final SelenideElement SIZE_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Size')]/../../..");
    public static final SelenideElement SHORTFALL_COLUMN = $x("//span[@class='ag-header-cell-text'][contains(text(), 'Shortfall')]/../../..");
    public static final SelenideElement HORIZONTAL_SCROLL = $x("//div[@class='ag-body-horizontal-scroll-viewport']");

    public static void openGridPage() {
        GRID_BUTTON.shouldBe(visible);
        GRID_BUTTON.click();
    }

    public static SelenideElement getGridHeaderTitles() {
        return $(GRID_TABLE_HEADER);
    }

    public static void getGridTableElements() {
        $(ORDERS).shouldBe(visible);
        $(ORDER_TABLE_HEADER).shouldBe(visible);
        $(ID_COLUMN).shouldBe(visible);
        $(TYPE_COLUMN).shouldBe(visible);
        $(INSTRUMENT_COLUMN).shouldBe(visible);
        $(SIDE_COLUMN).shouldBe(visible);
        $(START_TIME_COLUMN).shouldBe(visible);
        $(END_TIME_COLUMN).shouldBe(visible);
        $(EXEC_TYPE_COLUMN).shouldBe(visible);
        $(EXEC_SIZE_COLUMN).shouldBe(visible);
        SelenideElement scroll = $(HORIZONTAL_SCROLL);
        executeJavaScript("arguments[0].scrollLeft +=1350", scroll);
        $(SIZE_COLUMN).shouldBe(visible);
        $(SHORTFALL_COLUMN).shouldBe(visible);
    }
}
