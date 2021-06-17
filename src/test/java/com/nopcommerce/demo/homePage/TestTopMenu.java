package com.nopcommerce.demo.homePage;

import com.nopcommerce.demo.customlistners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.retryAnalyzer.RetryAnalyzer;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class TestTopMenu extends TestBase {
    HomePage homePage = new HomePage();
SoftAssert softAssert =new SoftAssert();

    @Test(groups = {"smoke","sanity","regression"},retryAnalyzer = RetryAnalyzer.class)
    public void selectMenuAndClick(){

        String expectedText = homePage.selectMenu("Computers");
        String actualText = homePage.getActualText();
        Assert.assertEquals(expectedText,actualText);

    }


}