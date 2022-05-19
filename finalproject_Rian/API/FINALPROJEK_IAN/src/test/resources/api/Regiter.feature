@TestFeature1
Feature: As user i want to success register

  Scenario: as a user register using valid full name,email, and password
    Given user set endpoint for register
    When user input valid full name,email, and password in body
    Then user see status code 200
    And user receive valid data