@US_008_Test
Feature: US_008_TC_001

  @US008_TC001_UI
  Scenario:International patients should be able to register
    Given user goes to the "acibademHastaneleri_url"
    And user click MENU button
    And user click on FOR INTERNATIONAL PATIENTS button
    And user enter firstname
    And user enter lastname
    And user enter  E-mail
    And user enter Phone Number
    And user select Country as NETHERLANDS
    And user select Treatment Units as Cardiology
    And user enter message as I want to be treat in your hospital
    And user click Checkbox
    And user click SEND button