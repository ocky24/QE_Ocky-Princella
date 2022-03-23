Feature: Login
  As a user
  I want to see my home
  So that I can see my friend's post

  Scenario: As user I can login successfully
    Given I am on login page
    When I enter my valid username and valid password
    And I click login button
    Then I am on my home

  Scenario: As user I can not login using invalid username
    Given I am on login page
    When I enter my invalid username and valid password
    And I click login button
    Then error notification is appeared


  Scenario: As user I can not login using invalid password
    Given I am on login page
    When I enter my valid username and invalid password
    And I click login button
    Then error notification is appeared