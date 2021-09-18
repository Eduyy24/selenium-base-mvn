package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import utils.UtilsElement;

public class HomeSteps {
    HomePage homePage;

    @Step
    public void goToInitialPage() {
        homePage.open();
        homePage.maximizeWindow();
    }

    @Step
    public void goToElements() {
        homePage.click(homePage.getBtnElement());
    }

}