package steps;

import net.thucydides.core.annotations.Step;
import pages.ElementsPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

import static org.junit.Assert.assertThat;

public class ElementsSteps {
    ElementsPage elementsPage;
    String titlePage = "Elements";

    @Step
    public void validateLabel() {
       String textLabel = elementsPage.getTextLabelPage();
       assertThat(textLabel, equalTo(titlePage));
    }
}
