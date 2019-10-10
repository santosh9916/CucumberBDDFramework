package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/*
 Regular expression:
 1. \"(.*)\"
 2. \"([^\"]*)\"
 */
public class LoginStepDefination {
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_already_an_login_page() {
		System.setProperty("webdriver.chrome.driver", "/data/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
	
	@When("^title of login page is flipkart$")
	public void title_of_login_page_is_flipkart() {
		String pageTitle1 = driver.getTitle();
		Assert.assertEquals(pageTitle1,	"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",	"Home page title not matched");
	}

	@Then("^user is enters \"(.*)\" and \"(.*)\"$")
	public void user_is_enters_username_and_password(String username, String password) {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(username);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Exception {
		
		   driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		   Thread.sleep(3000);
	}

	@Then("^user is in User account page$")
	public void user_is_in_home_page() throws Exception {
		 WebElement userName = driver.findElement(By.xpath("//div[@id='container']/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div"));
		String userName_Text = userName.getText();
		Assert.assertEquals(userName_Text, "Santosh", "Logged user name not matched");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(userName));
		Actions action = new Actions(driver);
		action.moveToElement(userName).perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		
	}
	@Then("^close the browser$")
	public void quitBrowser() throws Exception {
		
		   driver.quit();
		   Thread.sleep(3000);
	}
}
