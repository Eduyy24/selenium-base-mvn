package definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CheckBoxSteps;
import steps.ElementsSteps;

import java.lang.reflect.Array;
import java.util.List;

public class CheckBoxDefinition {
    @Steps
    ElementsSteps elementsSteps;

    @Steps
    CheckBoxSteps checkBoxSteps;

    @Given("^Ingreso a la seccion de \"([^\"]*)\"$")
    public void ingreso_a_la_seccion_de(String section) {
        elementsSteps.goToSection(section);
    }


    @When("^Abro la carpeta home$")
    public void abro_la_carpeta_home() {
        checkBoxSteps.openFolderHome();
    }

    @Then("^Valido el despliegue de las opciones$")
    public void valido_el_despliegue_de_las_opciones(DataTable data) {
        List<String> options = data.asList(String.class);
        checkBoxSteps.validateDisplayedOptions(options);


        /**
         *  {  // clave = valor
         *      1 = "hola",
         *      2 = "chao"
         *  }
         */
    }

}
