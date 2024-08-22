// Date Created         : 22 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 22 August 2024

package helper.Models.api.reqresapi;
import org.json.JSONObject;

import helper.EndPoint;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ModelsReqresApi {
    public static final String GET_LIST_USERS = EndPoint.host_reqresapi + "users?page=1";
    public static final String CREATE_NEW_USERS = EndPoint.host_reqresapi + "users/";
    public static final String DELETE_USERS =  EndPoint.host_reqresapi + "users/";
    public static final String PUT_UPDATE_USERS =  EndPoint.host_reqresapi + "users/";
    public static final String PATCH_UPDATE_USERS = EndPoint.host_reqresapi + "users/";
    
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
       String id = "0037"; 
       String name = "johan hartono";
       String job = "QA Engineer";
       String createdAt = "2024-08-21";
       JSONObject payload = new JSONObject();
       payload.put("id",id);
       payload.put("name",name);
       payload.put("job",job);
       payload.put("createdAt",createdAt);


       setupHeaders();
       return request.body(payload.toString()).when().post(endpoint);
    }
    //DELETE
    public static Response deleteUser(String endpoint,String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/"+ user_id;
        return request.when().delete(finalEndpoint);
        
    }
    //PUT
    public static Response updatePutUser(String endpoint) {
        setupHeaders();
        String id = "0037"; 
        String name = "johan hartono ho";
        String job = "QA Engineer Professional";
        String updateAt = "2024-08-21";
        JSONObject payload = new JSONObject();
        //payload.put("id",id);
        payload.put("name",name);
        payload.put("job",job);
        payload.put("updateAt",updateAt);
       
        String finalEndpoint = endpoint + "/" + id;
        return request.body(payload.toString()).when().put(finalEndpoint);
     }
}
