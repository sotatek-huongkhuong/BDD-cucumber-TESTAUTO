Feature: Register account

  Scenario Outline: Register account successfull
    Given user browser is opened
    When user is on form register
    And user Enters <username> and <passworld>
    When user click register
    Then user can see result

    Examples: 
      | username                   | passworld    | Result |
      | ratlaliko@gmail.com        | phuongnam99  | Fail   |
      | phuongnam.utey@gmail.com   |              | Fail   |
      | phuongnam.utehy@gmail.com  | phuongnam99  | Fail   |
      | **($#%%%^^%%%$$****////*** | 000000000000 | Fail   |
