@WebTest_3
Feature: As a user I want to see product details and buy products on the home page

  Scenario: As user I want to see detail a Laptop
    Given user on home page detail
    When user click detail button Laptop
    Then user sucsess see detail Laptop Page