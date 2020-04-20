package keyPressEvents;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import waitTypes.WaitTypes;

public class PressKeys {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
	}

	@Test
	public void test() throws InterruptedException{
		driver.get(baseURL);
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='/sign_in']"));
		loginLink.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement userEmail = driver.findElement(By.id("user_email"));
//		WebElement userPwd = driver.findElement(By.id("user_password"));
		
		userEmail.sendKeys("test@test.com");
		userEmail.sendKeys(Keys.TAB);
//		Thread.sleep(2000);
//		
//		userPwd.sendKeys("monmotpasse");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.name("commit")).sendKeys(Keys.ENTER);
	}
	
	@After
	public void tearDown() throws Exception {
//		Thread.sleep(2000);
//		driver.quit();
	}


}
