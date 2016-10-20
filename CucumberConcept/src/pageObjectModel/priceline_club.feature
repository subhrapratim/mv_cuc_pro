Feature: Testing priceline website

  Background: 
    Given I open priceline

  Scenario: To populate search form
    When I click on "flights"
    Then I fill flights search data
