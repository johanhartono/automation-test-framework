Feature: Test Automation Web

        @webloginsaudemo
        Scenario: Test Login web saucedemo postive testing
                  using valid username and password
            Given Open web saucedemo login page
             Then user input username "standard_user"
              And user input password "secret_sauce"
              And user click login button And user will redirect to homepage
             Then user click hamburger icon on top on the left
              And user logout from system and return to login page

        @webloginsaudemo
        Scenario: Test Login web saucedemo negative testing
                  using invalid username dan valid password
            Given Open web saucedemo login page
             Then user input username "premium_user"
              And user input password "secret_sauce"
              And user click login button  will not be able to login

        @webloginsaudemo
        Scenario: Test Login web saucedemo negative testing
                  using invalid username and  invalid password
            Given Open web saucedemo login page
             Then user input username "invalid_user"
              And user input password "invalid_password"
              And user click login button  will not be able to login