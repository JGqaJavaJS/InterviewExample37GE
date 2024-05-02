package pages;

import org.openqa.selenium.By;

public class HandysSmartphonesPage extends BasePage{

    By btnApple = By.xpath("//div[@role='list']//div[contains(text(),'Apple')]");

    public void clickApple() {
        click(btnApple);
    }
}
