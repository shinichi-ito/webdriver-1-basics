package com.in28minutes.webdriver.basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
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
    @AfterTest
    public void aftertTest() {
        driver.quit();
    }

}
