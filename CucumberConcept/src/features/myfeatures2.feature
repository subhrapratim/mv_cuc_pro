Feature: Testing priceline website

  Background: 
    Given I open priceline

  Scenario: My first test
    Then I click on "flights"
    And fill search criteria
      | Fields      | Value |
      | origin      | msp   |
      | destination | ccu   |
      | adult       |     3 |
      | child       |     2 |

  Scenario Outline: Test subsites of priceline
    When I open subsite <Link>
    Then I close the subsite

    Examples: 
      | Link    |
      | flights |
      | hotels  |
      | cars    |
