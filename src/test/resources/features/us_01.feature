@US_001_Test
Feature: US_001_TC_001

  @US001_TC001_UI
  Scenario:Kullanıcı ana sayfadaki arama motorunu kullanabilmeli
    Given Anasayfaya git
    And Size nasil yardimci olabiliriz?' yazisi gor
    And Arama kutusuna tikla
    And Aranacak kelime arama kutusuna yazilarak -Populer Aramalar-in gorunurlugu dogrula
    And Aranacak kelime arama kutusuna yazilarak secilebilecek seceneklerin tiklanabilirligi dogrula
    And Aranacak kelime arama kutusuna yazilarak secilebilecek seceneklerin gorunurlugu dogrula
    And Arama kutusunda bulunan kelimenin enter tusu ile aranip aranamayacagi dogrula
    And Arama kutusunda bulunan arama butonunun gorunurlugu ve tiklanilabilirligi dogrula
    And Kapatma carpisi gorunurlugu dogrula
