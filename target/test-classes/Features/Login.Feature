Feature: Login

  Scenario Outline: Login to Website Tocsport
    Given User Browser open, homepage of tocsport
    When User is on form login
    When User enters <username> and <passworld>
    When User click button login
    Then User can navigated to hompage

    Examples: 
      | username              | passworld    | Result |
      | ratlaliko@gmail.com   | phuongnam99  | Pass   |
      | ratlaliko@gmail.com   |              | Fail   |
      |                       | phuongnam99  | Fail   |
      | 4343434343&^$#%$#@#@# | 000000000000 | Fail   |
