@f5
Feature: Login Feature

Scenario Outline: verify login is successful with valid login credentials
Given Login page should be displayed
When Click login button
When Enter the emailID "<Email>"
When Enter the password "<Password>"
When Click the Submit button
Then The Account page is displayed <"message">

Examples:
| Email                |  Password     |  message             |
| kamal2004@gmail.com  | KamalS@2004   |   kamal2004@gmail.com |

