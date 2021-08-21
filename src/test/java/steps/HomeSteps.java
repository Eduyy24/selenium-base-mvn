package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;

public class HomeSteps {
    private HomePage homePage;

    @Step
    public void goToInitialPage() {
        homePage.open();
    }

}