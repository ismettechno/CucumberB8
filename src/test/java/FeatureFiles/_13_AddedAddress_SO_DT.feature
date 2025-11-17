Feature:  Add Adress Functionality

  Background:
    Given Navigate to WebSite
    When Enter username and password and click login button
    Then User should login successfully

  Scenario Outline: Add Address

    When Click on Element Navigate
      | AddressBook |
      | NewAddress  |

    Then User sending info in Dialog
      | firstName | <firstName> |
      | lastName  | <lastName>  |
      | Address1  | <Address1>  |
      | city      | <city>      |
      | postCode  | <postCode>  |

    Then Select Element set value on Dialog
      | inputCountry     | <countryId>   |

    Then Wait until clickable on Element Dialog
      | inputCountry   |

    Then Select Element set value on Dialog
      | inputregionState | <regionState> |

    Then Click on Element Dialog
      | ContinueBtn   |
      | NoThanksPopUp |

    Then Success message should be displayed

    Then Click on Element Dialog
      | deleteAdresClick   |

    Then Success message should be displayed

    Examples:
      | firstName | lastName | Address1      | city     | postCode | countryId      | regionState |
      | Rita      | Ora      | 11th Street   | London   | 123      | United Kingdom | Bristol     |
      | James     | Bond     | 5th Boulevard | New York | 125      | United States  | Georgia     |
      | Hilda     | Bjorn    | 6th Street    | Oslo     | 128      | Norway         | Nordland    |



