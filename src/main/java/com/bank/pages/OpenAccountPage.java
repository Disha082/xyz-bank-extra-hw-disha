package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");

    By customerDropdown = By.id("userSelect");
    By currencyDropdown = By.id("currency");
    By processButton = By.xpath("//button[contains(text(),'Process')]");
    By customerTab = By.xpath("//button[normalize-space()='Customers']");


    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }

    public void searchAndSelectCreatedCustomer() {
        selectByContainsTextFromDropDown(customerDropdown, "Harry Potter");
    }

    public void selectPoundInCurrency() {
        selectByContainsTextFromDropDown(currencyDropdown,"Pound");
    }

    public void clickOnProcessButton() {
        clickOnElement(processButton);
    }
    public String getTextFromPopup(){
        return getTextFromAlert();
    }
    public void clickOnPopup(){
        acceptAlert();
    }


}
