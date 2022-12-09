package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    CustomerPage customerLoginPage = new CustomerPage();
    BankManagerLoginPage bankManagerLoginPage= new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersLoginPage customersPage = new CustomersLoginPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogin();
        customerLoginPage.clickOnAddCustomer1();
        customerLoginPage.enterNameOnFirstname("Jahnvi");
        customerLoginPage.enterNameOnLastname("Patel");
        customerLoginPage.enterPostCode("Ha3 6Pb");
        customerLoginPage.clickOnAddCustomer2();
        String expectedText = "Customer added successfully with customer id :6";
        Assert.assertEquals(customerLoginPage.getTextPopWindow(), expectedText, "Text Not matched");
        customerLoginPage.clickOnPopup();
    }
    @Test
    public void  bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        bankManagerLoginPage.clickOnBankManager();
        openAccountPage.clickOnOpenAccount();
        openAccountPage.searchAndSelectCreatedCustomer();
        openAccountPage.selectPoundInCurrency();
        openAccountPage.clickOnProcessButton();
        String expectedText = "Account created successfully with account Number :1016";
        Assert.assertEquals(openAccountPage.getTextFromPopup(),expectedText,"Text Not Matched");
        openAccountPage.clickOnPopup();


    }
    @Test
    public void customerShouldLoginAndLogoutSuceessfully(){
        customersPage.clickOnCustomerLogin();
        customersPage.userClickOnYourName();
        customersPage.userSelectYourNameFromDropDown();
        customersPage.userClickOnLoginButton();
        customersPage.verifyLogoutTab();
        customersPage.userClickOnLogOutButton();
        customersPage.verifyYourNameDisplayed();


    }
    @Test
    public void customerShouldDepositMoneySuccessfully(){
        customersPage.clickOnCustomerLogin();
        customersPage.userClickOnYourName();
        customersPage.userSelectYourNameFromDropDown();
        customersPage.userClickOnLoginButton();
        accountPage.userClickOnDeposit();
        accountPage.enterAmountOnAmountField();
        accountPage.clickOnDeposit();
       String expectedMessage =  "Deposit Successful";
        Assert.assertEquals(accountPage.verifyTextMessage("Deposit Successful"),expectedMessage);


    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        customersPage.clickOnCustomerLogin();
        customersPage.userClickOnYourName();
        customersPage.userSelectYourNameFromDropDown();
        customersPage.userClickOnLoginButton();
        accountPage.userClickOnWithDrawl();
        accountPage.enterAmountOnAmountField();
        accountPage.userClickOnAmountToBeWithDrawn50();
        accountPage.userClickOnWithdrawButton();
        String expectedMessage = "Transaction Failed. You can not withdraw amount more than the balance.";
        Assert.assertEquals(accountPage.verifyTransactionMessage(),expectedMessage,"Message Not Matched");


    }


}
