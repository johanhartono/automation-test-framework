Feature: Test Automation Web

        @weblogindemoblaze
        Scenario: Test Login web demoblaze postive testing
                  using valid username and password
            Given Open web demoblaze login page
             Then user input username "demo0001"
              And user input password "demo@password"
              And user click login button And user will redirect to homepage
