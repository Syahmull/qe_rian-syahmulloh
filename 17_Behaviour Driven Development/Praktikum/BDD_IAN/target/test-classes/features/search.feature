Feature: Search text as a user : Search So that I can search another account

  Scenario: As user i can search another account
    Given I am on a home page
    When I click search bar
    And I type another acount at search bar
    And I press my enter buttom
    Then I directed to another page with account data