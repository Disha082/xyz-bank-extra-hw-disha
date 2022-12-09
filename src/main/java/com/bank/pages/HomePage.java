package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLogin = By.xpath("//button[text() = 'Bank Manager Login']");



    public void clickOnBankManagerLogin(){
        clickOnElement(bankManagerLogin);
    }

}


