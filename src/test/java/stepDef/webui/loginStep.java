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



}
