package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import pages.TextBoxPage;



import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TextBoxSteps {
    TextBoxPage textBoxPage;
    private String contentEmail;

    @Step
    public void setInputName(String input) {
        //input = "Eduardo"
        WebElementFacade inpName = textBoxPage.getIptNameElement();
        // inpName.type(input);
        textBoxPage.typeInput(inpName, input);
    }

    @Step
    public void submitForm() {
        WebElementFacade btnSubmit = textBoxPage.getBtnSubmitElement();
        //btnSubmit.click();
        textBoxPage.click(btnSubmit);
    }

    @Step
    public void validateFieldName() {
        WebElementFacade lblName = textBoxPage.getLblNameElement();
        String text = textBoxPage.getTextElements(lblName);
        assertThat(text, containsString("Eduardo"));
    }

    @Step
    public void setInputEmail(String input) {
        this.contentEmail = input;
        WebElementFacade e = textBoxPage.getIptEmailElement();
        textBoxPage.typeInput(e, input);
    }

    @Step
    public void validateFieldEmail(Boolean isPresent) {
        assertThat(textBoxPage.getlblEmailElement().isVisible(), is(isPresent));
    }

    public void validateContentEmail() {
        WebElementFacade e = textBoxPage.getlblEmailElement();
        String text = textBoxPage.getTextElements(e);
        assertThat(text, containsString(contentEmail));
    }

    @Step
    public void setInpCAdress(String input) {
        WebElementFacade iptCAddress = textBoxPage.getIptCAddressElement();
        textBoxPage.typeInput(iptCAddress, input);
    }

    @Step
    public void setInpPAdress(String input) {
        WebElementFacade iptPAddress = textBoxPage.getIptPAdressElement();
        textBoxPage.typeInput(iptPAddress, input);
    }
}
