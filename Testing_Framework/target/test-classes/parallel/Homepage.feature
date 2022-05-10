Feature: Homepage Feature

Background:
Given user has already logged in to application
|username|password|
|Admin|admin123|

@accounts
Scenario: Home section count
Given user is on Home page
Then user gets Home section
|Admin|
|PIM|
|Leave|
|Time|
|Recruitment|
|My Info|
|Performance|
|Dashboard|
|Directory|
|Maintenance|
|Buzz|
And accounts section count should be 11