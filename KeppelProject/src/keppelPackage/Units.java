package keppelPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Units {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://qa.keppel.oati.com/Keppel/");
		WebElement name=driver.findElement(By.id("username"));
		name.sendKeys("Admin");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Oati@1234");
		WebElement loginbth=driver.findElement(By.id("btnSubmit"));
		loginbth.click();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='x-toolbar x-toolbar-default x-box-layout-ct']/div/div/a/span/span/span/span/p[text()='Data']")));
		WebElement Data=driver.findElement(By.xpath("//*[@class='x-toolbar x-toolbar-default x-box-layout-ct']/div/div/a/span/span/span/span/p[text()='Data']"));
		Data.click();
		Thread.sleep(2000);
		WebElement Generation_Models=driver.findElement(By.xpath("//*[@class=\"x-menu x-layer x-menu-default x-border-box\"]/div/div/div/div/div/a/span/span/p[text()='Generation Models']"));
		Generation_Models.click();
		Thread.sleep(2000);
		WebElement Units=driver.findElement(By.xpath("//*[@class=\"x-menu x-layer x-menu-default x-border-box\"]/div/div/div/div/div/a/span/span/p[text()='Units']"));
		Units.click();
		Thread.sleep(5000);
		WebElement MarketType = driver.findElement(By.xpath("//input[@name='MarketParticipantId']"));
		//List<WebElement> MarketType= driver.findElements(By.xpath("//input[@name='MarketParticipantId']"));
		MarketType.click();
		 
		//System.out.println(MarketType.size());
		Thread.sleep(2000);
		driver.close();

	}

}
