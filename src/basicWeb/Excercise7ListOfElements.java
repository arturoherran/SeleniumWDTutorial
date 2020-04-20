package basicWeb;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise7ListOfElements {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Test
	public void test() throws InterruptedException {
		List<WebElement> radioElements = driver.findElements(By.xpath("//input[@type='radio' and @name='cars']")); 
		int listSize = radioElements.size();
				
		for(int i=0; i<listSize; i++) {
				System.out.println(radioElements.get(i).getAttribute("value"));
			}
		}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}



}
