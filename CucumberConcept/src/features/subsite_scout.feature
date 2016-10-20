Feature: Testing priceline website
  
  Scenario Outline: Test subsites of priceline
    Given I open priceline
    When I open subsite <Link>
    Then I close the subsite
    Examples:
      | Link    |
      | flights |
      | hotels  |
      | cars    |
      
