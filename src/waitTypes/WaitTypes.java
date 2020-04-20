package waitTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver;
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElement(By locator, int timeout) {
		WebElement element = null;
		
		try {
			System.out.println("Waiting for max of: " + timeout + "seconds for element to be visible");
			
			WebDriverWait wait = new WebDriverWait(driver,3);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			 
			System.out.println("Element actually appeared");
			
		} catch (Exception e) {
			System.out.println("Element did not appear in specified time");
		}
		
		return element;
	}
	

	public void clickWhenReady(By locator, int timeout) {
		try {
			WebElement element = null;
			System.out.println("Waiting for max of: " + timeout + "seconds for element to be clickable");
			
			WebDriverWait wait = new WebDriverWait(driver,3); 
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			element.click();
			
			System.out.println("Element could be clicked");
			
		} catch (Exception e) {
			System.out.println("Element did not appear in specified time");
		}
	}
}
