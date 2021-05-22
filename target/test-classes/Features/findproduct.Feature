Feature: Find & choose product in cart

  Scenario: Find Product
    Given User in the homepage of tocsport
    When User CLick textboxt find product
    And User enters product want to find
    Then User can see list product

  Scenario: Add product to Cart
    Given user list product
    And user choose product
    When user click on product and user move to cart
    Then user can payment product or continue shopping

  Scenario: Choose new Product
    Given User List product new
    And user Choose new product
    When add product to cart
    Then user add to cart and paying bill
