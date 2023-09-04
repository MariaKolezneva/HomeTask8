package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GridPage {
    public static final SelenideElement GRID_BUTTON = $x("(//div[@class='align-items-center d-flex modes__item-link' and @title='Grid & chart'])");
    public static final SelenideElement GRID_TABLE_HEADER = $x("//div[@class='app-title flex-1 widget__header']");
    public static final SelenideElement ORDERS = $x("//div[@class='d-flex flex-column h-100 p-2 w-100 widget']");
    public static final SelenideElement ORDER_TABLE_HEADER = $x("//div[@class='app-title flex-1 widget__header']");
    public static final SelenideElement ID_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='orderId']");
    public static final SelenideElement TYPE_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='orderType']");
    public static final SelenideElement INSTRUMENT_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='orderInstrument']");
    public static final SelenideElement SIDE_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='orderSide']");
    public static final SelenideElement START_TIME_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='startTime']");
    public static final SelenideElement END_TIME_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='endTime']");
    public static final SelenideElement EXEC_TYPE_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='orderStatus']");
    public static final SelenideElement EXEC_SIZE_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='executedSize']");
    public static final SelenideElement SIZE_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='orderSize']");
    public static final SelenideElement SHORTFALL_COLUMN = $x("//div[@class='ag-header-cell ag-header-cell-sortable' and @col-id='shortFall']");
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
