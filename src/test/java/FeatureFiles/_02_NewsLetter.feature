Feature: NewsLetter Functionality

  Scenario: Subcribe to NewsLetter
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to NewsLetter
    When Click to Yes
    Then Success message should be displayed