@Excel2
Feature: validate Adactin Login Page

  Scenario Outline: Verify with All Data
    Given User is on Adaction HomePage
    When User Should Enter ValidData "<SheetName>", <RowNumber> , <username> and <password>

    Examples: 
      | SheetName | RowNumber | username | password |
      | Ganesh    |         1 |        0 |        1 |
      | Ganesh    |         2 |        0 |        1 |
      | Ganesh    |         3 |        0 |        1 |
