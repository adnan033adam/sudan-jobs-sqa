package com.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BusTicketCalculatorSeleniumTest {

    @Test
    public void testJobPortalPagesLoad() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Open homepage
        driver.get("http://localhost/sudan_jobs/index.php");
        Thread.sleep(2000);
        assertTrue(driver.getTitle().length() > 0);

        // Open register page
        driver.get("http://localhost/sudan_jobs/register.php");
        Thread.sleep(2000);
        assertTrue(driver.getPageSource().contains("Register") || driver.getPageSource().contains("Sign"));

        // Open login page
        driver.get("http://localhost/sudan_jobs/login.php");
        Thread.sleep(2000);
        assertTrue(driver.getPageSource().contains("Login") || driver.getPageSource().contains("Email"));

        driver.quit();
    }
}
