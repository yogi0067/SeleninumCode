package keppelPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LoginPage extends KeppelClass{

	@Test
	public void test_Login() throws IOException
	{
		login("YogeshK", "Oati@1234");
	}
	@Test
	public void test_logout()
	{
		logout();
	}
	
}
