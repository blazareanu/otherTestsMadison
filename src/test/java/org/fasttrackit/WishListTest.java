package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    @Test

    // 1. Introduction to Test Automation, Basic Identifiers

    public void addToWishListTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.className("nav-5")).click();
        driver.findElement(By.className("product-name")).click();
        driver.findElement(By.className("link-wishlist")).click();

        //Adding the first item from sales to cart

        //driver.findElement(By.className("add-to-cart-buttons")).click();
        //driver.findElement(By.id("option18")).click();
        //driver.findElement(By.className("option-s")).click();
        //driver.findElement(By.className("add-to-cart-buttons")).click();
    }
}
