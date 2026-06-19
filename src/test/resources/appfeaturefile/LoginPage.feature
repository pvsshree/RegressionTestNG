Feature: User Login

Background:
Given User is on Sauce demo login page

Scenario: Login page title verification
When User gets the title of page
Then Page title should be "Swag Labs"


Scenario: Login with correct credentials
When User enters username as "standard_user"
And User enters password as "secret_sauce"
And User clicks on Login button
Then User gets title of the page as "Swag Labs"

Scenario: Login with invalid credential
When User enters username as "standard_user"
And User enters password as "secret"
And User clicks on Login button
Then User gets error message as "Epic sadface: Username and password do not match any user in this service"

Scenario: Login with invalid credential
When User enters username as "admin"
And User enters password as "secret_sauce"
And User clicks on Login button
Then User gets error message as "Epic sadface: Username and password do not match any user in this service"

Scenario: User directly clicks on Login button
When User clicks on Login button without entering username and password
Then User gets error message as "Epic sadface: Username is required"
