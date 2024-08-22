// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 19 August 2024

package stepDef.api.fakerestapi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.api.fakerestapi.ApifakerestPage;
import helper.EndPoint;

public class ApiFakerestStep {
    ApifakerestPage ApifakerestPage;
    EndPoint endPoint;
    public ApiFakerestStep() {
        this.ApifakerestPage = new ApifakerestPage();
    }
  
    @Given("prepare url for {string}")
    public void prepare_url_for(String url) {
        ApifakerestPage.prepareURLfakeRestAPI(url);
    }

    @Then("hit api get list users")
    public void hit_api_get_list_users() {
        ApifakerestPage.hit_api_get_list_users();
    }
    @Then("hit api post create new user")
    public void hit_api_post_create_new_user() {
        ApifakerestPage.hit_api_post_create_new_user();
    }
    @Then("hit api delete user")
    public void hit_api_delete_user() {
        ApifakerestPage.hit_api_delete_user();
    }
 
    @Then("validation status code is equals {int}")
    public void validation_status_code_is_equals(int status_code) {
        ApifakerestPage.validation_status_code_is_equals(status_code);
    }


    @Then("validation response body get list users")
    public void validation_response_body_get_list_users() {
        ApifakerestPage.validation_response_body_get_list_users();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validation_response_json_with_JSONSchema(String filename) {
        ApifakerestPage.validation_response_json_with_JSONSchema(filename);
    }

    @Then("validation response body post create new  user")
    public void validation_response_body_post_create_new_users() {
        ApifakerestPage.validation_response_body_post_create_new_users();
    }

    @Then("validation response body update  user")
    public void validation_response_body_update_user() {
        ApifakerestPage.validation_response_body_update_user();
    }

    @Given("hit api patch update user")
    public void hit_api_patch_update_user() {
        ApifakerestPage.hit_api_patch_update_user();
    }

 



   




  




}
