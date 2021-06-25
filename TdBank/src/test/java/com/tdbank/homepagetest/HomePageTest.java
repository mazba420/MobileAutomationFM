package com.tdbank.homepagetest;

import com.td.pages.HomePage;
import common.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.ExtentTestManager;

public class HomePageTest extends TestBase {

private static final Logger logger = Logger.getLogger(HomePageTest.class);

    HomePage homePage;
    @Test(enabled = false)
    public void validateUserCanClickONAccountsButton(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnAccounts();
        ExtentTestManager.log("Accounts click from home page",logger);
    }

    @Test
    public void validateUserCanClickOnTransferButton(){
        homePage.clickOnTransferBtn();
        ExtentTestManager.log("click on transfer button",logger);
    }











}
