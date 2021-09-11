package utils;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.yecht.Data;

public class UtilsElement extends PageObject {

    public void setHighLine(WebElementFacade element){
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript ("arguments[0].style.border='1px solid #e91e63';",element);
    }

    public void removeHighLine(WebElementFacade element){
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript ("arguments[0].style.border='none';",element);
    }

    public void click (WebElementFacade element) {
        setHighLine(element);
        element.waitUntilClickable();
        element.click();
    }

    public String getTextElements(WebElementFacade element){
        setHighLine(element);
        String text = element.getText();
        removeHighLine(element);
        return text;
    }

    public void typeInput(WebElementFacade element, String input) {
        setHighLine(element);
        element.type(input);
        removeHighLine(element);
    }

    public void scrollForPixel(String pixels) {
        JavascriptExecutor j = (JavascriptExecutor) getDriver();
        j.executeScript("window.scrollBy(0,"+pixels+")");
    }

}
