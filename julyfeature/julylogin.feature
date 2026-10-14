Feature:this is login feature-

@SIT
Scenario: Valiate the login feature with inValid username n password
Given user is on login  page
When user enter valid username "Testing@gmailcom"
And user enter valid password "P2234@##"
And click on submit
Then user should be able to see expected error message

@regerssion
Scenario Outline: Validate the login functionality with valid username and password
 
 Given user is on login  page
 When user enters valid usernameM "<username>"
 And user enters valid passwordM "<password>"
And click on submit
 
 Examples: 
|username|password|
|kphp@gmailcom|P3234#$$$|
|selenium@gmaillcom|P334sdTet|
