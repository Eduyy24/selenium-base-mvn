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
        textBoxSteps.setInputName("Eduardo");
        textBoxSteps.submitForm();
    }

    @Then("^Valido el envio exitoso del campo Full name$")
    public void valido_el_envio_exitoso_del_campo_Full_name() {
        textBoxSteps.validateFieldName();
    }

    @When("^Diligencio el campo Email con \"([^\"]*)\"$")
    public void diligencio_el_campo_Email_con(String input) {
       textBoxSteps.setInputEmail(input);
       textBoxSteps.submitForm();
    }

    @Then("^No se realiza el submit de los datos ingresados$")
    public void no_se_realiza_el_submit_de_los_datos_ingresados() {
      textBoxSteps.validateFieldEmail(false);
    }

    @Then("^Se realiza correctamente el submit con la información ingresada$")
    public void se_realiza_correctamente_el_submit_con_la_información_ingresada() {
        textBoxSteps.validateFieldEmail(true);
        textBoxSteps.validateContentEmail();
    }

    @When("^Diligencio el formulario con: \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void diligencio_el_formulario_con(String name, String email, String cAddress, String pAddress) {
        textBoxSteps.setInputName(name);
        textBoxSteps.setInputEmail(email);
        textBoxSteps.setInpCAdress(cAddress);
        textBoxSteps.setInpPAdress(pAddress);
        textBoxSteps.submitForm();
    }


    @Then("^Envio exitoso de los datos del formulario$")
    public void envio_exitoso_de_los_datos_del_formulario() {

    }
}
