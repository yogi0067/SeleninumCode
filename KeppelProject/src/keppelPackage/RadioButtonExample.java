package keppelPackage;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonExample extends KeppelClass {

	@BeforeTest
	public void BeforeTest() throws IOException
	{
		openBrowser("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void Test1() throws IOException
	{
		
		radio_click("radio1");
	}
	@Test
	public void Test2() throws IOException
	{
		radio_click("radio2");
	}
	@Test
	public void Test3() throws IOException
	{
		radio_click("radio3");
	}
	
}
