// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 19 August 2024

package helper.Models.api.fakerestapi;

import org.json.JSONObject;

import helper.EndPoint;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Modelsfakerestapi {

    public static final String GET_LIST_USERS = EndPoint.host_fakerestapi + "Users";
    public static final String CREATE_NEW_USERS = EndPoint.host_fakerestapi + "Users";
    public static final String DELETE_USERS =  EndPoint.host_fakerestapi + "Users";
    public static final String UPDATE_USERS =  EndPoint.host_fakerestapi + "Users";
    public static final String PUT_UPDATE_USERS =  EndPoint.host_fakerestapi + "users";
    public static final String PATCH_UPDATE_USERS = EndPoint.host_fakerestapi + "users";
    
    private static RequestSpecification request;
    
    public static void setupHeaders() {
        request = RestAssured.given()
        .header("Content-Type","application/json")
        .header("Accept","application/json");
        //.header("Authorization","Bearer 490b7597bdf9439ed0eb90a628e212d927873bb4c7bc072b6870382adc5f1b4b");
    }
    //GET
    public static Response getListUsers(String endpoint) {
        setupHeaders();
        System.out.println("End Point target : " + endpoint);
        return request.when().get(endpoint);
    }
    //POST
    public static Response postCreateUser(String endpoint) {     
       String id = "37";
       String userName = "johan";
       String password = "1234567890";
       JSONObject payload = new JSONObject();
       payload.put("id",id);
       payload.put("userName",userName);
       payload.put("password",password);

       setupHeaders();
       return request.body(payload.toString()).when().post(endpoint);
    }
    //DELETE
    public static Response deleteUser(String endpoint,String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/"+ user_id;
        return request.when().get(finalEndpoint);
    }
    //PATCH
    public static Response updatePatchUser(String endpoint,String ids) {
        setupHeaders();
        String id = "37";
        String userName = "johan";
        String password = "1234567890";
        JSONObject payload = new JSONObject();
        payload.put("id",id);
        payload.put("username",userName);
        payload.put("password",password);
       
        String finalEndpoint = endpoint + "/" + ids;
        return request.body(payload.toString()).when().patch(finalEndpoint);
     }
}
