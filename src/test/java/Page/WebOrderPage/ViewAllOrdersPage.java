package Page.WebOrderPage;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage {

    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement clickViewAllOrders;

    @FindBy(xpath = "//h2")
    public WebElement validateHeader;
}
