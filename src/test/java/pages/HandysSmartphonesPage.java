package pages;

import org.openqa.selenium.By;
import testdata.TestDataSearch;

public class HandysSmartphonesPage extends BasePage{

    By btnApple = By.xpath("//div[@role='list']//div[contains(text(),'"+ TestDataSearch.PRODUCER +"')]");

    public void clickApple() {
        click(btnApple);
    }
}
