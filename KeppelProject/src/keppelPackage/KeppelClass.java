package keppelPackage;

import java.beans.PropertyChangeEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;;

public class KeppelClass {
	
	public static WebDriver driver;
	static Properties prop = new Properties();
	public static void openBrowser(String url) throws IOException {
		
		FileInputStream fis = new FileInputStream(
				"D:\\TEST_Yogesh\\KeppelProject\\src\\keppelPackage\\PageData.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void login(String username, String pass) throws IOException {
		//openBrowser();
		WebElement name = driver.findElement(By.id(prop.getProperty("username_Id")));
		WebElement password = driver.findElement(By.id(prop.getProperty("passwod_Id")));
		WebElement loginbth = driver.findElement(By.id(prop.getProperty("LoginBtn_Id")));
		
		type(name, username);
		type(password, pass);
		element_click(loginbth);
	}
	public static void type(WebElement element, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
		element.clear();
		element.sendKeys(value);
	}
	public static void element_click(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element)).isEnabled();
		element.click();
	}

	public static void logout()
	{
		driver.close();
	}
	public static void radio_click(String value) throws IOException
	{
		//openBrowser();
		if(value.equalsIgnoreCase("radio1"))
		{
			element_click(driver.findElement(By.xpath(prop.getProperty("radio_1_Xpath"))));
		}
		else if(value.equalsIgnoreCase("radio2"))
		{
			element_click(driver.findElement(By.xpath(prop.getProperty("radio_2_Xpath"))));
		}
		else
		{
			element_click(driver.findElement(By.xpath(prop.getProperty("radio_3_Xpath"))));
		}
		
	}
	public static void auto_suggestive(String value)
	{
		WebElement dropdown=  driver.findElement(By.xpath(prop.getProperty("autosugesstive")));
		type(dropdown,value);	
		
	}
	public static void key_movements(Keys key)
	{
		WebElement dropdown= driver.findElement(By.xpath("//input[@id='autocomplete']"));
		dropdown.sendKeys(key);
		
	}
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
//
//		
//		
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"//*[@class='x-toolbar x-toolbar-default x-box-layout-ct']/div/div/a/span/span/span/span/p[text()='Data']")));
//		WebElement Data = driver.findElement(By.xpath(
//				"//*[@class='x-toolbar x-toolbar-default x-box-layout-ct']/div/div/a/span/span/span/span/p[text()='Data']"));
//		Data.click();
//		Thread.sleep(2000);
//		WebElement Generation_Models = driver.findElement(By.xpath(
//				"//*[@class=\"x-menu x-layer x-menu-default x-border-box\"]/div/div/div/div/div/a/span/span/p[text()='Generation Models']"));
//		Generation_Models.click();
//		Thread.sleep(2000);
//		// WebElement Units=driver.findElement(By.xpath("//*[@class=\"x-menu x-layer
//		// x-menu-default
//		// x-border-box\"]/div/div/div/div/div/a/span/span/p[text()='Units']"));
//		// Units.click();
//		// Thread.sleep(6000);
//
//		// WebElement Close_Units=driver.findElement(By.xpath("//*[@class=\"x-menu
//		// x-layer x-menu-default
//		// x-border-box\"][3]/div/div/div/div/div[2]/a/span[text()='Close Tab']"));
//		// Close_Units.click();
//		// Thread.sleep(2000);
//		WebElement Heat_Rate_Curves = driver.findElement(By.xpath(
//				"//*[@class=\"x-menu x-layer x-menu-default x-border-box\"]/div/div/div/div/div/a/span/span/p[text()='Heat Rate Curves']"));
//		// Data.click();
//		// Generation_Models.click();
//		Heat_Rate_Curves.click();
//		Thread.sleep(4000);
//		// Actions actions = new Actions(driver);
//		// actions.contextClick(driver.findElement(By.xpath("//div[@class='x-panel
//		// mainTabBarDark x-border-item x-box-item x-panel-default']
//		// //span[@class='x-tab-inner x-tab-inner-default']"))).perform();
//		// Close_Units.click();
//
//		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-1037")));
//		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-1037")));
//		// System.out.println("test");
//		// a[@class='x-btn x-unselectable x-box-item x-toolbar-item
//		// x-btn-default-toolbar-small']//p[contains(text(),'System Administration')]
//		// --WebElement sysadmin=driver.findElement(By.xpath("//*[text()=\'System
//		// Administration\']"));
//		// --System.out.println("System AdminStration");
//		// --sysadmin.click();
//
//		// WebElement data= driver.findElement(By.xpath("//*[text()=\'Data\']"));
//		// data.click();
////		WebElement generation_models= driver.findElement(By.xpath("//*[text()=\'Generation Models\']"));
////		generation_models.click();
////		refreshbtn.click(); 
//
////		WebElement history=driver.findElement(By.id("button-1134"));
////		System.out.println("History");
////		history.click();
////		WebElement data=driver.findElement(By.id("button-1142"));
////		System.out.println("Data");
////		data.click();
////		WebElement Diagnostics=driver.findElement(By.id("button-1185"));
////		System.out.println("Diagnostics");
////		Diagnostics.click();
////		WebElement usrsetting=driver.findElement(By.id("button-1191"));
////		System.out.println("User Setting");
////		usrsetting.click();
////		WebElement interfaces=driver.findElement(By.id("button-1199"));
////		System.out.println("Interfaces");
////		interfaces.click();
////		WebElement operations=driver.findElement(By.id("button-1309"));
////		System.out.println("Operations");
////		operations.click();
////		
////		WebElement commercial=driver.findElement(By.id("button-1509"));
////		System.out.println("Commercial");
////		commercial.click(); 
////		WebElement sysopr= driver.findElement(By.id("button-1518"));
////		System.out.println(" System Operation");
////		sysopr.click();
////		WebElement grsmgn= driver.findElement(By.id("button-1551"));
////		grsmgn.click();
////		WebElement optimiz=driver.findElement(By.id("button-1581"));
////		optimiz.click();
////		WebElement 
////			1645
//		Thread.sleep(5000);
//		driver.close();
//
//	}

}
