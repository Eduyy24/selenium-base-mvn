@Regresion
@CriticalRoute
Feature: Check Box

  @Caso1
  Scenario: Despliegue de las opciones dentro de la carpeta Home
    Given Ingreso a la pagina principal
    And Ingreso al modulo de elements
    And Ingreso a la seccion de "Check Box"
    When Abro la carpeta home
    Then Valido el despliegue de las opciones
    |   Desktop    |
    |   Documents  |
    |   Downloads  |

  @Caso2
  Scenario: Selecionar la opción Classified en Home/Documents/Office
    Given Ingreso a la pagina principal
    And Ingreso al modulo de elements
    And Ingreso a la seccion de "Check Box"
    When Selecciono la opción en la ruta "Home/Downolads"
      |   Classified  |
      |   Private     |
      |   Public      |
    Then Valido el mensaje de seleción de opciones
