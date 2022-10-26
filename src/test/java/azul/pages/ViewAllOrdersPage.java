package azul.pages;

import azul.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ViewAllOrdersPage extends azul.pages.BasePage {

    public ViewAllOrdersPage(){
        PageFactory.initElements(azul.utilities.Driver.getDriver(), this);
    }

    //we need to locate the first cell of the first row
    @FindBy(xpath = "//table[@class='table is-fullwidth']/tbody/tr[1]/td[1]")
    public WebElement newCustomerCell;



}
