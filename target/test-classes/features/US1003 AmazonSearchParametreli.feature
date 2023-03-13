Feature: US1003 Kullanici Amazonda parametre olarak yazidigi kelimeyi aratir

  Scenario: TC07 Kullanici parametre ile arama yaptirabilmeli
    Given kullanici Amazon anasayfaya gider
    Then amazonda "Macbook" icin arama yapar
    And arama sonuclarinin "Macbook" icerdigini test eder
    And 3 saniye bekler
    And sayfayi kapatir