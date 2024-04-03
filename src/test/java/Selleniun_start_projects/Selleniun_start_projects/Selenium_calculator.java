package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class Selenium_calculator {

	static WebDriver browser;

	@Before
	public void setup() {

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
		browser.get(url);

	}

	@Test
	public void positive_plus_positive() {

		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button03")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "7";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void positive_plus_zero() {

		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "4";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_plus_positive() {

		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button05")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "5";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_plus_zero() {

		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttonplus")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void positive_minus_positive() {

		browser.findElement(By.id("button07")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button04")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void positive_minus_zero() {

		browser.findElement(By.id("button03")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "3";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_minus_zero() {

		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttonminus")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void positive_multiple_positive() {

		browser.findElement(By.id("button09")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button04")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "36";
		browser.close();
	}
	@Test
	public void positive_multiple_zero() {

		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_multiple_positive() {

		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button07")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_multiple_zero() {

		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttonmultiply")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void positive_divide_positive() {

		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button02")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "2";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void positive_divide_zero() {
		browser.findElement(By.id("button04")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "NaN";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_divide_positive() {
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button09")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "0";
		assertEquals(Expected, result);
		browser.close();
	}
	@Test
	public void zero_divide_zero() {
		browser.findElement(By.id("button00")).click();
		browser.findElement(By.id("buttondivide")).click();
		browser.findElement(By.id("button00")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		browser.findElement(By.id("buttonequals")).click();
		System.out.println("hello");

		String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
		System.out.println(result);
		String Expected = "NaN";
		assertEquals(Expected, result);
		browser.close();
	}

}