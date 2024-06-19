Feature: SignUp User
  Scenario: SignUp User OK
    Given url "https://api.demoblaze.com/login"
    And request {  "username":"GabrielNTTDATA", "password":"123456" }
    When method post
    Then status 200