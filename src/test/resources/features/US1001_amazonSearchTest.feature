Feature: US1001 Kullanıcı amazonda test yapar

  Scenario: TC01 Kullanıcı amazonda nutella aratır
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna nutella yazıp aratir
    And arama sonuclarinin nutella icerdigini test eder
    Then sayfayi kapatir