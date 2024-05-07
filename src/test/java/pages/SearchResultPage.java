package pages;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{

    By textTitleItems = By.xpath("//span[@role='heading' and contains(text(),'Apple')]");
    public boolean verifyItemByIndexTitleEqualGiven(int i, String expectedRes) {
        return isTextEqual(getText(getElementByIndex(textTitleItems, i)), expectedRes);
    }
}
