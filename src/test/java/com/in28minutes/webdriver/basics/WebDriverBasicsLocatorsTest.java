package com.in28minutes.webdriver.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class WebDriverBasicsLocatorsTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "selenium/chromedriver/chromedriver");
        driver = new ChromeDriver();

    }
    @Test
    public void testTitle() {

        driver.get("http://localhost:8080/login");
        assertEquals("First Web Application", driver.getTitle());

    }

    @Test
    public void testGetInformationAboutName() {
        driver.get("http://localhost:8080/login");
        WebElement nameElement = driver.findElement(By.id("name"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//text
        System.out.println(nameElement.getAttribute("value"));//空
    }

    @Test
    public void testGetInformationAboutPassword() {
        driver.get("http://localhost:8080/login");
        WebElement nameElement = driver.findElement(By.id("password"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//password
        System.out.println(nameElement.getAttribute("value"));//空
    }

    @Test
    public void testGetInformationAboutSubmitButton() {
        driver.get("http://localhost:8080/login");
        WebElement nameElement = driver.findElement(By.id("submit"));
        System.out.println(nameElement.getTagName());//input
        System.out.println(nameElement.getAttribute("type"));//submit
        System.out.println(nameElement.getAttribute("value"));//空
    }

    @AfterTest
    public void aftertTest() {
        driver.quit();
    }

}
