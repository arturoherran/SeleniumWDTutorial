package actionsClass;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickingAndPractice {
	private WebDriver driver;
	private String baseURL;
	JavascriptExecutor jse;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://jqueryui.com/slider/";
		jse = ((JavascriptExecutor)driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		WebElement targetElement = driver.findElement(By.xpath("//div[@id=\"sidebar\"]//a[text()=\"Draggable\"]"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(targetElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
	}
	
	
	@After
	public void tearDown() throws Exception {
	}


}
