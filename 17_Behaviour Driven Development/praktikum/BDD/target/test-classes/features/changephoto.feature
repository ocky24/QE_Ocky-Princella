Feature: change photo
  As a user
  I want to change my photo
  So that I can update my new photo

  Scenario: As user I can change my photo successfully
    Given I am on profile page
    When I click my photo
    And I click added photo
    And I click upload photo
    Then my folder is displayed
    And I click photo
    And I click open button
    And i click save photo

