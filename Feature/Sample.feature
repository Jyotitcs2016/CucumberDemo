Feature:Test login

Scenario:Facebook login
	Given Facebook login page
	When enter id and password
	Then Login is successfull
Scenario:Fscebook profile page	
	Given I am on Facebook home
	When I click on profile 
	Then I can see name is same as mine