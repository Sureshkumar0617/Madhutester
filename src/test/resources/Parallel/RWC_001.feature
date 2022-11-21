Feature: Renew Fleet feature
Scenario: IRP Renew fleet
Given User login as a Internal user
When User will navigate to the IRPLink
Then User will provide all the Account Number Details to start with IRP Transaction
Then User will navigate to account section and fill the data
Then User will navigate to Fleet section and fill the data and validate message  "IRPACC00 : [I] Renewal account has been generated."
Then User will navigate to Distance section and fill the data and validate message "IRPFLT01 : [I] Renewal fleet has been generated." "[I] MCE: IRP status successfully updated." 
Then User will navigate to Weight group section and fill the data ans validate message "IRPMLG13 : [I] Renewal Distance has been generated."
Then User will navigate to Add vehicle and validate the message "IRPVEH375 : [I] Please search the VIN first to process a vehicle." "IRPVEH491 : [W] New Plate Required flag set for this vehicle to Yes." "IRPVEH004 : [I] Vehicle amended successfully."
Then User will Delete vehicle as per the requiremnet and validate the message "IRPVEH246 : [I] Vehicle(s) deleted successfully." 
And User will confirm cancel "GEN1062 : [I] Cancellation completed successfully"
Then User will navigate to vehicle list to update existing vehicle
Then User will navigate to billing to verify as well to adjust the cost & Waive Fees "IRPBILL09 : [E] Manual adj. reason is required."
And User will navigate to Payment Tab to input the data and validate message "GEN24 : [I] Invoice report generated successfully." "IRPREP28 : [I] Billing completed successfully." "GEN1239 : [I] TVR generated successfully."
Then User will navigate to supplement continuance and validate the meesage "GENPAY01 : [E] This transaction already exists in the cart."
Then User will navigate to payment tab and fill the requirement 
And user will validate message "Payment Receipt generated successfully" "Credentials generated successfully."
#Then User navigate to inventory tab to input the data and validate the message "ENTINV56 : [I] Length of From No. must be 6 with inventory format ##@@#@ where # must be numeric and @ must be alphabetic." "ENTINV06 : [I] Inventory has been added successfully."
#And Assign the inventory to proceed further "ENTINV56 : [I] Length of From No. must be 6 with inventory format ##@@#@ where # must be numeric and @ must be alphabetic." "Inventory has been assigned successfully."
#Then user navigate to post payment for 2nd installment payment and fill the data and validate the message "PAY14 : [I] Payment completed successfully." "GEN24 : [I] Payment Receipt generated successfully."
