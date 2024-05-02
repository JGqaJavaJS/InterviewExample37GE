package tests;

import org.testng.annotations.Test;
import pages.ApplePage;
import pages.BasePage;

public class SearchTests extends BaseTest {

    @Test
    public void searchPage() throws InterruptedException {
        // TODO - how to add params in locator, write assert and user TestDataApple
        homePage.clickOnElectonik();
        elektronikPage.clickSmartphones();
        handysSmartphonesPage.clickApple();
        String res = applePage.getTextItemTitleInSearchResultByIndex(1);
        applePage.fillSearchForm(res);
        Thread.sleep(10000);
    }
}
