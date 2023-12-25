@US_009_Test
Feature: US_001_TC_001

  @US009_TC001_UI
  Scenario: User should be able to get directions
    Given user goes to the "acibademHastaneleri_url"
    And user clicks on iletisim option
    And user clicks on Yol Tarifi Alın button
    Then verify user should see Google Map page
