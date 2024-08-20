Feature: Test Automation Web

        @web
        Scenario: Test Login web saucedemo
            Given Open web login page
             Then make sure login button is displayed
             Then user input username "standard_user"
              And user input password "secret_sauce"
              And user click login button And user will redirect to homepage
        
 