package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.ElementsSteps;
import steps.TextBoxSteps;

public class TextBoxDefinition {

    @Steps
    ElementsSteps elementsSteps;

    @Steps
    TextBoxSteps textBoxSteps;

    @Given("^Ingreso a la secion de Text Box$")
    public void ingreso_a_la_secion_de_Text_Box() {
        elementsSteps.goToSectionTexBox();
    }


    @When("^Diligencio el campo Full name$")
    public void diligencio_el_campo_Full_name() {
        textBoxSteps.setInputName();
    }

    @Then("^Valido el envio exitoso del campo Full name$")
    public void valido_el_envio_exitoso_del_campo_Full_name() {

    }
}
