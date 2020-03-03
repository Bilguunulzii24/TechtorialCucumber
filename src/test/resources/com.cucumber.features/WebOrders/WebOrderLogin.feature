Feature: WebOrders login functionality
  Scenario: WebOrders login positive testing 1
    Given the user navigate to the webOrders page
    When the user provide valid userName
    And the user provide valid password
    Then the user should see home page


  Scenario: WebOrders menu positive testing 2
    Then the user validate order menu list

