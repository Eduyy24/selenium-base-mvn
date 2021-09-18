package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import utils.UtilsElement;

public class CheckBoxPage extends UtilsElement {
    private String btnCollapseHome = "//*[@id='tree-node']/ol/li/span/button";


    public WebElementFacade getBtnCollapseHome() {
        return $(btnCollapseHome);
    }

    public WebElementFacade getOptionChecks(String option) {
        String xpath = "//*[text()='"+option+"']";
        System.out.println("xpath getOptionChecks(): "+ xpath);
        return $(xpath);
    }
}
