package stepDef.webui.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.webui.saucedemo.HomePageSauceDemo;


public class homePageSauceDemoStep {
    HomePageSauceDemo homePage;

    public void HomePageStep() {
        this.homePage = new HomePageSauceDemo();
    }

    @Then("Assert that the button change from add cart to remove")
    public void Assert_that_the_button_change_from_add_cart_to_remove() {
        HomePageSauceDemo.Assert_that_the_button_change_from_add_cart_to_remove();
    }


    @Then("user will able to see then details of product")
    public void user_will_able_to_see_then_details_of_product() {
        System.out.println("This step run properly");
    }

    @Given("user click label item product name")
    public void user_click_label_item_product_name() {
        HomePageSauceDemo.user_click_label_item_product_name();
    }

    @Then("user click button Add to cart")
    public void user_click_button_Add_to_cart() {
        HomePageSauceDemo.user_click_button_Add_to_cart();
    }

    @Then("user click label back to products then return to homepage")
    public void user_click_label_back_to_products_then_return_to_homepage() {
        HomePageSauceDemo.user_click_label_back_to_products_then_return_to_homepage();
    }

}

  
