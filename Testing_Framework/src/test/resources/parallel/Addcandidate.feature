Feature: Candidate Feature



Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|


Scenario Outline: Candidate scenario 
Given user navigates to candidate page
When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on send button


Examples:
|SheetName|RowNumber|
|Addcandidate|0|
|Addcandidate|1|