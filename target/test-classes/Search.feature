Feature: Check Springer Link search functionality
  Scenario Outline: Validate Springer Link search function is working
    Given browser is open
    And user is on the search page
    When user enters a <text> 
    And hits search button
    Then user is navigated to the search results page

    Examples:
      | text                   |
      | herbalism              |
      | 19th century herbalism |
      | medicinal herbalism    |
