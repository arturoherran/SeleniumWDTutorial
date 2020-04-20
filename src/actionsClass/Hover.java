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
	
public class Hover {

	private WebDriver driver;
	private String baseURL;
	JavascriptExecutor jse;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		jse = ((JavascriptExecutor)driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		
		WebElement mainElement = driver.findElement(By.id("mousehover"));
		
//		Toda accion necesita ser instancia de la clase Actions, y la instancia del driver debe ser su parametro
//		porque �ste va a manipular la p�gina
		Actions action = new Actions(driver);
		
//		moveToElement mueve el mouse a donde queremos, perform lo mueve tal cual.
		action.moveToElement(mainElement).perform();
		Thread.sleep(2000);
				
		WebElement subElement = driver.findElement(By.xpath("//div[@class=\"mouse-hover-content\"]//a[text()=\"Top\"]"));
		action.moveToElement(subElement).click().perform();
		
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}


}
