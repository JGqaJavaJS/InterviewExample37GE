package pages;

import org.openqa.selenium.By;
import testdata.TestDataSearch;

public class ElektronikPage extends BasePage{

    By btnSmartphones = By.xpath("//div[text()='"+ TestDataSearch.SECTION +"']");

    String add = "";
    By exampleAddVarInLocator = By.xpath("//*["+add+"]");
    public void experimentLocator(String text) {
        add = text;
        // some selenium action
    }
    public void clickSmartphones() {
        click(btnSmartphones);
    }
}
