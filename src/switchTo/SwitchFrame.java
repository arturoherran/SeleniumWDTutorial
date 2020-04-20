package switchTo;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "http://demo.guru99.com/test/guru99home/\"";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		System.out.println("********We are switch to the iframe*******");
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
   
			System.out.println("*********We are done***************");
		
		driver.switchTo().frame("IF1");
		WebElement textBox = driver.findElement(By.xpath("//input[@class=\"field searchform-s\"]"));
		textBox.sendKeys("something");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//img[@class=\"preload-me lazyloading\"]")).click();
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
