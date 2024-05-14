package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.TestDataSearch;
import utils.ConfigProperties;

public class SearchTests extends BaseTest {

    @Test
    public void searchPage() {
        // TODO -, waits
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

    @Test
    public void searchPageProperties() {
        homePage.clickOnElectonik();
        elektronikPage.clickSmartphones();
        handysSmartphonesPage.clickApple();
        String res = applePage
                .getTextItemTitleInSearchResultByIndex(Integer.parseInt(ConfigProperties.getProperty("GET_ELEMENT_WITH_INDEX_IN_STORE")));
        applePage.fillSearchForm(res);
        System.out.println(ConfigProperties.getProperty("GET_ELEMENT_WITH_INDEX_IN_SEARCH_RESULT"));
        Assert.assertTrue(searchResultPage
                .verifyItemByIndexTitleEqualGiven(Integer.parseInt(ConfigProperties.getProperty("GET_ELEMENT_WITH_INDEX_IN_SEARCH_RESULT"))
                        , res));
    }
}
