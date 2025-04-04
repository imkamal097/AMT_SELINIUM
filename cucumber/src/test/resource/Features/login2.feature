Feature:Login Feature

@set5
Scenario Outline: Login with valid and invalid login credentials
Given Login page is displayed
When User Enter the username "<username>"
When User Enter the password "<password>"
When User Click the login button
Then The application should display the message "<message>"



Examples:
| username      |  password    |  message  |
| standard_user | secret_sauce | Products  |
| standard_user | secret_saauce| Epic sadface: Username and password do not match any user in this service |

