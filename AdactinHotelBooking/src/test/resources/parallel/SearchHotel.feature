Feature: Search Hotel From Excel Reader
Background:
Given user has already logged in to application
|Username|Password|
|Suresh1047|1795OK|

	
Scenario: Selecting Hotel
Given user navigates to Search Hotel Page
When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on Search
Then user clicks on Select
And user clicks on continue

Examples:
|SheetName|RowNumber|
|SearchHotel|0|

