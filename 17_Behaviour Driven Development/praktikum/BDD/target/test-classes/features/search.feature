Feature: Search
  As a user
  I want to delete my search history
  So that my search history is clean

  Scenario: As user I can delete my search history
    Given I am on my home
    And I click search bar
    When my search histories are appeared
    And I click delete history
    And validation pop up will be appeared
    And I click delete history on pop up
    Then my histories are deleted


