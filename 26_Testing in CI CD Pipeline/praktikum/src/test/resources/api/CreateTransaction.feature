@TestFeature5
Feature: As user i want to create transaction of a product

  Scenario: As user i create transaction of product
    Given user succes auth using existing account
    And user set endpoint for order product
    When user send post request order
    Then user see status order code 200