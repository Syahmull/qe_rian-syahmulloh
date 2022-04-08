Feature: As user I want to GET information about books

  Scenario: GET - As user I want to GET information about books
    Given I am get API endpoint
    When I am send Get HTTP request
    Then I am receive valid HTTP response code 200
    And validate ISBN and Title