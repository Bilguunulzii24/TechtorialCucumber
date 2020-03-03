Feature: This is for search functionality on Etsy

  Background:
    Given The user navigate to the webPage

    @WoodenSpoon
  Scenario: Validate title for wooden spoon
    Then The user search for wooden spoon
    And The user validate the title "Wooden spoon | Etsy"

    @MakeUp
  Scenario: Search and validate make up organizer
    Then The user search for make up organizer
    And The user validate the title "Make up organizer | Etsy"


