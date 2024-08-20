package stepDef.webui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.webui.HomePage;


public class homePageStep {
    HomePage homePage;

    public void HomePageStep() {
        this.homePage = new HomePage();
    }

    @Then("user click back from browser return to homepage")
    public void user_click_back_from_browser_return_to_homepage() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("Assert that the button change from add cart to remove")
    public void Assert_that_the_button_change_from_add_cart_to_remove() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user click the image of the product")
    public void user_click_the_image_of_the_product() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user will able to see then details of product")
    public void user_will_able_to_see_then_details_of_product() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Given("user click label item product name")
    public void user_click_label_item_product_name() {
        HomePage.user_click_label_item_product_name();
    }


}
