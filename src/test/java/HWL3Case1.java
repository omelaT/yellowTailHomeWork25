import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.WelcomePage;
import utils.Constants;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HWL3Case1 extends JunitRunner {


    @Test

    public void verifyElementsOnWelcomePageIsdisplayed() {
        WelcomePage welcomePage = new WelcomePage();

        Assertions.assertTrue(welcomePage.legalTextDisplayedOnWelcomePage());
        Assertions.assertTrue(welcomePage.checkboxTextDisplayedOnWelcomePage());
        Assertions.assertTrue(welcomePage.selectIsDispalyedOnWelcomePage());
        Assertions.assertTrue(welcomePage.welcomeButtonIsDispalyedOnWelcomePage());
        Assertions.assertFalse(welcomePage.welcomeButtonIsInactiveOnWelcomePage());

    }

}
