package com.Daniel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {
    WebDriver wd;

   @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://www.google.com/");
    }

    @Test
    public void openGoogleTest(){
        System.out.println("site opened");

        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);

        String text = wd.findElement(By.tagName("h3")).getText();

        Assert.assertEquals(text.toLowerCase(), "selenium");

    }

    @AfterMethod
    public void tearDown(){
       wd.quit();
    }



}