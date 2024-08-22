// Date Created         : 22 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 22 August 2024

package stepDef.api.reqresapi;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.api.reqresapi.ApiReqresPage;
import helper.EndPoint;

public class ApiReqresStep {
    ApiReqresPage apiReqresPage;
    EndPoint endPoint;
    public ApiReqresStep() {
        this.apiReqresPage = new ApiReqresPage();
    }
  
    @Given("prepare url reqresapi for {string}")
    public void prepare_url_reqresapi_for(String url) {
        apiReqresPage.prepareURLfakeRestAPI(url);
    }
    @Given("hit reqresapi get list users")
    public void hit_reqresapi_get_list_users() {
        apiReqresPage.hit_api_get_list_users();
    }
    @Given("hit reqresapi create new user")
    public void hit_reqresapi_create_new_user() {
        apiReqresPage.hit_api_post_create_new_user();
    }

    @Then("validation reqresapi status code is equals {int}")
    public void validation_reqresapi_status_code_is_equals(int i) {
        apiReqresPage.validation_status_code_is_equals(i);
    }
    @Then("validation reqresapi response json with JSONSchema {string}")
    public void validation_reqresapi_response_json_with_JSONSchema(String filename) {
        apiReqresPage.validation_response_json_with_JSONSchema(filename);
    }

    @Given("hit reqresapi update user")
    public void hit_reqresapi_update_user() {
        apiReqresPage.hit_api_update_user();
    }

    @Given("hit reqresapi delete user")
    public void hit_reqresapi_delete_user() {
        apiReqresPage.hit_api_delete_user();
    }




}
