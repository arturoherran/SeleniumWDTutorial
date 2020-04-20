package keyPressEvents;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyCombination {

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
	public void test() {
		
		driver.get(baseURL);
		driver.findElement(By.id("openwindow")).sendKeys(Keys.F2);
		
	}
	
	@After
	public void tearDown() throws Exception {
	}



}
