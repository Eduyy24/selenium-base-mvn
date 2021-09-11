package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import utils.UtilsElement;

public class TextBoxPage extends UtilsElement {
    //inputs
    private String iptNameXpath = "//*[@id='userName']";
    private String iptEmail = "//*[@id='userEmail']";
    private String iptCAddress = "//*[@id='currentAddress']";
    private String iptPAddress = "//*[@id='permanentAddress']";


    //buttons
    private String btnSubmitXpath = "//*[@id='submit']";

    //labels
    private String lblNameSubmitXpath = "//*[@id='name']";
    private String lblEmailSubmit = "//*[@id='email']";

    /*@FindBy(xpath = "//*[@id='email']")
    private WebElementFacade lblEmailSubmitV2;

    public WebElementFacade getLblEmailSubmitV2(){
        return  lblEmailSubmitV2;
    }*/

    public WebElementFacade getIptNameElement() {
        return element(By.xpath(iptNameXpath));
    }

    public WebElementFacade getBtnSubmitElement() {
        return $(btnSubmitXpath);
    }

    public WebElementFacade getLblNameElement() {
        return $(lblNameSubmitXpath);
    }

    public WebElementFacade getIptEmailElement() {
        return $(iptEmail);
    }

    public WebElementFacade getlblEmailElement() {
        return $(lblEmailSubmit);
    }

    public WebElementFacade getIptCAddressElement() {
        return $(iptCAddress);
    }

    public WebElementFacade getIptPAdressElement() {
        return $(iptPAddress);
    }
}
