Feature: Datatable ornek

  Scenario: Users List

    When write username "ismet"
    And write username and password "ismet" and "1234"

    And write username as Datatable
      | ismet |
      | ali   |
      | veli  |

    And write username and password  as Datatable
      | ismet | 1234  |
      | ali   | a1234 |
      | veli  | a1234 |
