Feature: DataTable Functionality

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Edit Account DataTable Senaryo Outline

    And Click on Element Navigate
      | EditAccount |

    And User sending info in Dialog
      | inputFirstname | <name> |
      | inputLastname  | <surname> |

    And Click on Element Dialog
      | cntBtn |

    Then Success message should be displayed
    Examples:
      | name    | surname |
      | ismet 1 | temur 1 |
      | ismet 2 | temur 2 |
      | ismet 3 | temur 3 |
      | ismet 4 | temur 4 |
      | ismet 5 | temur 5 |