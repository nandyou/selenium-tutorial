package com.nand.selenium.tutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		 	WebDriver driver = new ChromeDriver();

	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	        //How to read title of web page
	        String title = driver.getTitle();

	        if(!title.equals("Web form")) {
	        	System.out.println("Title value is -" + title);
	        	System.out.println("Test Failed for title");
	        }
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

	        //How to get handle to an element of a web page using name
	        WebElement textBox = driver.findElement(By.name("my-text"));
	        
	        
	        //How to get handle to an element of a web page using css/class name
	        WebElement submitButton = driver.findElement(By.cssSelector("button"));

	        //How to input a value in an input box using its handle
	        textBox.sendKeys("Selenium");
	        
	        //How to perform a click action  on a web element
	        submitButton.click();

	        //How to get handle to an element of a web page using id
	        WebElement message = driver.findElement(By.id("message"));
	        
	        //How to get value of element of a web page using handle
	        String messageText = message.getText();
	        
	        if(messageText.equals("Received!")) {
	        	System.out.println("messageText value is -" + messageText);
	        	System.out.println("Test Failed for messageText");
	        }

	        driver.quit();
		

	}

}
