package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class DemoTest1 {
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
