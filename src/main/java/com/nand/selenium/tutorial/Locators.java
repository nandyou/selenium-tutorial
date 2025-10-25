package com.nand.selenium.tutorial;

import java.time.Duration;
import java.util.List;

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
	        
	        //How to get find selected radio box element of a web page using name
	        
	        List<WebElement> radios = driver.findElements(By.name("my-radio"));

	        for (WebElement radio : radios) {
	            if (radio.isSelected()) {
	                System.out.println("Checked radio button ID: " + radio.getDomAttribute("id"));
	                System.out.println("Checked radio button value: " + radio.getDomAttribute("value"));
	                // break here as only one radio button can be selected
	                break;
	            }
	        }
	        
	        //How to get find selected check boxes of a web page using name
	        List<WebElement> checkboxes = driver.findElements(By.name("my-check"));

	        for (WebElement checkbox : checkboxes) {
	            if (checkbox.isSelected()) {
	                System.out.println("Checked checkbox ID: " + checkbox.getDomAttribute("id"));
	                System.out.println("Checked checkbox value: " + checkbox.getDomAttribute("value"));
	                
	                // no break here as multiple check boxes can be selected
	            }
	        }
	        
	        //How to get find selected radio box element of a web page using parent element .
	        
//	        WebElement container = driver.findElement(By.cssSelector("form-check"));
//	        WebElement checkedRadio = container.findElement(By.cssSelector("input[type='radio']:checked"));
//
//	        System.out.println("Checked radio button ID: " + checkedRadio.getDomAttribute("id"));
//            System.out.println("Checked radio button value: " + checkedRadio.getDomAttribute("value"));
//            
	        
	        
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
