Feature: Search. Run query and analyze test results

  @SeverityLevel.NORMAL
  @tmsLink=DEMO-4
  @ui
  @google
  @AC3-DEMO4
  Scenario: 01.01.01 Google Search. Search Action
    Given I open Google Page
    And Enter search query into text input
    Then Search results returned

  @SeverityLevel.NORMAL
  @tmsLink=DEMO-5
  @ui
  @google
  @AC3-DEMO5
  Scenario: 01.01.02 Google Search. Verify Footer Element Names
    Given I open Google Page
    And Enter search query into text input
    Then Verify search results returned selenide website as first link:
      | Selenide: concise UI tests in Java            |

  @SeverityLevel.NORMAL
  @tmsLink=DEMO-6
  @ui
  @google
  @AC3-DEMO6
  Scenario: 01.01.01 Google Search. Logo click
    Given I open Google Page
    And Enter search query into text input
    When User clicks logo
    Then Verify that user is on Google Start page