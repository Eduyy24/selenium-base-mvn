package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.UtilsElement;

@DefaultUrl("https://demoqa.com/elements")
public class ElementsPage extends UtilsElement {
    private String lblTitlePage = "//*[@class='main-header']";
    private String sectionTextBox = "//*[@class='accordion']/div[1]/div/ul/li[1]";

    public WebElementFacade getLblTitlePageElement() {
        return $(lblTitlePage);
    }

    public WebElementFacade getSectionTextBoxElement() {
        return $(sectionTextBox);
    }

    public WebElementFacade getSectionElement(String section) {
        //*[@class='accordion']/div[1]/div/ul/li/span[text()='Web Tables']
        return element(By.xpath("//*[@class='accordion']/div[1]/div/ul/li/span[text()='" + section + "']"));
    }

    /**
     * String a = "hola"
     * String b = "Eduardo"
     * String c = a + b => holaEduardo
     * String c = a + " " + b => hola Eduardo
     */

}
