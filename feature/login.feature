Feature: Login

@smoke
  Scenario: user succefullogin valid creadetion
    Given user lunch chomedriver and get  url "http://karehealth.menpaniproducts.com/admin/auth/login"
    When user enter username as "admin" and password as "admin"
    And click on login
    Then user shoul be home page
    
    
   
@santity
    Scenario Outline: login  data driven
    Given user lunch chomedriver and get  url "http://karehealth.menpaniproducts.com/admin/auth/login"
    When user enter username as "<email>" and password as "<password>"
    And click on login
    Then  it  should in error
    
	Examples:
	
	| email | password |
	| ab | a |
	| ere | svzxf |
	