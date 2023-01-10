Feature: Login
  As admin user (Carolina) of the DemoSerenity Website,
  I need to login into the website

  Scenario Outline: Successful login
    Given Carolina has accessed the main page
    When Carolina tries to enter her account
      | username   | password   |
      | <username> | <password> |
    Then Carolina will see her name
      | name   |
      | <name> |
    Examples:
      | username               | password  | name                   |
      | admin                  | serenity  | admin                  |

