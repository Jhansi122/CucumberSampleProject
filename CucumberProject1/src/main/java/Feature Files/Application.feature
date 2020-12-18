Feature: Login page test
Scenario Outline: Test login page with different login credentials
Given Open firefox and navigate to whitehatsec.com
When  User provides valid <Username> and <Password>
Then User should be able to login successfully.
When  User provides invalid <Username> and <Password>.
Then User should not be able to login to the application.

Examples:

|Username|Password |
|Jhansi123@mail.com |1234|
|abc123@mail.com  |456abc|

