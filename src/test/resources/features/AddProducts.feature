Feature: Add products to inventory
  As admin user (Carolina) of the DemoSerenity Website,
  i need to add products to the inventory

  Scenario Outline: Add products successfully
    Given Carolina has accessed the main page
    And Carolina tries to enter her account
      | username   | password   |
      | <username> | <password> |
    When Carolina try to add one product
      | nameProduct   | numStock   |
      | <nameProduct> | <numStock> |
    And Carolina search the <nameProduct> in the inventory
    Then Carolina is going to see product
      | nameProduct   | numStock   |
      | <nameProduct> | <numStock> |
    Examples:
      | username | password | nameProduct | numStock |
      | admin    | serenity | choco       | 100      |




