package stepDef.webui.demoblaze;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.webui.demoblaze.LoginPageDemoBlaze;

public class loginPageDemoBlazeStep {
    @Given("Open web demoblaze login page")
    public void Open_web_login_page() {
        LoginPageDemoBlaze.openBrowser();
    }
    @Then("demoblaze user click menu Log In")
    public void demoblaze_user_click_menu_Log_In() {
        LoginPageDemoBlaze.user_click_login_button();
    }
    
    @Then("demoblaze user input username {string}")
    public void user_input_username(String username) {
        LoginPageDemoBlaze.user_input_username(username);
    }

    @Then("demoblaze user input password {string}")
    public void user_input_password(String pwd) {
        LoginPageDemoBlaze.user_input_password(pwd);
    }

    @Then("demoblaze user click login button And user will redirect to homepage")
    public void user_click_login_button_And_user_will_redirect_to_homepage() {
        LoginPageDemoBlaze.user_click_login_button();
    }


}
