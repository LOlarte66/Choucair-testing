Feature: Open orders
  As admin user (Carolina) of the DemoSerenity Website,
  I need to verify the number of open orders

  Scenario Outline: Number of open orders
    Given Carolina has accessed the main page
    And Carolina tries to enter her account
      | username   | password   |
      | <username> | <password> |
    When Carolina checks the number of orders for the <customer>
    Then Carolina will see the correct number of orders <numOrders>
    Examples:
      | username | password | customer                  | numOrders |
      | admin    | serenity | LILA-Supermercado [LILAS] | 2         |

