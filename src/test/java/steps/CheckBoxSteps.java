package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import pages.CheckBoxPage;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckBoxSteps {
    CheckBoxPage checkBoxPage;

    @Step
    public void openFolderHome () {
        WebElementFacade e = checkBoxPage.getBtnCollapseHome();
        checkBoxPage.click(e);
    }


    public void validateDisplayedOptions(List<String> options) {
        /*
        for (int i = 0; i < options.size(); i++) {
            WebElementFacade e = checkBoxPage.getOptionChecks(options.get(i));
            assertThat(e.isVisible(), is(true));
        }
         posicion:         0       1       2
         valor:        | "hola" |"chao" |"adios"
         */
        for (String value: options) {
            System.out.println("validate: "+ value);
            WebElementFacade element = checkBoxPage.getOptionChecks(value);
            assertThat(element.isVisible(), is(true));
        }
    }
}
