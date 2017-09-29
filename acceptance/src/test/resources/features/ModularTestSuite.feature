Feature: Run tests against code from another module

  Scenario: Run tests on ThisIsTheApp
    Given I have The App
    When I ask about the frequency
    Then Dan give me an answer