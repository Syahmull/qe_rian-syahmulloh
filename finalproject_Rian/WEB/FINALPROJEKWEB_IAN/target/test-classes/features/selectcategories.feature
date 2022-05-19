@WebTest_5
Feature: As user i want to select category

  Scenario: As user i want to select a category at home page
    Given user on a homeepage
    When user click select category
    And user choose alat category
    Then user are shown all categories of alat