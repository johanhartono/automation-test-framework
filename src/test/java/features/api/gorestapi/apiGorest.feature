Feature: Test Automation Rest Api


        @apireqres
        Scenario: Test get List data from gorestapi
            Given prepare url gorestapi for "GET_LIST_USERS"
              And hit gorestapi get list users
             Then validation gorestapi status code is equals 200
             Then validation gorestapi response json with JSONSchema "reqresapi\get_list_users_gorestapi.json"

        @apireqres
        Scenario: create new user for gorestapi
            Given prepare url gorestapi for "CREATE_NEW_USERS"
              And hit gorestapi create new user
             Then validation gorestapi status code is equals 201
             Then validation gorestapi response json with JSONSchema "reqresapi\post_create_new_users_gorestapi.json"

        @apireqres
        Scenario: update user for gorestapi
            Given prepare url gorestapi for "PUT_UPDATE_USERS"
              And hit gorestapi update user
             Then validation gorestapi status code is equals 200
             Then validation gorestapi response json with JSONSchema "reqresapi\put_update_users_gorestapi.json"