Feature: login As a user: Login So that I can update my profile

  Scenario: As user i have be able to success login
    Given I am on a login page
    When I enter my username and password correctly
    And I click login button
    Then I am the home page
