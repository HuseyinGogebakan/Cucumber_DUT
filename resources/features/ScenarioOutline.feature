Feature: scenario Outline


  # Parametere kisimlaro hardcoded olmadan examples tablosundan belirtilen
  # basliklar gonderilir
  Scenario Outline:
    Given Number1 <number1>
    And   Number2 <number2>
    When  sum of the two number
    Then  result is <sum>

    Examples:
    |number1|number2|sum|
    |  12   |  5    | 17|
    |  4    |  2    | 6 |
    |   6   |   5   | 11|
    | 213   | 2    | 215|
