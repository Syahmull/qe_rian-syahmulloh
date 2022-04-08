Feature: As admin I want to POST a new account


  Scenario: POST - As admin I want to POST a new account
    Given I am set POST API endpoints
    When I am send POST HTTP request
    Then I am receive valid HTTP response code 201
    And I am receive valid data for new user