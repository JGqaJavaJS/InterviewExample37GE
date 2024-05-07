package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.TestDataSearch;

public class SearchTests extends BaseTest {

    @Test
    public void searchPage() {
        // TODO - Listener, properties, waits
        homePage.clickOnElectonik();
        elektronikPage.clickSmartphones();
        handysSmartphonesPage.clickApple();
        String res = applePage
                .getTextItemTitleInSearchResultByIndex(TestDataSearch.GET_ELEMENT_WITH_INDEX_IN_STORE);
        applePage.fillSearchForm(res);
        Assert.assertTrue(searchResultPage
                .verifyItemByIndexTitleEqualGiven(TestDataSearch.GET_ELEMENT_WITH_INDEX_IN_SEARCH_RESULT
                        , res));
    }
}
