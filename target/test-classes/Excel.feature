@Excel
Feature: validate Adactin Login Page

  Scenario: Verify with All Data
    Given User is on Adaction HomePage
    When User Should Enter ValidData "<username>" and "<password>"

   