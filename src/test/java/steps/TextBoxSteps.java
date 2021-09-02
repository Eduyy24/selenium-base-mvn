package steps;

import net.thucydides.core.annotations.Step;
import pages.TextBoxPage;



import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class TextBoxSteps {
    TextBoxPage textBoxPage;

    @Step
    public void setInputName(){
        textBoxPage.setInputName("Eduardo");
    }

    public void submitForm() {
        textBoxPage.clickBtnSubmit();
    }

    public void validateFieldName() {
        String text = textBoxPage.getTextLabelName();
        assertThat(text, containsString("Eduardo"));
    }
}
