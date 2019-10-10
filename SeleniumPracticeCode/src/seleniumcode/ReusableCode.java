package seleniumcode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReusableCode {
	
	public static WebDriver driver;

	public void highLightElementDuringRunTime(WebElement ele) {

		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 4px solid red;');", ele);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
