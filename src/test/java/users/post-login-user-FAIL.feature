
Feature: Login User
  Scenario: Login User FAIL
    Given url "https://api.demoblaze.com/login"
    And request {  "username":"Gabriel", "password":"123456" }
    When method post
    Then status 200