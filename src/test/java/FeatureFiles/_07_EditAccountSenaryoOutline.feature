# Senaryo
# 1- Siteyi açınız.
# 2- Edit Account sayfasına ulaşınız.
# 3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
# 4- Bu senaryoyu farklı 5 adet ad ve soyad ile test ediniz.

Feature: Edit Account Senaryo Outline

  Background: #before senaryo
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Edit Account Functionality
    And Navigate to Edit Account
    When Edit Account name as "<name>" surname as "<surname>"
    Then Success message should be displayed

    Examples:
      | name  | surname |
      | ismet | Temur   |
      | Ali   | Yılmaz  |
      | Ayşe  | Kaya    |
      | Ahmet | Bilir   |
      | Zilha | Yapar   |