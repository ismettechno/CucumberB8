Feature: Login functionality

  @SmokeTest @Regression
  Scenario: Login with valid username and password

    Given Navigate to WebSite

    And Click on Element Dialog
      | detailsButton |
      | proceedLink |

    When Enter username and password and click login button
    Then User should login successfully