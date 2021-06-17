package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

public class DesktopPages extends Utility {

    By sortByfilter = By.xpath("//select[@id='products-orderby']");
    By buildYourOwnComputer = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']");

    public void sortByZToA() {
        selectByValueDropDown(waitUntilVisibilityOfElementLocated(sortByfilter, 50), "6");
    }

    public List<String> verifyProductSortedByZToAFilter() throws InterruptedException {

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-grid']//h2"));
        List<String> productNameList = new ArrayList<>();

        for (WebElement name : productList) {
            productNameList.add(name.getText());
        }
        return productNameList;
    }

    public void sortByAtoZ() {
        Reporter.log("Selecting value from dropdown " + sortByfilter.toString() + "<br>");
        selectByValueDropDown(waitUntilVisibilityOfElementLocated(sortByfilter, 50), "5");
    }

    public void addProductToCart() {
        Reporter.log("Clicking on add to cart button" + buildYourOwnComputer.toString() + "<br>");
        clickOnElement(waitUntilVisibilityOfElementLocated(buildYourOwnComputer, 80));
    }

}