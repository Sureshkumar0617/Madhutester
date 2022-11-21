Feature: Straight Renewal Fleet which is about to expire
Scenario: Straight Renewal Fleet
Given User login as Internal user
When User will navigate to IRP 
Then User navigate to renew fleet and search for  Reinstated Account Number
Then User will navigate to Account screen and provides all the required input to proceed 
Then user will navigate to Account verification screen and proceed further
Then user will navigate to Fleet  screen and update Fleet Expiration Date & Fleet Type & Commodity Class and proceed further
Then user will navigate to Fleet verification screen and proceed further
Then user will land on Distance screen and select Estimated Distance and proceed further
Then user will navigate to Distance verification screen and proceed further
Then user will land on the Add Weight Group screen and provide all the required input to proceed
Then user will land on the Add Weight Group Verification screen and go for  Weight group
Then user will land on the Weight Group and edit the existing weight group to proceed
#Then user should land on the Vehicle Screen and Proceed further
#Then user should land on Billing page with open status and Request for TVR & enter the manual adjustment set Delivery Type as PDF with Comments
#Then user will land on the Payment Init Verification screen & click on Pay Now
#Then user will land on the Payment Collection page
#Then user should land on supplement Documents and verify the documents as collected
#Then user should land on the installement payment and verify the amount and then proceed
#Then user verifies details in Fleet Enquiry for Renewal
#And user verifies details in Supplement Enquiry for Renewal