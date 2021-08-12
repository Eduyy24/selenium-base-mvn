@Regresion
Feature: Buscador en google

  @SmokeTest
  Scenario: Busqueda de Eduardo en google
    Given Estoy en la pagina de inicio de google
    When Realizo la busqueda de Eduardo en google // accion
    Then Deberian aparecer los resultados de la busqueda

  @CriticalRoute
  Scenario: Busqueda de Eduardo en google
    Given Estoy en la pagina de inicio de google
    When Realizo la busqueda de Eduardo en google // accion
    Then Deberian aparecer los resultados de la busqueda