package Selleniun_start_projects.Selleniun_start_projects;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PasswordTest {
	static WebDriver  browser;
	
	@Before
	 public void setup() {
		 
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
	      browser = new FirefoxDriver();
	  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  String url="https://testpages.eviltester.com/styled/apps/7charval/simple7charvalidation.html";
	      browser.get(url);
	      
	
 }
	 @Test
		public void correctPassword() {
		 browser.findElement(By.name("characters")).sendKeys("Peter23");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue = "Valid Value";
		 String Result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Result,expectedValue);
				 
	 }
	 // short password
	 @Test
		public void shortPassword() {
		 browser.findElement(By.name("characters")).sendKeys("Peter2");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue = "Invalid Value";
		 String Result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Result,expectedValue);
				 
	 }
	 // long password
	 @Test
		public void longPassword() {
		 browser.findElement(By.name("characters")).sendKeys("Peter234");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue = "Invalid Value";
		 String Result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Result,expectedValue);
				 
	 }
	 // password with incorrect chars
	 @Test
		public void incorrectCharsPassword1() {
		 browser.findElement(By.name("characters")).sendKeys("Peter!3");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue = "Invalid Value";
		 String Result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Result,expectedValue);
				 
	 }
	// password with incorrect chars
	 @Test
		public void incorrectCharsPassword2() {
		 browser.findElement(By.name("characters")).sendKeys("Peter2?");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue = "Invalid Value";
		 String Result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Result,expectedValue);
				 
	 }
	// password with incorrect chars
	 @Test
		public void incorrectCharsPassword3() {
		 browser.findElement(By.name("characters")).sendKeys("Peter2@");
		 browser.findElement(By.name("validate")).click();
		 String expectedValue = "Invalid Value";
		 String Result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
		 assertEquals(Result,expectedValue);
				 
	 } 

			
}
