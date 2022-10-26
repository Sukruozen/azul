package azul.pages;

import azul.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class AzulBase {
    public AzulBase(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    /*
    Feature test execution yukarıda,
        test case Scenario'da, numaraları kopyala yapıştır,
         given when then leri de kopyalayıp Jira'da
     */
}
