package basicWeb;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise00Hovering {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.edx.org/";
		driver.get(baseURL);
	}


	@Test
	public void test() {
		WebElement menu = driver.findElement(By.xpath("//li[@class=\"menu-link menu-open\"]"));
	}


	@After
	public void tearDown() throws Exception {
		
	}

}
