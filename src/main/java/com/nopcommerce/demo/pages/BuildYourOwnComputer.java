package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

import javax.xml.stream.XMLStreamReader;

public class BuildYourOwnComputer extends Utility {

    By buildYourOwnComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By Processor = By.xpath("//dd[@id='product_attribute_input_1']/select[@id='product_attribute_1']");
    By RAM = By.xpath("//dd[@id='product_attribute_input_2']/select[@id='product_attribute_2']");
    By radio400GB = By.xpath("//ul[@class='option-list']/li[@data-attr-value='7']/input[@id='product_attribute_3_7']");
    By radioVistaPremium = By.xpath("//li[@data-attr-value='9']/input[@id='product_attribute_4_9']");
    By totalCommander = By.xpath("//input[@id='product_attribute_5_12']");
    By totalPrice = By.xpath("//div[@class='product-price']/span[@id='price-value-1']");
    By addToCart = By.xpath("//div[@class='add-to-cart-panel']/button[@id='add-to-cart-button-1']");
    By TopGreenBarText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");


    public String actualBuildYourOwnComputerText() {
        Reporter.log("Get build computer text" + buildYourOwnComputerText.toString() + "<br>");
        return waitUntilVisibilityOfElementLocated(buildYourOwnComputerText, 50).getText();
    }

    public void selectIntelPentiumProcessor(String value) {
        Reporter.log("Get Intel Pentium text" + Processor.toString() + "<br>");
        selectByValueDropDown(waitUntilVisibilityOfElementLocated(Processor, 80), value);
    }

    public void select8GBRAM(String value) {
        Reporter.log("Select 8GBRAM " + value + "from Ram DropDown" + RAM.toString() + "<br>");

        selectByValueDropDown(waitUntilVisibilityOfElementLocated(RAM, 50), value);
    }

    public void clickOn400GBRadioButton() {
        Reporter.log("clicking on 400GB RadioButton " + radio400GB.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(radio400GB, 80));
    }

    public void clickOnVistaPremiumRadioButton() {
        Reporter.log("Clicking on Premium radio button " + radioVistaPremium.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(radioVistaPremium, 80));
    }

    public void checkBoxTotalCommander() {
        Reporter.log("Clicking on Total commander " + totalCommander.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(totalCommander, 80));
    }

    public String actualTotalPrice() {
        Reporter.log("Getting total price from " + totalPrice.toString() + "<br>");
        return waitUntilVisibilityOfElementLocated(totalPrice, 80).getText();
    }

    public void clickToAddBuildProductToCart() {
        Reporter.log("Clicking on product add to cart " + addToCart.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(addToCart, 80));
    }

    public String actualTopGreenBarText() {
        Reporter.log("Getting verification message from " + TopGreenBarText.toString() + "<br>");
        return waitUntilVisibilityOfElementLocated(TopGreenBarText, 80).getText();
    }

}

