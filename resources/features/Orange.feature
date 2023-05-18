Feature: Orange feature scenario outline

  Scenario Outline: enter website orange
    Given  orange website
    When  enter username "<Username>"
    And  enter password "<Password>"
    Then verify the title


    Examples: orange website username value
    |Username|Password|
    |Admin   |admin123|