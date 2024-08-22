Feature: Test Automation Web

        @websaucedemo
        Scenario: Test Login web saucedemo
            Given Open web login page
             Then user input username "standard_user"
              And user input password "secret_sauce"
              And user click login button And user will redirect to homepage
            Given user click label item product name
             Then user will able to see then details of product
             Then user click button Add to cart
              And Assert that the button change from add cart to remove
             Then user click label back to products then return to homepage

   
        