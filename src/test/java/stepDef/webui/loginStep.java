package stepDef.webui;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.webui.LoginPage;

public class loginStep {
    LoginPage loginPage;

    public void LoginStep() {
        this.loginPage = new LoginPage();
    }

    @Given("Open web login page")
    public void Open_web_login_page() {
        LoginPage.openBrowser();
    }

    @Then("user input username {string}")
    public void user_input_username(String username) {
        LoginPage.user_input_username(username);
    }

    @Then("user input password {string}")
    public void user_input_password(String pwd) {
        LoginPage.user_input_password(pwd);
    }

    @Then("user click login button And user will redirect to homepage")
    public void user_click_login_button_And_user_will_redirect_to_homepage() {
        LoginPage.user_click_login_button();
    }

    @Then("user click hamburger icon on top on the left")
    public void user_click_hamburger_icon() {
        LoginPage.user_click_hamburger_icon();
    }

    @Then("user logout from system and return to login page")
    public void user_logout_from_system() {
        LoginPage.user_logout_from_system();
    }

    @Then("user will not be able to login")
    public void user_will_not_be_able_to_login() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user click login button  will not be able to login")
    public void user_click_login_button_will_not_be_able_to_login() {
        LoginPage.user_click_login_button();
    }

    @Then("user click button Add to cart")
    public void user_click_button_Add_to_cart() {
        // Write code here that turns the phrase above into concrete actions
    }





}
