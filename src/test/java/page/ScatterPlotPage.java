package page;

import base.BasePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class ScatterPlotPage extends BasePage {
    public static final SelenideElement SCATTER_BUTTON = $x("(//div[@class='align-items-center d-flex modes__item-link' and @title='Scatter-plot'])");
    public static final SelenideElement SCATTER_DIAGRAM = $x("//div[@class='scatter-plot-container']");
    public static final SelenideElement X_ATTRIBUTE_FIELD = $x("//input[contains(@class, 'autocomplete-input') and @readonly and @title='Size']");
    public static final SelenideElement Y_ATTRIBUTE_FIELD = $x("//input[contains(@class, 'autocomplete-input') and @readonly and @title='Shortfall']");
    public static final SelenideElement INTERVALS_FIELD = $x("//input[contains(@class, 'autocomplete-input') and @title='2']");
    public static final List<SelenideElement> X_ATTRIBUTE_MENU = $$(By.xpath("//ul[@class='autocomplete-dropdown-item']")).filterBy(Condition.visible);
    public static final List<SelenideElement> Y_ATTRIBUTE_MENU = $$(By.xpath("//ul[@class='autocomplete-dropdown-item']")).filterBy(Condition.visible);
    public static final List<SelenideElement> INTERVALS_MENU = $$(By.xpath("//ul[@class='autocomplete-dropdown-item']"));

    public static void openScatterPlotPage() {
        SCATTER_BUTTON.shouldBe(visible);
        SCATTER_BUTTON.click();
    }

    public static SelenideElement getScatterDiagram() {
        return $(SCATTER_DIAGRAM);
    }

    public static List<SelenideElement> getX_AttributeMenu() {
        $(X_ATTRIBUTE_FIELD).click();
        return(X_ATTRIBUTE_MENU);
    }
    public static List<SelenideElement> getY_AttributeMenu() {
        $(Y_ATTRIBUTE_FIELD).click();
        return(Y_ATTRIBUTE_MENU);
    }

    public static List<SelenideElement> getIntervalsMenu() {
        $(INTERVALS_FIELD).click();
        return (INTERVALS_MENU);
    }
}
