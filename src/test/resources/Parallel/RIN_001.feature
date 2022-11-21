Feature: Reinstate Fleet feature
Scenario: IRP Reinstate fleet
Given User login as an Internal user
When User will navigate to IRP & Reinstate Fleet
Then User will provide all the inputs & select the record on the grid
Then User will navigate to Distance page & Proceed
Then User will navigate to billing Page & provide mandatory inputs & proceed
And User will validate the Success Information Message

