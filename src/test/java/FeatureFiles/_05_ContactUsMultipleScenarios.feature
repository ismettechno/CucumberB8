Feature: Multi Scenario Parameter

  Background: #before senaryo
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Send a message
    And Navigate to ContactUs
    When Send a message and click to Submit
    Then Success message should be in URL

  Scenario: Send a message
    And Navigate to ContactUs
    When Send a message as "Merhaba Testing dünyası 2: Cucumber dayız" and click to Submit
    Then Success message should be in URL