@API
Feature: Symphony Bot

  @SeverityLevel.NORMAL
  @tmsLink=DEMO-1
  @api
  Scenario: User should be able ask bot a question
    When User sends POST request to ask a question "Hello, what can I do with your help"
    Then The status code is 200
    And Response message contains "As an AI assistant, I can assist you with a variety of inquiries related to Symphony Solutions."