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

  @Caso2
  Scenario: Se valida que el campo Email no reciba un string sin formato example@example.com
    Given Ingreso a la pagina principal
    And Ingreso al modulo de elements
    And Ingreso a la secion de Text Box
    When Diligencio el campo Email con "exampleexample.com"
    Then No se realiza el submit de los datos ingresados

  @Caso3
  Scenario: Se valida que el campo Email reciba y envie correctamente un string con formato example@example.com
    Given Ingreso a la pagina principal
    And Ingreso al modulo de elements
    And Ingreso a la secion de Text Box
    When Diligencio el campo Email con "example@example.com"
    Then Se realiza correctamente el submit con la información ingresada


  @Caso4
  Scenario Outline: Diligenciamiento exitoso del formulario Text Box
    Given Ingreso a la pagina principal
    And Ingreso al modulo de elements
    And Ingreso a la secion de Text Box
    When Diligencio el formulario con: <name>, <email>, <c_address>, <p_address>
    Then Envio exitoso de los datos del formulario

    Examples:
    | name      | email             | c_address   | p_address       |
    | "Eduardo" | "Edu@edu.com"     | ""          | ""              |
    | "Luis"    | "Hola@gmail.com"  | "no tengo"  | "mucho nmenos"  |

