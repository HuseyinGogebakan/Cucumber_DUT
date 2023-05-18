Feature: Background usage

  Background: First  scenarios of
    Given user at google.com

  Scenario: Google amazon search

    When  Enters amazon on search tab
    And  execute to search
    Then  titel amazon

  Scenario:

    When  Enters linkedin on search tab
    And execute search
    Then  titel linkedin