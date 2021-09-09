package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import utils.UtilsElement;

public class TextBoxPage extends UtilsElement {
    private String inputNameXpath = "//*[@id='userName']";
    private String btnSubmitXpath = "//*[@id='submit']";
    private String lblNameSubmitXpath = "//*[@id='name']";
    private String inputEmail = "//*[@id='userEmail']";
    private String lblEmailSubmit = "//*[@id='email']";


    public void setInputName(String input) {
        typeInput(inputNameXpath, input);
    }

    public void setInputEmail(String input) {typeInput(inputEmail, input);}

    public void clickBtnSubmit() {
        scrollForPixel("300");
        click(btnSubmitXpath);
    }

    public String getTextLabelName(){
        return getTextElements(lblNameSubmitXpath);
    }

    public WebElementFacade getLblEmailSubmit() {
        return $(lblEmailSubmit);
    }

    public String getTextLblEmail() {
        return getTextElements(lblEmailSubmit);
    }
}
