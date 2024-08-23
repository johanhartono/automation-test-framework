Feature: Test Automation Web

        @weblogindemoblaze
        Scenario: Test Login web demoblaze postive testing
                  using valid username and password
            Given Open web demoblaze login page
             Then demoblaze user click menu Log In
             Then demoblaze user input username "demo0001"
              And demoblaze user input password "demo@password"
              And demoblaze user click login button And user will redirect to homepage
   