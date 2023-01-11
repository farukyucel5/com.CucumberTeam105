Feature: US1002 Kullanıcı amazon anasayfada birden fazla ürün aratır.


  Scenario: TC02 Kullanıcı urunleri aratıp test edebilmeli
    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna nutella yazıp aratir
    And arama sonuclarinin nutella icerdigini test eder
    And sayfayi kapatir

    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Java yazıp aratir
    And arama sonuclarinin Java icerdigini test eder
    Then sayfayi kapatir


    Given kullanici amazon anasayfaya gider
    Then amazon arama kutusuna Samsung yazıp aratir
    And arama sonuclarinin Samsung icerdigini test eder
    Then sayfayi kapatir