Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario using maps

	Given User is in Login page
	When title of login page is Free CRM 
	Then user enters username and password using maps 
		| username | password|
		| pradee246 | Nexus5@123 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details using Maps
		|title     | amount | probability | commission |
		|test deal1| 1000 	| 50 		| 10 |
		|test deal2| 2000 	| 60 		| 20 |
		|test deal3| 3000 	| 70 		| 30 |
		
#Then Close the browser