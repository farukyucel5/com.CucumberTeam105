@wip
Feature:Bacground kullanımı

  Background:Tüm senaryolar için ortak adımlar
    Given kullanici amazon anasayfaya gider

  Scenario: TC03 kullanıcı parametreli method ile Nutella aratır

    Then amazon arama kutusuna "Nutella" yazıp aratir
    And arama sonuclarinin "Nutella" icerdigini test eder
    And sayfayi kapatir


  Scenario:  TC03 kullanıcı parametreli method ile java aratır
    Then amazon arama kutusuna "Java" yazıp aratir
    And arama sonuclarinin "Java" icerdigini test eder
    And sayfayi kapatir