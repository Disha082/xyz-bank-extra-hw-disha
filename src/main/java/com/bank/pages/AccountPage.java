package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By clickOnDeposit = By.xpath("//div[@class='borderM box padT20 ng-scope']/div[3]/button[2]");

    public void userClickOnDeposit() {
        clickOnElement(clickOnDeposit);

    }

    By amountToBeDeposited = By.xpath("//input[@placeholder='amount']");

    public void enterAmountOnAmountField() {
        sendTextToElement(amountToBeDeposited, "100");
    }

    By deposit = By.xpath("//button[@type='submit']");

    public void clickOnDeposit() {
        clickOnElement(deposit);
    }

    By verifyText= By.xpath("//span[@class='error ng-binding']");
    public String verifyTextMessage (String text){
        return getTextFormElement(verifyText);
    }
    By clickOnWithDrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    public void userClickOnWithDrawl(){
        clickOnElement(clickOnWithDrawl);
    }
    By clickOnAmountToBeWitthdrawn= By.xpath("//input[@placeholder='amount']");
    public void userClickOnAmountField(){
        clickOnElement(clickOnAmountToBeWitthdrawn);
    }
    By withdrawAmount = By.xpath("//input[@placeholder='amount']");
    public void userClickOnAmountToBeWithDrawn50(){
        sendTextToElement(withdrawAmount,"50");
    }

    By clickOnWithdrawButton = By.xpath("//button[@type='submit']");
    public void userClickOnWithdrawButton(){
        clickOnElement(clickOnWithdrawButton);
    }
    By verifyTransactionMessage = By.xpath("//span[@class='error ng-binding']");
    public String verifyTransactionMessage(){
        return getTextFormElement(verifyTransactionMessage);

    }
    }

