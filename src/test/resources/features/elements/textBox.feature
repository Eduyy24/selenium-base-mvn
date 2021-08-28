@Regresion
@CriticalRoute
Feature: Text Box

  @Caso1
  Scenario: Diligenciamiento y envio del campo Full name
    Given Ingreso a la pagina principal
    And Ingreso al modulo de elements
    And Ingreso a la secion de Text Box
    When Diligencio el campo Full name
    Then Valido el envio exitoso del campo Full name

