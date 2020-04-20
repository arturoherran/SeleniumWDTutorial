package actionsClass;

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
import org.openqa.selenium.interactions.Actions;

public class Sliders {
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
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.xpath("//div[@id=\"slider\"]/span"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, 50, 0).perform();
		Thread.sleep(3000);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
