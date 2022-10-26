package azul.pages;

import azul.utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(azul.utilities.Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;

    @FindBy(id = "firstHeading")
    public WebElement mainHeader;


}
