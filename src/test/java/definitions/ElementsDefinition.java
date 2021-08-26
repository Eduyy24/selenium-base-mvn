package definitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;

public class ElementsDefinition {
    @Steps
    HomeSteps homeSteps;

    @Given("^Ingreso a la pagina principal$")
    public void ingreso_a_la_pagina_principal() {
        homeSteps.goToInitialPage();

    }

    @When("^Ingreso al modulo de elements$")
    public void ingreso_al_modulo_de_elements() {
        homeSteps.goToElements();
    }

    @Then("^Valido el ingreso exitoso al modulo element$")
    public void valido_el_ingreso_exitoso_al_modulo_element() {

    }
}
