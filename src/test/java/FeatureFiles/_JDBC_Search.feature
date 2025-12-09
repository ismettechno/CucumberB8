Feature: Testing JDBC Search functionality

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Search functionality
    And User sending info in Dialog
      | searchBox | mac |

    And Click on Element Dialog
      | srcBtn |

    Then Send The Query the Database "select urunAd from urunler where urunAd like '%mac%'" and control match