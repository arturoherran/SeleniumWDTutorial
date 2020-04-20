package keyPressEvents;

import static org.junit.Assert.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPressActionsClass {

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
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
	}

	@After
	public void tearDown() throws Exception {
	}

}
