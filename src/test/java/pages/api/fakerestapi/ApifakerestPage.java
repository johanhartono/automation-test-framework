// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 19 August 2024

package pages.api.fakerestapi;

import helper.Utility;
import helper.Models.api.fakerestapi.Modelsfakerestapi;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static helper.Models.api.fakerestapi.Modelsfakerestapi.deleteUser;
import static helper.Models.api.fakerestapi.Modelsfakerestapi.getListUsers;
import static helper.Models.api.fakerestapi.Modelsfakerestapi.postCreateUser;
import static helper.Models.api.fakerestapi.Modelsfakerestapi.updatePatchUser;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import java.io.File;


public class ApifakerestPage {
    String setURL, global_id;
    Response res;

   
    public void prepareURLfakeRestAPI(String Url) {
        switch (Url) {
            case "GET_LIST_USERS":
                setURL = Modelsfakerestapi.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = Modelsfakerestapi.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = Modelsfakerestapi.DELETE_USERS;
                break;
            case "PUT_UPDATE_USERS":
                setURL = Modelsfakerestapi.PUT_UPDATE_USERS;
                break;
            case "PATCH_UPDATE_USERS":
                setURL = Modelsfakerestapi.PATCH_UPDATE_USERS;
                break;
            default:
                setURL = "Please input right Url";
                System.out.println(setURL);

        }
        System.out.println("End Point target : " + setURL);
    }

    // GET
    public void hit_api_get_list_users() {
        res = getListUsers(setURL);
        System.out.println(res.getBody().asPrettyString());
        // POST
    }
    //POST
    public void hit_api_post_create_new_user() {
        res = postCreateUser(setURL);
        System.out.println(res.getBody().asPrettyString());
    }

    // DELETE
    public void hit_api_delete_user() {
        res = deleteUser(setURL, global_id);
        System.out.println(res.getBody().asPrettyString());
    }

    // PATCH
    public void hit_api_patch_update_user() {
        res = updatePatchUser(setURL, global_id);
        System.out.println(res.getBody().asPrettyString());
    }

    public void validation_status_code_is_equals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);

    }

    public void validation_response_body_get_list_users() {

        List<Object> id = res.jsonPath().getList("id");
        List<Object> userName = res.jsonPath().getList("userName");
        List<Object> password = res.jsonPath().getList("password");

        assertThat(id.get(0)).isNotNull();
        assertThat(userName.get(0)).isNotNull();
        assertThat(password.get(0)).isNotNull();

    }

    public void validation_response_body_post_create_new_users() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String userName = jsonPathEvaluator.get("userName");
        String password = jsonPathEvaluator.get("password");

        assertThat(id).isNotNull();
        assertThat(userName).isNotNull();
        assertThat(password).isNotNull();

        global_id = Integer.toString(id);

    }

    public void validation_response_body_update_user() {
        // JsonPath jsonPathEvaluator = res.jsonPath();
        // Integer id = jsonPathEvaluator.get("id");
        // String userName = jsonPathEvaluator.get("userName");
        // String password = jsonPathEvaluator.get("password");

        // assertThat(id).isNotNull();
        // assertThat(userName).isNotNull();
        // assertThat(password).isNotNull();
    }

    public void validation_response_json_with_JSONSchema(String filename) {
        // System.out.println("Stetp ke 5");
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));

    }

}
