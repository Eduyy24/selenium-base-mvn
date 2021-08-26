package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomeSteps {
    HomePage homePage;

    @Step
    public void goToInitialPage() {
        homePage.open();
    }

    @Step
    public void goToElements() {
        homePage.click(HomePage.elementsButton);
    }

}