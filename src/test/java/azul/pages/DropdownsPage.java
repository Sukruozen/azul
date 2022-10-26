package azul.pages;

import azul.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class DropdownsPage {

    public DropdownsPage(){
        PageFactory.initElements(azul.utilities.Driver.getDriver(), this);
    }

    @FindBy(id = "month")
    public WebElement monthDropdown;

}
