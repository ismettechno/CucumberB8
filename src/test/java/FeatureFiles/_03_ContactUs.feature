Feature: Contact Us Functionality

  Scenario: Send a message
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to ContactUs
    When Send a message and click to Submit
    Then Success message should be displayed