@WebTest_2
Feature: As a user I want to register so I can login to my home page

  Scenario: as user i want to input valid nama lengkap, email, and password
    Given user on home pageku
    And user direct to register page
    When user input valid nama lengkap, email, and password
    And user click register button
    Then user on a login page
