Feature: Contact Us Senaryo outline

  Background: #before senaryo
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Send a message
    And Navigate to ContactUs
    When Send a message as "<mesaj>" and click to Submit
    Then Success message should be in URL

    Examples:
      | mesaj                       |
      | Merhaba Testing dünyası     |
      | Öğrenilen konular: Java     |
      | Öğrenilen konular: Selenium |
      | Öğrenilen konular: TestNg   |
      | Öğrenilen konular: Cucumber |

         #  dataProvider (TestNG için), Senaryo Outline (cucumber)
         #  görevi verilen her değer kadar, tüm senayo çalışır