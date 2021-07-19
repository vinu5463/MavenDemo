package com.qa.tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.qa.listeners.TestAllureReportListener;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Listeners({TestAllureReportListener.class}) 
public class DemoTest {
	
	WebDriver driver;
	
	public void getSet()
	{
		System.setProperty ("webdriver.chrome.driver","E://Java_Softwares/chromedriver");
		driver=new ChromeDriver();
	}
	
	 	
	@Test
	@Severity(SeverityLevel.NORMAL)
	@Description("Addition")
	@Story("***Add****")
	public void sum()
	{
		int a=10;
		int b=20;
		
		System.out.println("*********DemoTest0***************");
		Assert.assertEquals(30, a+b);
		System.out.println("Addtions");
	}
	
	
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("Subtraction")
	@Story("***Sub****")
	public void sub()
	{
		int a=10;
		int b=20;
		System.out.println("************************");
		Assert.assertEquals(10, b-a);
		System.out.println("Substraction");
	}
	@Test
	@Severity(SeverityLevel.MINOR)
	@Description("Multiplication")
	@Story("***Multi****")
	public void mul()
	{
		int c=100;
		int a=10;
		int b=20;
		System.out.println("************************");
		Assert.assertEquals(200, a*b);
				  
		 
		System.out.println("Multiplication");
		
	}
	@Test
	@Severity(SeverityLevel.BLOCKER)
	@Description("Division")
	@Story("***Divi****")
	public void div()
	{
		int a=10;
		int b=20;
		System.out.println("************************");
		Assert.assertEquals(2, b/a);

		System.out.println("Division");
		System.out.println("Added One more Line");
	}

}
