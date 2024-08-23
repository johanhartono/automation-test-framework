Feature: Test Automation Web

        @websaucedemo
        Scenario: Test Login web saucedemo
            Given Open web saucedemo login page
             Then saucedemo user input username "standard_user"
              And saucedemo user input password "secret_sauce"
              And saucedemo user click login button And user will redirect to homepage
            Given saucedemo user click label item product name
             Then saucedemo user will able to see then details of product
             Then saucedemo user click button Add to cart
              And saucedemo Assert that the button change from add cart to remove
             Then saucedemo user click label back to products then return to homepage

   
        