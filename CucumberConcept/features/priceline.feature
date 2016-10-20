Feature: Testing priceline website

  Background: 
    Given I open priceline

  Scenario: To populate search form
    When I click on "flights"
    Then I enter "msp" on Origin field
    And I enter "ccu" on Destination field
    And I Enter "3" Adult Passenger Count field
    And I Enter "2" Child Passenger Count field
