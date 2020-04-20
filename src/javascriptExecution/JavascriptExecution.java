package javascriptExecution;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecution {

	private WebDriver driver;
	private String baseURL;
	private JavascriptExecutor jse;

	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		jse = (JavascriptExecutor) driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Test
	public void test() throws InterruptedException {
		
//		Opening a URL with JS
//		jse.executeScript("window.location = 'https://letskodeit.teachable.com/p/practice';");
		driver.get(baseURL);

		
//		Finding an element with JS
//		WebElement  textBox = (WebElement) jse.executeScript("return document.getElementById('name')");
		WebElement  textBox = driver.findElement(By.id("name"));
		
//		scrolling to view element
		jse.executeScript("arguments[0].scrollIntoView(true);", textBox);
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		
//		send keys to centered element 
		textBox.sendKeys("hola bro");
		Thread.sleep(2000);
		
		
//		Getting windows height and width, just because
		long height = (long) jse.executeScript("return window.innerHeight;");
		long width = (long) jse.executeScript("return window.innerWidth;");
		
		System.out.println("Height is " + height + " and width is " + width);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
