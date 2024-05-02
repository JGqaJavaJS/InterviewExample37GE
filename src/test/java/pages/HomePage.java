package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    By btnElectronik =
            By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[text()='Elektronik']");

    public void clickOnElectonik() {
        click(btnElectronik);
    }
}
