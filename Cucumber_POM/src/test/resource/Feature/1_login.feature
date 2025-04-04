Feature: Login Feature
@f6
Scenario: verify login is successful with valid login credentials
Given Login page is displayed
When Enter the username
When Enter the password
When Click the login button
Then The Product page is displayed

