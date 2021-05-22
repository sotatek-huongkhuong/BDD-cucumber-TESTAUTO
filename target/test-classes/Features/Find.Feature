Feature: Searching Product

  Scenario Outline: Find product
    Given user browser is opened and tocsport homepage
    When user in the texbox search
    When user enter <product>
    Then user can see list product searched

    Examples: 
      | product       | status  |
      | giay the thao | success |
      | ao ba lo      | success |
      |         99888 | Fail    |
      |               | Fail    |
