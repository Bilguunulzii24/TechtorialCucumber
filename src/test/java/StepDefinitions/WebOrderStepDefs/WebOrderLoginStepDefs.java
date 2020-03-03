package StepDefinitions.WebOrderStepDefs;

import Page.WebOrderPage.LoginPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class WebOrderLoginStepDefs {

    WebDriver driver = Driver.getDriver();
    LoginPage page = new LoginPage();

    @Given("the user navigate to the webOrders page")
    public void the_user_navigate_to_the_webOrders_page() {
        System.out.println("Navigated to WebOrder page");
        driver.get(ConfigReader.getProperty("url"));

    }

    @When("the user provide valid userName")
    public void the_user_provide_valid_userName() {
        System.out.println("The user sent Tester");
        page.userName.sendKeys(ConfigReader.getProperty("userName"));
    }

    @When("the user provide valid password")
    public void the_user_provide_valid_password() {
        System.out.println("The user sent text");

        page.password.sendKeys(ConfigReader.getProperty("password"));
        page.loginBtn.click();
    }

    @Then("the user should see home page")
    public void the_user_should_see_home_page() {
        System.out.println("The user validate the homepage");

        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }



}
