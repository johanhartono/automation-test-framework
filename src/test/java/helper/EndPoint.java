// Date Created         : 11 August 2024
// Author               : Johan Hartono Ho
// Modified/Updated by  : 19 August 2024

package helper;

public class EndPoint {
    // berhubung https://dummyapi.io/sign-in tidak bisa diakses maka yang  dipakai adalah gorest/fakerestapi
    
    public static final String host_gorest = "https://gorest.co.in/public/v2/";
    public static final String host_fakerestapi = "https://fakerestapi.azurewebsites.net/api/v1/";

    //Fakerest API
    public static final String GET_LIST_USERS = host_fakerestapi + "Users";
    public static final String CREATE_NEW_USERS = host_fakerestapi + "Users";
    public static final String DELETE_USERS =  host_fakerestapi + "Users";
    public static final String UPDATE_USERS =  host_fakerestapi + "Users";



}
