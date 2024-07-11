Feature: Google search

  @smoke
  Scenario: Perform a basic search on Google
    Given I am on the Google search page
    When I search for "Loviu"
    Then I should see results related to "automation"
