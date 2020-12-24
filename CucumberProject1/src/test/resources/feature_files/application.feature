@somke
Feature: Login page test
Scenario Outline: Test login page with different login credentials
Given user navigates to designmodo.com
When  user provides valid <Username> and <Password>
Then user should be able to login successfully.
When  user provides invalid <Username> and <Password>.
Then user should not be able to login to the application.
Examples:
|Username|Password |
|Jhansi123@mail.com |1234|
|user456@mail.com|1bc123|

@regression
Scenario: Adding the products to the cart and verifying
Given user navigates back to the home page
Then selects the slides product from the view
Then user adds the product to the cart






