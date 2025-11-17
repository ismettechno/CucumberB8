Feature: Multi Scenario

  Background: #before senaryo
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  @Regression
  Scenario: Subcribe to NewsLetter
    And Navigate to NewsLetter
    When Click to Yes
    Then Success message should be displayed

  @Regression
  Scenario: Send a message
    And Navigate to ContactUs
    When Send a message and click to Submit
    Then Success message should be in URL