Feature: Contact Us Functionality

  @SmokeTest
  Scenario: Send a message
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to ContactUs
    Then Success message should be in URL