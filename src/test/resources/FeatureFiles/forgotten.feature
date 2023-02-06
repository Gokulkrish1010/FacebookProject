Feature: To validate forgotten password functionality of facebook
@Sanity
Scenario: To validate forgotten using invalid mobile number
When User should click the forgotten password 
And User should enter invalid mobile number
And User should submit the moblie number
Then User should navigate to otp page 
 
