package com.learnautomation.selenium;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoforMaven {
	
	@Test
	public void testHello(){
		System.out.println("Welcome to Maven World");
	}
	
	@Test
	public void test123(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		driver.quit();
		System.out.println("Test 2 - Validated the Title Sucessfully");
	}
}
