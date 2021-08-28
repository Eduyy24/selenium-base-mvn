package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.UtilsElement;

@DefaultUrl("https://demoqa.com/elements")
public class ElementsPage extends UtilsElement {
    public String lblTitlePage = "//*[@class='main-header']";

    public String getTextLabelPage() {
        return getTextElements(lblTitlePage);
    }

}
