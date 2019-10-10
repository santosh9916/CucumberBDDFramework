package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindBrokenLinks extends ReusableCode{
	public WebDriver driver;
	
	@BeforeMethod
	public void init() {
		System.setProperty("webdriver.chrome.driver", "/data/chromedriver");
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
	}
	@Test
	public void m1() {
		
	}
	
	
}
