Feature: DataTable Functionality

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Edit Account DataTable

    And Click on Element Navigate
      | EditAccount |

    And User sending info in Dialog
      | inputFirstname | ismet2 |
      | inputLastname  | temur2 |

    And Click on Element Dialog
      | cntBtn |

    Then Success message should be displayed
