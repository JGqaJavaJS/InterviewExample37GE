package pages;

import org.openqa.selenium.By;

public class ApplePage extends BasePage{

    By allItemsTitleH3SearchResult = By.xpath("//h3[@class='s-item__title']");

    By inputSearch = By.xpath("//input[@aria-autocomplete='list']");
    By btnSubmit = By.xpath("//input[@type='submit']");

    public String getTextItemTitleInSearchResultByIndex(int index) {
        return getText(getElementByIndex(allItemsTitleH3SearchResult, index));
    }

    public void fillSearchForm(String text) {
        sendText(inputSearch, text);
        click(btnSubmit);
    }
}
