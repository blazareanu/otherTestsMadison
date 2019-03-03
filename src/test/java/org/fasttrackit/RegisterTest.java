package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    @Test

    // 1. Introduction to Test Automation, Basic Identifiers

    public void newUserSignUpTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.className("skip-account")).click();
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("firstname")).sendKeys("L");
        driver.findElement(By.name("middlename")).sendKeys("Mada");
        driver.findElement(By.name("lastname")).sendKeys("Bianca");
        driver.findElement(By.className("validate-email")).sendKeys("test1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Testtest1234*");
        driver.findElement(By.cssSelector("[id = 'confirmation']")).sendKeys("Testtest1234*");
        driver.findElement(By.id("is_subscribed")).click();
        driver.findElement(By.xpath("//div[@class='buttons-set']//button")).click();
        Thread.sleep(10000);
        driver.quit();
    }

}
