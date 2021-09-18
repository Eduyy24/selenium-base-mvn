package steps;

import net.serenitybdd.core.pages.WebElementFacade;
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
        WebElementFacade lblTilte = elementsPage.getLblTitlePageElement();
        String textLabel = elementsPage.getTextElements(lblTilte);
        assertThat(textLabel, equalTo(titlePage));
    }

    @Step
    public void goToSectionTexBox() {
        WebElementFacade btnTextBox = elementsPage.getSectionTextBoxElement();
        elementsPage.click(btnTextBox);
    }
}
