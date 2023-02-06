Feature: To validate the login functionality

@Smoke
Scenario: To validate the login functionality with the invalid username and invalid password
When User have to enter the invalid username and invalid password
				|Gokul|Gokul@123|Krishna|Krishna@123|
And User have to get title from webpage
And User have to click the login button
Then User have to navigate to incorrect credential page
@Regression
Scenario: To validate the login functionality with invalid username and valid password
When User have to enter the invalid username and valid password
				|Gokul  |Gokul@123  |
				|Krishna|Krishna@123|
And User have to get title from webpage
And User have to click the login button
Then User have to navigate to incorrect credential page
@Sanity
Scenario: To validate the login functionality with valid username and invalid password
When User have to enter the valid username and invalid password
				|user  |Gokul      |
				|pass  |Krishna@123|
And User have to get title from webpage
And User have to click the login button
Then User have to navigate to incorrect credential page
@Smoke				
Scenario: To validate the login functionality with valid username and valid password
When User have to enter the valid username and valid password
				|user   |pass       |
				|vanitha123@gmail.com  |Gokul@123  |
				|Krishna               |vanitha123 |
And User have to get title from webpage
And User have to click the login button
Then User have to navigate to mobile protection page
								