
Feature: Test Automation Rest Api


        @apireqres
        Scenario: Test get List data from reqresapi
            Given prepare url reqresapi for "GET_LIST_USERS"
              And hit reqresapi get list users
             Then validation reqresapi status code is equals 200
             Then validation reqresapi response json with JSONSchema "reqresapi\get_list_users_reqresapi.json"

        @apireqres
        Scenario: create new user for reqresapi
            Given prepare url reqresapi for "CREATE_NEW_USERS"
              And hit reqresapi create new user
             Then validation reqresapi status code is equals 201
             Then validation reqresapi response json with JSONSchema "reqresapi\post_create_new_users_reqresapi.json"

        @apireqres
        Scenario: update user for reqresapi
            Given prepare url reqresapi for "PUT_UPDATE_USERS"
              And hit reqresapi update user
             Then validation reqresapi status code is equals 200
             Then validation reqresapi response json with JSONSchema "reqresapi\put_update_users_reqresapi.json"

        @apireqres
        Scenario: delete user from reqresapi
            Given prepare url reqresapi for "DELETE_USERS"
              And hit reqresapi delete user
             Then validation reqresapi status code is equals 204
