package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {
    By addCustomer1 = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNmae = By.xpath("//input[@placeholder='First Name']");
    By lastname = By.xpath("//input[@placeholder='Last Name']");
    By postCode = By.xpath("//input[@placeholder='Post Code']");
    By addCustomer2 = By.xpath("//button[@type='submit']");



    public void clickOnAddCustomer1(){
        clickOnElement(addCustomer1);
    }
    public void enterNameOnFirstname(String name){
        sendTextToElement(firstNmae,name);
    }
    public void enterNameOnLastname(String name){
        sendTextToElement(lastname,name);
    }
    public void enterPostCode(String code){
        sendTextToElement(postCode, code);
    }
    public void clickOnAddCustomer2(){
        clickOnElement(addCustomer2);
    }
    public String getTextPopWindow(){
        return getTextFromAlert();
    }
    public void clickOnPopup(){
        acceptAlert();
    }
}
