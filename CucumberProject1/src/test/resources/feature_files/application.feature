Feature: Login page test
Scenario Outline: Test login page with different login credentials
Given user navigates to whitehatsec.com
When  user provides valid <Username> and <Password>
Then user should be able to login successfully.
When  user provides invalid <Username> and <Password>.
Then user should not be able to login to the application.
Examples:
|Username|Password |
|Jhansi123@mail.com |1234|
|abc123@mail.com  |456abc|

