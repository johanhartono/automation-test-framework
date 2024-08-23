Feature: Test Automation Web

        @webloginsaudemo
        Scenario: Test Login web saucedemo postive testing
                  using valid username and password
            Given Open web saucedemo login page
             Then saucedemo user input username "standard_user"
              And saucedemo user input password "secret_sauces"
              And saucedemo user click login button And user will redirect to homepage
             Then saucedemo user click hamburger icon on top on the left
              And saucedemo user logout from system and return to login page

        @webloginsaudemo
        Scenario: Test Login web saucedemo negative testing
                  using invalid username dan valid password
            Given Open web saucedemo login page
             Then saucedemo user input username "premium_user"
              And saucedemo user input password "secret_sauce"
              And saucedemo user click login button  will not be able to login

        @webloginsaudemo
        Scenario: Test Login web saucedemo negative testing
                  using invalid username and  invalid password
            Given Open web saucedemo login page
             Then saucedemo user input username "invalid_user"
              And saucedemo user input password "invalid_password"
              And saucedemo user click login button  will not be able to login