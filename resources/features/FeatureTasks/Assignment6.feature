Feature: Assign6

  Background:
    Given go to  qaclickacademy
  Scenario Outline: Assignment6
    Given Option is given as "<option>"
    When check the option
    And dropdown
    And Alert function
    Then  option is the selected one "<option>"



    Examples:
    |option|
    |Option3|
    |Option2|
    |Option1|
