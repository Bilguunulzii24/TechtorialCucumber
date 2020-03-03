package StepDefinitions.WebOrderStepDefs;

import Page.WebOrderPage.ViewAllOrdersPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ListOfAllOrdersStepDefs {

    ViewAllOrdersPage page = new ViewAllOrdersPage();


    @Then("the user click view all orders button")
    public void the_user_click_view_all_orders_button() {
        page.clickViewAllOrders.click();

    }

    @Then("the user validate the header text {string}")
    public void the_user_validate_the_header_text(String header) {

        String actualHeader = page.validateHeader.getText();
        Assert.assertEquals(actualHeader,header);
    }
}
