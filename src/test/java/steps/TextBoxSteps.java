package steps;

import net.thucydides.core.annotations.Step;
import pages.TextBoxPage;

public class TextBoxSteps {
    TextBoxPage textBoxPage;

    @Step
    public void setInputName(){
        textBoxPage.setInputName("Eduardo");
    }
}
