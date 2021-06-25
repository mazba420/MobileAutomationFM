package com.td.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.ExtentTestManager;

public class HomePage {


    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    private WebElement accounts ;
    @FindBy(xpath="//android.widget.Button[@text='TRANSFER']")
    private WebElement transferBtn;

   public void clickOnAccounts(){
       accounts.click();
   }

    public void clickOnTransferBtn(){
        transferBtn.click();
    }



}
