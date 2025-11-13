Feature: Contact Us Datatable

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario: Contact Us Functionality

    And Click on Element Navigate
      | ContactUs |

    And User sending info in Dialog
      | enquiryArea | Merhaba Datatableın gücü adına |

    And Click on Element Dialog
      | submitBtn |

    Then Success message should be in URL
