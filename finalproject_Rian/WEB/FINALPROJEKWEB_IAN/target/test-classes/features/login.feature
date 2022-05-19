@WebTest_1
Feature: As user i want to login so that i can see my home page

  Scenario: as a user i want to login using valid email and valid password
    Given user on login page
    When user input valid username and password
    And user click login button
    Then user on home page
