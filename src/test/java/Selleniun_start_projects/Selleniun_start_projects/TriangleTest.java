package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TriangleTest {
static WebDriver  browser;
	
	@Before
	 public void setup() {
		 
		  System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
	      browser = new FirefoxDriver();
	  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  String url="https://testpages.eviltester.com/styled/apps/triangle/triangle001.html";
	      browser.get(url);
	      

}
	@Test
	public void C1FC2FC3FC4F(){
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("6");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Triangle";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
		
	}
	@Test
	public void C1FC2FC3FC4T(){
		browser.findElement(By.name("side1")).sendKeys("7");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Triangle";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	
	@Test
	public void C1FC2FC3TC4F(){
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("7");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Triangle";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
		
	}
	@Test
	public void C1FC2TC3FC4F(){
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("7");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Error: Not a Triangle";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	@Test
	public void C1TC2FC3FC4F(){
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("4");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Scalene";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	@Test
	public void C1TC2FC3FC4T(){
		browser.findElement(By.name("side1")).sendKeys("2");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	@Test
	public void C1TC2FC3TC4F(){
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("2");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	@Test
	public void C1TC2TC3FC4F(){
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("2");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Isosceles";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	@Test
	public void C1TC2TC3TC4T(){
		browser.findElement(By.name("side1")).sendKeys("3");
		browser.findElement(By.name("side2")).sendKeys("3");
		browser.findElement(By.name("side3")).sendKeys("3");
		browser.findElement(By.id("identify-triangle-action")).click();
		String expectedValue = "Equilateral";
		String Result = browser.findElement(By.id("triangle-type")).getText();
		assertEquals(Result,expectedValue);
	}
	
	
}
