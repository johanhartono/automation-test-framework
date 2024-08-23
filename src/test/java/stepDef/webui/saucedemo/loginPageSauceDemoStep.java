package stepDef.webui.saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.webui.saucedemo.LoginPageSauceDemo;

public class loginPageSauceDemoStep {

    @Given("Open web saucedemo login page")
    public void Open_web_login_page() {
        LoginPageSauceDemo.openBrowser();
    }

    @Then("saucedemo user input username {string}")
    public void user_input_username(String username) {
        LoginPageSauceDemo.user_input_username(username);
    }

    @Then("saucedemo user input password {string}")
    public void user_input_password(String pwd) {
        LoginPageSauceDemo.user_input_password(pwd);
    }

    @Then("saucedemo user click login button And user will redirect to homepage")
    public void user_click_login_button_And_user_will_redirect_to_homepage() {
        LoginPageSauceDemo.user_click_login_button();
    }

    @Then("saucedemo user click hamburger icon on top on the left")
    public void user_click_hamburger_icon() {
        LoginPageSauceDemo.user_click_hamburger_icon();
    }

    @Then("saucedemo user logout from system and return to login page")
    public void user_logout_from_system() {
        LoginPageSauceDemo.user_logout_from_system();
    }

    @Then("saucedemo user will not be able to login")
    public void user_will_not_be_able_to_login() {
        System.out.println("user will not be able to login");
    }

    @Then("saucedemo user click login button  will not be able to login")
    public void user_click_login_button_will_not_be_able_to_login() {
        LoginPageSauceDemo.user_click_login_button();
    }






}
