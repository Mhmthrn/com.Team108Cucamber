Feature: US1006 Kullanici Scenario outline ile birden fazla test item aratir

  Scenario Outline: TC10 Amazon coklu urun testi

    Given kullanici "amazonUrl" anasayfaya gider
    Then amazonda "<kelimeler>" icin arama yapar
    Then arama sonuclarinin "<kelimeler>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | kelimeler |
      | Nutella |
      | Java |
      | Samsung |
      | Apple |
      | Nedim |