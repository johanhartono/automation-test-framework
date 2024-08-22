package pages.api.reqresapi;
import helper.Utility;
import helper.Models.api.reqresapi.ModelsReqresApi;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static helper.Models.api.reqresapi.ModelsReqresApi.deleteUser;
import static helper.Models.api.reqresapi.ModelsReqresApi.getListUsers;
import static helper.Models.api.reqresapi.ModelsReqresApi.postCreateUser;
import static helper.Models.api.reqresapi.ModelsReqresApi.updatePutUser;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;

import java.io.File;

public class ApiReqresPage {
    String setURL, global_id;
    Response res;

   
    public void prepareURLfakeRestAPI(String Url) {
        switch (Url) {
            case "GET_LIST_USERS":
                setURL = ModelsReqresApi.GET_LIST_USERS;
                break;
            case "CREATE_NEW_USERS":
                setURL = ModelsReqresApi.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = ModelsReqresApi.DELETE_USERS;
                break;
            case "PUT_UPDATE_USERS":
                setURL = ModelsReqresApi.PUT_UPDATE_USERS;
                break;
            case "PATCH_UPDATE_USERS":
                setURL = ModelsReqresApi.PATCH_UPDATE_USERS;
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
    public void hit_api_update_user() {
        res = updatePutUser(setURL);
        System.out.println(res.getBody().asPrettyString());
    }

    public void validation_status_code_is_equals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);

    }

    public void validation_response_body_get_list_users() {

        List<Object> id = res.jsonPath().getList("id");
        List<Object> email = res.jsonPath().getList("email");
        List<Object> first_name = res.jsonPath().getList("first_name");
        List<Object> last_name = res.jsonPath().getList("last_name");
        List<Object> avatar = res.jsonPath().getList("avatar");

        assertThat(id.get(0)).isNotNull();
        assertThat(email.get(0)).isNotNull();
        assertThat(first_name.get(0)).isNotNull();
        assertThat(last_name.get(0)).isNotNull();
        assertThat(avatar.get(0)).isNotNull();

    }

    public void validation_response_body_post_create_new_users() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String email = jsonPathEvaluator.get("email");
        String first_name = jsonPathEvaluator.get("first_name");
        String last_name = jsonPathEvaluator.get("last_name");
        String avatar = jsonPathEvaluator.get("avatar");

        assertThat(id).isNotNull();
        assertThat(email).isNotNull();
        assertThat(first_name).isNotNull();
        assertThat(last_name).isNotNull();
        assertThat(avatar).isNotNull();

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
