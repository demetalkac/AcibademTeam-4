Feature: US_04
  Scenario: Medikal Teknoloji'den cihaz secme
    Given kullanici anasayfaya gider
    Then anasayfada Medikal Teknolojiler'e tiklar
    Then acilan sayfayi asagi kaydirir
    Then Tum Lokasyonlar dropdownundan hastaneyi secer
    Then sayfa acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    Then Tum Birimler dropdownundan "Check Up" secer
    Then sayfa acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    Then Tum Teknolojiler dropdownundan cihaz turunu secer secer
    Then sayfa acilana kadar bekler
    Then acilan sayfayi asagi kaydirir
    And cihazi secer