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

import java.util.concurrent.TimeUnit;

public class FirstTest {
    WebDriver wd;

   @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wd.get("https://www.gov.il/");
    }

    @Test
    public void openGovilTest(){
        System.out.println("site opened");

//        wd.findElement(By.name("q")).click();
//        wd.findElement(By.name("q")).sendKeys("selenium" + Keys.ENTER);
//
//        String text = wd.findElement(By.tagName("h3")).getText();
//
//        Assert.assertEquals(text.toLowerCase(), "selenium");

        wd.findElement(By.cssSelector("#tm-4")).click();
        String title = wd.findElement(By.cssSelector("h1 span")).getText();
        System.out.println(title);

    }

    @AfterMethod (enabled = false)
    public void tearDown(){
       wd.quit();
    }



}
