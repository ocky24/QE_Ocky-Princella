Feature: As admin I want to make new account

  @coba
  Scenario: POST - As admin I want to make new user account
    Given I set POST API endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new user