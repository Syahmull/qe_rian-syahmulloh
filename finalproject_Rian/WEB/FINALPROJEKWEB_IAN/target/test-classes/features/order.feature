@WebTest_4
Feature: As user i want to adding and reduce value a product on order page

  Scenario: as user i want to adding more value a product
    Given user on homepage
    And user click beli buttom of laptop
    When user click basket buttom
    And user on order home page
    And user click plus buttom
    Then user see total bayar was change

