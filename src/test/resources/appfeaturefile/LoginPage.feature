Feature: User Login

Background:
Given User is on Sauce demo login page

Scenario: Login page title verification
When User gets the title of page
Then Page title should be "Swag Labs"


Scenario: Login with correct credentials
When User enters username as "standard_user" and password as "secret_sauce"
And User clicks on Login button
Then Page title should be "Swag Labs"

Scenario Outline: Login with invalid credential
When the user enters username "<username>" and password "<password>"
And User clicks on Login button
Then "<Error>" Error message should be displayed

Examples:
      | username        | password      | error                              |
      | locked_out_user | secret_sauce  | locked out                         |
      | admin           | admin         | Epic sadface: Username and password do not match any user in this service                      |
      |                 | secret_sauce  | Epic sadface: Username is required |
      | standard_user   |               | Epic sadface: Password is required |
      |                 |               |Epic sadface: Username is required  |






