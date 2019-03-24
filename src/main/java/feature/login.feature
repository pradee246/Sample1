Feature: Verify functionality of Free CRM app

#Scenario: Verify valid Free CRM Login

#	Given User is in Login page
#	When User enter User and Password
#	And User Clicks on Login
#	Then User validate the outcomes
	
	
#### with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

	Given User is in Login page
	When title of login page is Free CRM
	Then user enters "<username>" and "<password>"
	Then user clicks on login button
	Then user is on home page
	Then Close the browser
	

Examples:
	| username | password |
	| naveenk  | test@123 |
	|  tom     | test456  |
	
Scenario: Free CRM Create a new deal scenario

	Given User is in Login page
	When title of login page is Free CRM
	Then user enters username and password
		| pradee246 | Nexus5@123 |
	
	Then user clicks on login button
	Then user is on home page
	Then user moves to new deal page
	Then user enters deal details
		| test deal | 1000 | 50 | 10 |
	
#	Then Close the browser