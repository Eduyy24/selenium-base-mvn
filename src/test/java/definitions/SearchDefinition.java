package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeSteps;

public class SearchDefinition {

    @Steps
    private HomeSteps mHomeSteps;

    /**
     * 1. Abro la pagina de Google
     * 2. Verifico que estoy en la página de google --> Buena practica
     */
    @Given("^Estoy en la pagina de inicio de google$")
    public void estoy_en_la_pagina_de_inicio_de_google() {
        mHomeSteps.goToGoogle();
        mHomeSteps.verifyGoogle();
    }


    /**
     * 1. Escribo en el buscador Eduardo
     * 2. le doy en buscar con google
     */
    @When("^Realizo la busqueda de Eduardo en google // accion$")
    public void realizo_la_busqueda_de_Eduardo_en_google_accion() {
        mHomeSteps.setTextInSearcher("Eduardo");
        //mHomeSteps.clickSearchInGoogle();
    }

    /**
     * Valido que no exista el mensaje de no resultados
     */
    @Then("^Deberian aparecer los resultados de la busqueda$")
    public void deberian_aparecer_los_resultados_de_la_busqueda() {
        mHomeSteps.validateLblNoResult();
    }
}
