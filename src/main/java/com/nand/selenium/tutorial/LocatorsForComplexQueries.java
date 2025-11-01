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
	        
	        
	        extracted(inputText, "existing  input text", "change");
	        
	        
	        //How to clear a value in an input box using its handle
	        textBox.clear();
	        
	        String clearInputText = textBox.getText();
	        
	        extracted(clearInputText, "Clear command on input text", "");
	        
	        //How to input a value in an input box using its handle
	        textBox.sendKeys("Changed");
	        
	        String newInputText = textBox.getText();
	        
	        extracted(newInputText, "Cnew input text", "changed");
	        
	        if(!newInputText.equals("changed")) {
	        	System.out.println("New value is -" + newInputText);
	        	System.out.println("Test Failed for new input text");
	        }else {
	        	System.out.println("Test Passed for new input text");
	        }
	        
	        driver.quit();
		

	}

	private static void extracted(String inputText, String stringToPrint,String expectedValue) {
		if(!inputText.equals(expectedValue)) {
			System.out.println(stringToPrint+ " value is -" + inputText);
			System.out.println("Test Failed for " + stringToPrint);
		}else {
			System.out.println("Test Passed for " + stringToPrint);
		}
	}

}
