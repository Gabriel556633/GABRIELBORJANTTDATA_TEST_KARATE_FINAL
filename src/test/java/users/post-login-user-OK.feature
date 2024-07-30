Feature: Login User
  Scenario Outline: Login User OK
    Given url "https://api.demoblaze.com/login"
    And request {  "username":<username>, "password":<password> }
    When method post
    Then status 200
    Examples:
      | read('datos.json') |