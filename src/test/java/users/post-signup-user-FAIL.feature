Feature: SignUp User
  Scenario: SignUp User FAIL
    Given url "https://api.demoblaze.com/signup"
    And request {  "username":"GabrielBorjaMoscoso", "password":"123456" }
    When method post
    Then status 200