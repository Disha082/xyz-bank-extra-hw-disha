package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomersLoginPage extends Utility {
    By customerLogin = By.xpath("//button[contains(text(),'Customer Login')]");
    public void clickOnCustomerLogin(){
       clickOnElement(customerLogin);
    }
    By clickOnYourName = By.xpath("//select[@id='userSelect']");
    public void userClickOnYourName(){
        clickOnElement(clickOnYourName);
    }
    By selectYourNameFromDropDown = By.xpath("//select[@id='userSelect']/child::*");
    public void userSelectYourNameFromDropDown(){
        List<WebElement> names = driver.findElements(selectYourNameFromDropDown);
      selectOptionsFromDropDown (names,"Harry Potter");
    }

    By clickOnLoginButton = By.xpath("//button[contains(text(),'Login')]");
    public void userClickOnLoginButton(){
        clickOnElement(clickOnLoginButton);
    }

    By verifyLogoutTab = By.xpath("//button[contains(text(),'Logout')]");
    public void verifyLogoutTab(){
        isDisplayedMethod(verifyLogoutTab);
    }
    By clickOnLogOutButton = By.xpath("//button[contains(text(),'Logout')]");
    public void userClickOnLogOutButton(){
        clickOnElement(clickOnLogOutButton);
    }
    By verifyYourName = By.xpath("//select[@id='userSelect']");
    public void verifyYourNameDisplayed(){
        List<WebElement> names = driver.findElements(verifyYourName);
        selectOptionsFromDropDown (names,"Harry Potter");


    }




}
