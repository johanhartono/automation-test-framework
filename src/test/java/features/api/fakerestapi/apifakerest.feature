
Feature: Test Automation Rest Api


        @apifakerest
        Scenario: Test get List data from fakerestapi
            Given prepare url for "GET_LIST_USERS"
              And hit api get list users
             Then validation status code is equals 200
             Then validation response body get list users
             Then validation response json with JSONSchema "fakerestapi/get_list_users_fakerestapi.json"

        @apifakerest
        Scenario: Test create new user to fakerestapi
            Given prepare url for "CREATE_NEW_USERS"
              And hit api post create new user
             Then validation status code is equals 200
             Then validation response body post create new  user
             Then validation response json with JSONSchema "fakerestapi/post_create_new_users_fakerestapi.json"

        @apifakerest
        Scenario: Test delete user from fakerestapi
            Given prepare url for "CREATE_NEW_USERS"
              And hit api post create new user
             Then validation status code is equals 200
             Then validation response body post create new  user
            Given prepare url for "DELETE_USERS"
              And hit api delete user
             Then validation status code is equals 404

        @apifakerest
        Scenario: Test update user to fakerestapi
            Given prepare url for "CREATE_NEW_USERS"
              And hit api post create new user
             Then validation status code is equals 200
             Then validation response body post create new  user
            Given prepare url for "UPDATE_USERS"
              And hit api patch update user
             Then validation status code is equals 405
             Then validation response body update  user