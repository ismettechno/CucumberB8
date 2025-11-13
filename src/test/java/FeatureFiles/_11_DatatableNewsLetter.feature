Feature: DataTable Functionality

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: NewsLetter DataTable

    And Click on Element Navigate
      | Newsletter |

    And Click on Element Dialog
      | subYes |
      | cntBtn |

    Then Success message should be displayed