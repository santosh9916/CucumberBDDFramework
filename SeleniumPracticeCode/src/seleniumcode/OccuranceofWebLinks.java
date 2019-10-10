package seleniumcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OccuranceofWebLinks {
	WebDriver driver;
  @Test
  public void f() {
	 
			System.setProperty("webdriver.chrome.driver", "/data/chromedriver");
		
			driver = new ChromeDriver();
			
			driver.get("https://www.flipkart.com");
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
			Map<String, Integer> map = new HashMap<String, Integer>();;
			
			for(WebElement link : allLinks)
				
				if(map.containsKey(link)) {
					map.put(link.getText(), map.get(link.getText())+1);
				}else {
					map.put(link.getText(), 1);
				}
				for (Entry<String, Integer> val : map.entrySet()) {
					System.out.println(val.getKey() + "::::: occurs " + val.getValue() + "::::: time(s)");
				}
			}
  }

