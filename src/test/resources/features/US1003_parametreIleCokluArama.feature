Feature: US1003 kullanıcı parametre olarak girirlen degerleri aratır


  Scenario: TC03 kullanıcı parametreli method ile Nutella aratır
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Nutella" yazıp aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


  Scenario:  TC03 kullanıcı parametreli method ile java aratır
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna "Java" yazıp aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir