package com.qa.tests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	WebDriver driver;
	@BeforeTest
	public void url() {
		
		System.setProperty("webdriver.chrome.driver","/home/ravindranath/Downloads/chromedriver_linux64/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Index.html");
	}
	@Test
	public void test1 () {
		
		
	}
	
	@AfterTest
	public void close() {
	
		driver.close();
	}

}
