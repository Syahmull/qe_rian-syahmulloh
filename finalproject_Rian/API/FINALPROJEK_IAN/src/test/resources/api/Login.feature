@TestFeature2
Feature: As user i want to login on login page

  Scenario: as a user login using valid email and password
    Given user set endpoint for login
    When user input valid email and password in body
    Then user see status code in 200





