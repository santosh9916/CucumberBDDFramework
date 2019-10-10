package seleniumcode;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class VerifyAllPageTitle {
	
	public WebDriver driver;
	
	/*@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	@CacheLookup
	WebElement username;
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	@CacheLookup
	WebElement password;
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	WebElement signIn_Button;
	
	public BrokenLinks() {
		PageFactory.initElements(driver, this);
	}*/
	
	public void highLightElementDuringRunTime(WebElement ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", ele);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		System.setProperty("webdriver.chrome.driver", "/data/chromedriver");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(3000);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void verifyPageTitle_allLinks() throws Exception {
		WebElement username = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		highLightElementDuringRunTime(username);
		username.sendKeys("9916410879");
		
		WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		highLightElementDuringRunTime(password);
		password.sendKeys("SantosH@2020");
		
		WebElement signIn_Button = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
		highLightElementDuringRunTime(signIn_Button);
		signIn_Button.click();
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			 //System.out.println(allLinks.get(i).getText());
			if (!allLinks.get(i).equals(" ")) {
			 highLightElementDuringRunTime(allLinks.get(i));
			 explicitWait(allLinks.get(i));
			 allLinks.get(i).click();
			 Thread.sleep(2000);
			 String pageTitle = driver.getTitle();
			 Thread.sleep(2000);
			 System.out.println("Page Title is :"+pageTitle);
			 driver.navigate().back();
			 Thread.sleep(2000);
			}
		}
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

}
