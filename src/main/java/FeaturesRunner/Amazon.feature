Feature: Amazon Signin and Product selection
Scenario: User able to signin and select product
Given User already opened the browser
When Amazon Logo is visible
Then User will hover to signin button and click it
Then SignIn page will be open
Then enter username and password and signin
Then validate homepage login