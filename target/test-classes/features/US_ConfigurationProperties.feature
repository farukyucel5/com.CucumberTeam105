Feature: Configuration Properties kullanımı

  #3 senaryo oluşturup amazon,wisequarter ve walmart sitelerine gidin ve gidildigini test edin
  Scenario: TC06
    Given kullanici "amazonUrl" anasayfaya gider
    Then urlin "amazon" oldugunu dogrular
    And sayfayi kapatir


  Scenario: TC06
    Given kullanici "wsUrL" anasayfaya gider
    Then urlin "wisequarter" oldugunu dogrular
    And sayfayi kapatir