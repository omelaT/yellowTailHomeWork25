import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DriverProvider;
import pages.MainPage;
import pages.WelcomePage;

public class HWL4Case6 extends JunitRunner{

    @Test
    public void requirenmentElementsDisplayedOnMainPage() throws InterruptedException {
        DriverProvider.getDriver().get("https://www.yellowtailwine.com");
        //precondition
        WelcomePage welcomePage = new WelcomePage();

        welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();

        MainPage mainPage = new MainPage();
        Assertions.assertTrue(mainPage.verifyThisIsMainPage());
        System.out.println("main page");
        // Click on Menu button
        mainPage.clickOnMenuButtonOnMainPage();
        System.out.println("click on menu btn");

        //Click on Globe icon
        mainPage.clickOnTheGlobeIcon();
        System.out.println("click globe btn");
//Thread.sleep(5000);
        mainPage.waitForElementChina();
        //Select China
        mainPage.selectChinaAndClick();
        System.out.println("success click");
        // Verify that language is changed
        //- find your wine button
       // WebElement findYourWineButton = driver.findElement(By.cssSelector("[class=\"sgg-comp-button-inner\"]"));
        Assertions.assertTrue( mainPage.getChangedLanguageOnFindYourWineButton().contains("发现适合你的酒"));
        System.out.println("success");
    }
}