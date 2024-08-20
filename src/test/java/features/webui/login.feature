Feature: Test Automation Web

        @web1
        Scenario: Test Login web saucedemo postive testing
                  using valid username and password
            Given Open web login page
             Then user input username "standard_user"
              And user input password "secret_sauce"
              And user click login button And user will redirect to homepage
             Then user click hamburger icon on top on the left
              And user logout from system and return to login page

        @web2
        Scenario: Test Login web saucedemo negative testing
                  using invalid username dan valid password
            Given Open web login page
             Then user input username "premium_user"
              And user input password "secret_sauce"
              And user click login button  will not be able to login