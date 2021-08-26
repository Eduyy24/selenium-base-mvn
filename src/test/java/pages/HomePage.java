package pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import utils.UtilsElement;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends UtilsElement {
     public static String elementsButton = "//*[@class='category-cards']/div[1]";

    public void click (String ref) {
        WebElementFacade element = element(By.xpath(ref));
        setHighLine(element);
        element.click();
    }

}
