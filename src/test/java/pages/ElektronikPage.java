package pages;

import org.openqa.selenium.By;

public class ElektronikPage extends BasePage{

    By btnSmartphones = By.xpath("//div[text()='Handys & Smartphones']");

    public void clickSmartphones() {
        click(btnSmartphones);
    }
}
