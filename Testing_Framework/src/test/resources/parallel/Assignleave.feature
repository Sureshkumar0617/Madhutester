Feature: Assign leave feature
Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|

Scenario: Assigning leave for employee
Given user navigates to Leave page
When user click the Assign leave tab
And user add employee name in employee name tab
Then user select the leave type
When user select the from date
And user select the to date
And user enter the comment 
Then user click on the Assign button