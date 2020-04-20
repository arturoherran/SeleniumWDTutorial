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

public class DragAndDrop {
	private WebDriver driver;
	private String baseURL;
	JavascriptExecutor jse;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://jqueryui.com/droppable/";
		jse = ((JavascriptExecutor)driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		
		
		WebElement fromElement = driver.findElement(By.id("draggable"));
		WebElement toElement = driver.findElement(By.id("droppable"));
		
		//Instanciar Actions
		Actions action = new Actions(driver);
		
//		mover elemento con drag and drop		
//		action.dragAndDrop(fromElement, toElement).perform();
//		Thread.sleep(3000);
		
//		mover con click and hold
//		action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
//		Thread.sleep(4000);
		
		System.out.println("we dragged and dropped something!");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	
		
	}

}
