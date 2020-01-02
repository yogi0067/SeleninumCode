package keppelPackage;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoSuggestiveExample extends KeppelClass {
	@BeforeTest
	public void BeforeTest() throws IOException
	{
		openBrowser("https://rahulshettyacademy.com/AutomationPractice/");
	}
	
	@Test
	public void Test1() throws IOException
	{
		auto_suggestive("ind");
	}
//	@Test
//	public void Test2() throws IOException
//	{
//		
//	}
//	@Test
//	public void Test3() throws IOException
//	{
//		
//	}
	

}
