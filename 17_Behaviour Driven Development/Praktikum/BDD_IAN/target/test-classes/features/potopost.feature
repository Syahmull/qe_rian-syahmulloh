Feature: Post photo form local : Post Photo So that I can post photo form local dorectory

  Scenario: As user i can post a poto form yg directory
    Given I am at home page
    When I click photo buttom
    Then my folder was displayed
    And I chose a photo
    And I click open buttom
    And i click done buttom
    Then Create a post was displayed
    And I type my test in text box
    And I click post