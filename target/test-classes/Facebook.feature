Feature: To Check the Functionality of Facebook

  Background: 
    Given Going to Launch the ChromeBrowser and Maximize the Window

  Scenario: To Validate the UsenName and Password In Facebook
    When Launching the Current URL
    When Passing UserName in UserName textbox
    And Passing Password in Password textbox
    And Finally Clicking Login Key
    Then Closing The Browser

  Scenario Outline: To Validate the UserName and Password
    When Launching the URL
    When Passing userName Value from Tables "<userName>"
    When Passing passWord Value from Tables "<passWord>"
    And Clicking Login Button
    Then Closing the Browser

    Examples: 
      | userName | passWord    |
      | Sathish  | sathish@123 |
      | Jeni     | jeni@123    |
      | Swetha   | swetha@123  |

  Scenario: Validating the UserName and Password
    When Launching URL
    When Passing value in userName OneDimensionalList
      | Sathish | Jeni | Swetha |
    When Passing value in passWordTwoDimensionalList
      | sathish@123 |
      | jeni@123    |
      | swetha@123  |
    When Close the Browser

  Scenario: Valid the uName and pass
    When launch
    When Pass Value in userName OneDimensionalMap
      | username | Sathish     |
      | lastname | Chidambaram |
    When Pass Value in passWord TwoDimensionalMaps
      | passWord1   | passWord2   |
      | sathish@123 | sathish@777 |
      | chid@123    | chid@777    |
