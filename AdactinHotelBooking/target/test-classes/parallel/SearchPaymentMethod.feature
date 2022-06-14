Feature: Payment Method Page Feature from JSON File

Background:
Given user has already logged in to application
|Username|Password|
|Suresh1047|1795OK|


Scenario: Adding Payment Method
Given user navigate to Payment method process
When user enter first name "Aadhitya"
And user enter last name "rajan"
Then user enter billing address "No4 Chennai"
Then user enter Credit card no "5754788954621325"
Then user enter Credit card type "VISA"
Then user enter expiry data "June" 
Then user enter expriy data "2023"
And user enter Cvv number "256"
Then user click on Book now tab

Then user click on logout