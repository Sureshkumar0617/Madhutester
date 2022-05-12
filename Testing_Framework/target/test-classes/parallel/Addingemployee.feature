Feature: Account Page Feature

Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|

Scenario: Adding Candidate in Recuritment Tab
Given user click Recuritment Tab
When user click Candidate tab
And user click Add tab
Then user enter first name "Suresh"
Then user enter lastname "Kumar"
Then user enter emailid "suresh123@gmail.com"
And user click save button
