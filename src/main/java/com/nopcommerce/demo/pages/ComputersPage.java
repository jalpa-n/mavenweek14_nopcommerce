package com.nopcommerce.demo.pages;



import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class ComputersPage extends Utility {

    HomePage homePage = new HomePage();
    By desktopLink = By.xpath("//h2[@class='title']/a[@href='/desktops']");

    public void clickOnComputer(){
        Reporter.log("Clicking on computer" + homePage.computersLink.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(homePage.computersLink,80));
    }

    public void clickOnDesktop(){
Reporter.log("Clicking on Desktop " + desktopLink.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(desktopLink,80));
    }


}
