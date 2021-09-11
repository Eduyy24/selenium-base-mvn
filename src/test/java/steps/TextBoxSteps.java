package steps;

import net.thucydides.core.annotations.Step;
import pages.TextBoxPage;



import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TextBoxSteps {
    TextBoxPage textBoxPage;
    private String contentEmail;
    @Step
    public void setInputName(){
        textBoxPage.setInputName("Eduardo");
    }

    @Step
    public void submitForm() {
        textBoxPage.clickBtnSubmit();
    }

    @Step
    public void validateFieldName() {
        String text = textBoxPage.getTextLabelName();
        assertThat(text, containsString("Eduardo"));
    }

    @Step
    public void setInputEmail(String input) {
        this.contentEmail = input;
        textBoxPage.setInputEmail(input);
    }

    @Step
    public void validateFieldEmail(Boolean isPresent) {
        assertThat(textBoxPage.getLblEmailSubmit().isVisible(), is(isPresent));
    }

    public void validateContentEmail() {
        String textEmail = textBoxPage.getTextLblEmail();
        assertThat(textEmail, containsString(contentEmail));
    }
}
