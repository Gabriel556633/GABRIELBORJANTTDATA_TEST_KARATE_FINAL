Feature: SignUp User
  Scenario Outline: SignUp User FAIL
    Given url "https://api.demoblaze.com/signup"
    And request {  "username":<username>, "password":<password> }
    When method post
    Then status 200
    Examples:
      | read('datos.json') |