@Doktor
Feature: US_03
  Scenario: Lokasyondan doktor secme
    Given kullanici anasayfaya gider
    Then kullanici anasayfada doktorlar basligina tiklar
    Then kullanici doktorlar sayfasi acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    Then Tum Lokasyonlar dropdownundan hastaneyi secer
    Then sayfa acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    Then Tum Birimler dropdownundan birim secer
    Then sayfa acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    Then Tum Doktorlar dropdownundan doktor secer
    Then sayfa acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    And  doktoru sec
