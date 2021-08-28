package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import utils.UtilsElement;

public class TextBoxPage extends UtilsElement {
    private String inputName = "userName";

    public void setInputName(String input) {
        WebElementFacade element = element(By.id(inputName));
        element.type(input);
    }
}
