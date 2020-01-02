package keppelPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SystemAdminiStration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension",false);
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://qa.keppel.oati.com/Keppel/");
		WebElement userName= driver.findElement(By.id("username"));
		WebElement userPassword= driver.findElement(By.id("password"));
		userName.sendKeys("Admin");
		userPassword.sendKeys("Oati@1234");
		WebElement loginBtn= driver.findElement(By.id("btnSubmit"));
		loginBtn.click();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement systemOpertaion= driver.findElement(By.xpath("//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-toolbar-small']//p[text()='System Administration']"));
		Actions action=new Actions(driver);
		action.click(systemOpertaion).build().perform();
		action.click(driver.findElement(By.xpath("//*[text()='Alarms']"))).build().perform();
		action.click(driver.findElement(By.xpath("//*[text()='Alarm Groups']"))).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		action.click(systemOpertaion).build().perform();
		System.out.println("ETST");
		action.click(driver.findElement(By.xpath("//*[text()='Alarms']"))).build().perform();
		action.click(driver.findElement(By.xpath("//*[text()='Alarm Types']"))).build().perform();
		
	}

}
