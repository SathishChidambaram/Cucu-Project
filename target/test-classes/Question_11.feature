Feature: Passing the Values from Excel to UserName and Password Checkbox

  Scenario: Passing values to required checkbox
    Given Launching Chrome
    When Passing Value From Excel to UserName Checkbox
    When Passing Value From Excel to Password Checkbox
    When Clicking the Login Key
    Then Closing the Browser for Question11
