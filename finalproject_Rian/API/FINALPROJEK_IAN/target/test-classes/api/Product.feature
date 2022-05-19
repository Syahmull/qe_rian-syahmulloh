@TestFeature3
Feature: As user i want to see all product on home page

  Scenario: As user i have be able to get detail all product
    Given user set get endpoint for product
    When userr send get request
    Then userr see status codee 200
