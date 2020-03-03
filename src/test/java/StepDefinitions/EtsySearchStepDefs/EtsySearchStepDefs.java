package StepDefinitions.EtsySearchStepDefs;

import Page.EtsyPage.EtsySearchPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class EtsySearchStepDefs {

    WebDriver driver = Driver.getDriver();
    EtsySearchPage page = new EtsySearchPage();
    @Given("The user navigate to the webPage")
    public void the_user_navigate_to_the_webPage() {
        driver.get(ConfigReader.getProperty("etsyUrl"));

    }

    @Then("The user search for wooden spoon")
    public void the_user_search_for_wooden_spoon() {
        page.searchInput.sendKeys("Wooden spoon");
        page.searchButton.click();


    }

    @Then("The user validate the title {string}")
    public void the_user_validate_the_title(String expectedTitle) {

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }

    @Then("The user search for make up organizer")
    public void the_user_search_for_make_up_organizer() {
        page.searchInput.sendKeys("Make up organizer");
        page.searchButton.click();
    }





}
