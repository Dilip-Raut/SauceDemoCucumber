Feature: Login Functionality Of SauceDemo with Valid and Invalid User

Background:
    Given User is on sauceDemo page "https://www.saucedemo.com/"
    
   @valid
  Scenario: as a user Login with valid Credentials
    When User entered username as "standard_user" and Password as "secret_sauce"
    And User click on sign in button
    Then Validate the logo after login

@InvalidCredentials
  Scenario Outline: Login with invalid credentials
 
    When User entered username as "<username>" and Password as "<password>"
    And User click on sign in button
    Then User should be able to see error message "<errorMessage>"
 
    Examples:
      | username   | password  | errorMessage           |
      | standard_user123      | secret_sauce | Epic sadface: Username and password do not match any user in this service    |
      
      
@MissingUsername @FailedTest
  Scenario: Login with blank username
 
    When User entered username as "" and Password as "secret_sauce"
    And User click on sign in button
    Then User should be able to see a message "Epic sadface: Username is required"      
      
