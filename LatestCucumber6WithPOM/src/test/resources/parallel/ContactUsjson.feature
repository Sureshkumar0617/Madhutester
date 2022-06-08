Feature: Contact Us Feature

Scenario: Contact Us scenario with different set of data
Given user navigates to contact us page
When user click on the Contact us Page
Then user enter the Subject Heading "Customer service"
And user enter the Email address "suresh1047@gmail.com"
Then user enter the Order reference "1"
Then user enter the message "Hi this is our team"
And user click on send
