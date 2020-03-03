package Page.EtsyPage;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {
    public EtsySearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='wt-input-btn-group__btn']")
    public  WebElement searchButton;




}
