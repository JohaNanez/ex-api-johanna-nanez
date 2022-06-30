Feature: Obtener Usuario

  @test1
  Scenario: Obtener usuario con datos correctos

    When cuando consultamos la pagina freetogame con la platform "pc", category "shooter"
    Then el codigo de respuesta es 200



