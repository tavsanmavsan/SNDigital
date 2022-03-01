Feature: Springer Link Web Login
  Scenario Outline: User should login with valid credentials
    Given the user is on login page
    When the user enters <email> and <password>
    And hits Log in
    Then the user should be logged in successfully

    Examples:

      | email               | password        |
      | ozludamla@gmail.com | #dvcRm8!3kD8dr8 |
      | info@herbalchemy.co | Spring123!      |



