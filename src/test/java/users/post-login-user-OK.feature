Feature: Login User
  Scenario: Login User OK
    Given url "https://api.demoblaze.com/login"
    And request {  "username":"GabrielBorjaMoscoso123", "password":"123456" }
    When method post
    Then status 200