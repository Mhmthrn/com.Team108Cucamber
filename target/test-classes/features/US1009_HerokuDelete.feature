Feature: US1009 Herokuapp implictyly wait

  Scenario: TC19 kullanici implictyly wait ile gorevi yapabilmeli

    Given kullanici "herokuUrl" anasayfaya gider
    Then Add Element butonuna basar
    Then Delete butonu gorunur oluncaya kadar bekler
    Then Delete butonunun gorunur oldugunu test eder
    And  Delete butonuna basarak butonu siler
    Then Delete butonunun gorunmedigini test eder


