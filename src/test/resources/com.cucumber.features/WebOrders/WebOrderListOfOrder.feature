Feature: This is for web order list of orders

  @smoke
  Scenario: Validation of list of all orders
    Given the user navigate to the webOrders page
    When the user provide valid userName
    And the user provide valid password
    Then the user click view all orders button
    And the user validate the header text "List of All Orders"