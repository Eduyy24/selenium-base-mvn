package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import utils.UtilsElement;

@DefaultUrl("https://demoqa.com/")
public class HomePage extends UtilsElement {
     private final String elementsButton = "//*[@class='category-cards']/div[1]";

     public void clickInElements() {
          click(elementsButton);
     }

     public void maximizeWindow() {
          getDriver().manage().window().maximize();
     }
}
