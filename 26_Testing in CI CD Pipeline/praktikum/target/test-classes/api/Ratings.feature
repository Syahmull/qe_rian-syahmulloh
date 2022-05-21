@TestFeature4
Feature: As user i want to see a ratings of product on homepage

  Scenario: As user i have be able to get ratings a product
    Given user set endpoint for ratings product
    When user send get request
    Then user see statuss code 200
    And I receive rating data for a product