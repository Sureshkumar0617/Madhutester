Feature: Login Page Feature

Scenario: login page
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enter Username "Suresh1047"
And user enter Password "1795OK"
And user click on login button