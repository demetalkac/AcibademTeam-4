@US_002_Test
Feature: US_002_TC_001

  @US002_TC001_UI
  Scenario:Kullanıcı hastaneler sayfasında filtrelemeyi kullanarak istediği hastaneyi seçebilmeli.
    Given Anasayfaya git
    And Hastaneler sekmesine tikla
    And Filtreleme Siralama, Lokasyon Turu secenekleri gor ve sec
    And Konum acik olmadiginda en yakin konum secenegi secilemez olmali
    And Daha iyi bir deneyim icin konum izni vermelisiniz. cumlesi gorulur olmali
    And Gorulen secenekler secilebilir olmali










