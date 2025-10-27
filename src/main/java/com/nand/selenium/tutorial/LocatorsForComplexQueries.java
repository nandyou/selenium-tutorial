package com.nand.selenium.tutorial;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsForComplexQueries {

	public static void main(String[] args) {
		
		 	WebDriver driver = new ChromeDriver();

	        driver.get("https://www.selenium.dev/selenium/web/xhtmlTest.html");

	        //How to read title of web page
	        String title = driver.getTitle();

	        if(!title.equals("XHTML Test Page")) {
	        	System.out.println("Title value is -" + title);
	        	System.out.println("Test Failed for title");
	        }
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

	        //How to get handle to an element of a web page using name
	        WebElement textBox = driver.findElement(By.id("username"));
	        
	        String inputText = textBox.getText();
	        
	        
	        if(!inputText.equals("change")) {
	        	System.out.println("Existing value is -" + inputText);
	        	System.out.println("Test Failed for existing input text");
	        }else {
	        	System.out.println("Test Passed for existing input text");
	        }
	        
	        
	        //How to clear a value in an input box using its handle
	        textBox.clear();
	        
	        String clearInputText = textBox.getText();
	        
	        if(!clearInputText.isEmpty()) {
	        	System.out.println("After Clear input Text is -" + clearInputText);
	        	System.out.println("Test Failed for Clear command on input text");
	        }else {
	        	System.out.println("Test Passed for Clear command on input text");
	        }
	        
	        //How to input a value in an input box using its handle
	        textBox.sendKeys("Changed");
	        
	        String newInputText = textBox.getText();
	        
	        
	        if(!newInputText.equals("changed")) {
	        	System.out.println("New value is -" + newInputText);
	        	System.out.println("Test Failed for new input text");
	        }else {
	        	System.out.println("Test Passed for new input text");
	        }
	        
	        
	        	       

	        driver.quit();
		

	}

}
