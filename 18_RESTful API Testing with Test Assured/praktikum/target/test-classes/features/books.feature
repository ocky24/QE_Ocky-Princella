Feature: As user I want to get information about books

  Scenario: GET - As user I want to get information about books without authorized
    Given user get API endpoint
    When user send Get HTTP request
    Then user receive valid HTTP response code 200
    And validate ISBN and Title