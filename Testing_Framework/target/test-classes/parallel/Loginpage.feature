Feature: Login Page Feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "OrangeHRM"
Given user is on login page
When user enter username "Admin"
And user enter password "admin123"
And user click on login button