Feature: Validate Home Page 

@tag1
  Scenario: Validate Home Page Title
    Given I open the Sky tube Application
    And I should allow pop ups
    Then I should validate home page title
