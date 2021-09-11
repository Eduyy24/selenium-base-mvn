package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.UtilsElement;

@DefaultUrl("https://demoqa.com/elements")
public class ElementsPage extends UtilsElement {
    private String lblTitlePage = "//*[@class='main-header']";
    private String sectionTextBox = "//*[@class='accordion']/div[1]/div/ul/li[1]";

    public String getTextLabelPage() {
        return getTextElements($(lblTitlePage));
    }

    public void clickSectionTextBox() {
        click($(sectionTextBox));
    }

}
