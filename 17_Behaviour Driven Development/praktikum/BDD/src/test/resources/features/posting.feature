Feature: Posting text
  As a user
  I want to post my status
  So that I can share my experience

  Scenario: As user I can post my status
    Given I am on my home
    And I click input field
    When I type my status
    And I click posting
    Then my status is posted