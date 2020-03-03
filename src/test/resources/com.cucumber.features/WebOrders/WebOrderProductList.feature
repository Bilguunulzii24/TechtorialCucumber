Feature: This is for web order all products
  Scenario: Validation of all product data
    Given the user navigate to the webOrders page
    When the user provide valid userName
    And the user provide valid password
    Then the user click view all products button
    And the user validate product table