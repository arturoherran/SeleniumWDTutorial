package waitTypes;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {
	WebDriver driver;
	String baseURL;
	WaitTypes wt;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		wt = new WaitTypes(driver);
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException 	{
		 driver.get(baseURL);
		 WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		 loginButton.click();
		 
		 WebElement emailField = wt.waitForElement(By.id("user_email"), 3);
		 emailField.sendKeys("testoo san");
		 Thread.sleep(2000);
		 
		 WebElement passField = wt.waitForElement(By.id("user_password"), 3);
		 passField.sendKeys("passwordosan");
		 Thread.sleep(2000);
		 wt.clickWhenReady(By.name("commit"), 3);
		 
		 	
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
