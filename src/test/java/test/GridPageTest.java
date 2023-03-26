package test;

import org.junit.Test;
import testbase.BaseTest;

import static com.codeborne.selenide.Condition.visible;

import static page.GridPage.*;


public class GridPageTest extends BaseTest {
    @Test
    public void testCheckNameOfTable() {
        openGridPage();
        getGridHeaderTitles().shouldBe(visible);
    }

    @Test
    public void testCheckElementsOfTable() {
        openGridPage();
        getGridTableElements();
    }

}
