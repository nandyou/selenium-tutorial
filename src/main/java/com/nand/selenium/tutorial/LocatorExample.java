package com.nand.selenium.tutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
    public static void main(String[] args) {
        // Set up ChromeDriver (ensure you have WebDriverManager or correct driver path)
        WebDriver driver = new ChromeDriver();

        // Load your local HTML file or web URL
        driver.get("file:///Users/nand/Desktop/workspace/git/selenium-tutorial/examples/sample.html");

        // ====== SIMPLE LOCATORS ======
        // By ID
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("test_user");

        // By Name
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("securePass123");

        // By Class Name
        WebElement loginButton = driver.findElement(By.className("primary"));
        loginButton.click();

        // ====== COMPLEX LOCATORS ======
        // 1️⃣ CSS Selector (find a button inside a form by attribute)
        WebElement cancelButton = driver.findElement(By.cssSelector("form#loginForm button[name='cancel']"));
        cancelButton.click();

        // 2️⃣ CSS Selector (chained / nested)
        WebElement signupLink = driver.findElement(By.cssSelector(".links a.signup"));
        System.out.println("Signup link text: " + signupLink.getText());

        // 3️⃣ XPath — find element by text
        WebElement forgotLink = driver.findElement(By.xpath("//a[text()='Forgot Password?']"));
        forgotLink.click();
        
        
        // Example command to go back to previous page.
        driver.navigate().back();
        
        // Example command to go forward after we come back .
        driver.navigate().forward();
        
        // Example command to refresh using the browser control.
        driver.navigate().refresh();
        
        WebElement backLink = driver.findElement(By.xpath("//a[text()='Back']"));
        backLink.click();

        // 4️⃣ XPath — partial text match
        WebElement partialForgotLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
        System.out.println("Partial link text: " + partialForgotLink.getText());

        // 5️⃣ XPath — using AND conditions
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
        passwordInput.clear();
        passwordInput.sendKeys("AnotherPassword");

        // 6️⃣ XPath — parent-child traversal
        WebElement actionButton = driver.findElement(By.xpath("//div[@class='actions']/button[@name='login']"));
        actionButton.click();

        // ====== BONUS: Find multiple elements ======
        // Get all buttons inside the form
        List buttons = driver.findElements(By.xpath("//form[@id='loginForm']//button"));
        System.out.println("Total buttons in form: " + buttons.size());

        // Close the browser
        driver.quit();
    }
}
