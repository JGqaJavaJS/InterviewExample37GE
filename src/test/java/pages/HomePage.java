package pages;

import org.openqa.selenium.By;
import testdata.TestDataSearch;

public class HomePage extends BasePage{

    By btnElectronik =
            By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[text()='" + TestDataSearch.DEPARTMENT_LEVEL_1 + "']");

    public void clickOnElectonik() {
        click(btnElectronik);
    }
}
