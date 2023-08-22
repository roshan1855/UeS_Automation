Feature: Feature to test login and logout from different from broker user and
  security administrator.

  Scenario Outline: Check successful login and logout from UeS Home Page
    for Broker and Security Administrator.

    Given Browser is open
    Given User is on the UeS Login Page
    When User enters <username> and <password>
    And User clicks on login button
    Then User should be navigated to the UeS Home Page
    And User clicks on logout button.
    Then User should be navigated back to UeS Login Page.

    Examples: 
      | username  |  | password  |
      | 001148753 |  | Contact@2 |
      | baileyja1 |  | United1#  |
