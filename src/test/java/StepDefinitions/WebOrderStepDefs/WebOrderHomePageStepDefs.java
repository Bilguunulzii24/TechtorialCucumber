package StepDefinitions.WebOrderStepDefs;

import Page.WebOrderPage.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebOrderHomePageStepDefs {

    HomePage page = new HomePage();

    @Then("the user validate order menu list")
    public void the_user_validate_order_menu_list() {

        List<String> expected = page.orderMenuData();

        List<String> actual = new ArrayList<>();

        for(WebElement element:page.orderMenu){
            actual.add(element.getText());
        }

        for(int i=0; i<actual.size();i++){

            Assert.assertEquals(expected.get(i),actual.get(i));
        }

        System.out.println("This is for menu");

    }
}
