import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.DriverProvider;
import pages.MainPage;
import pages.WeiboComMainPage;
import pages.WelcomePage;



import java.util.Set;


public class HWL4Case7 extends JunitRunner {


    @Test
    public void mainPageGlobalNavLogic() throws InterruptedException {

        //precondition
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.checkboxClickEuropeSelectWelcomeBttonClick();

        MainPage mainPage = new MainPage();
        Assertions.assertTrue(mainPage.verifyThisIsMainPage());
        // Click on Menu button
        //add wait
    //    mainPage.waitForMenuButton();

        mainPage.clickOnMenuButtonOnMainPage();
        //Globe icon
        mainPage.globeIconIsVisible();
///////////
        //wait
        mainPage.waitForGlobeIcon();
       // mainPage.waitTime();

//click o Globe icon
        mainPage.clickOnTheGlobeIcon();

        //Select China
        mainPage.waitForElementChina();
       // mainPage.waitTime();

        mainPage.selectChinaAndClick();

        System.out.println("success click");

        //wait
       // mainPage.waitForIconAfterChinaSelected();
Thread.sleep(10000);
        //click
        Set<String> oldWindowsSet = DriverProvider.getDriver().getWindowHandles();
        mainPage.clickOnRedirectIcon();
        System.out.println("success click 2");
        //wait
      //  mainPage.waitForNewPage();

        WeiboComMainPage weiboComMainPage = new WeiboComMainPage();

        weiboComMainPage.getDescription(oldWindowsSet);
        //Verify that “https://www.weibo.com/yellowtailChina” site is open in new tab
        Assertions.assertTrue(DriverProvider.getDriver().getCurrentUrl().contains("weibo"));
        DriverProvider.getDriver().close();

    }
}