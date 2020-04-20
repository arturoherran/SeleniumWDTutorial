package switchTo;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test() throws InterruptedException {
				
		//Get the Handles
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent handle" + parentHandle);
		
		//find Open Window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		//Get second Handle?
		Set<String> allHandles = driver.getWindowHandles();
		
		for(String handle : allHandles) {
			if(!handle.equals(parentHandle))
				driver.switchTo().window(handle);
		}
		
		//move through new handle
		WebElement searchInNewWindow = driver.findElement(By.id("search-courses"));
		searchInNewWindow.sendKeys("Python");
		driver.findElement(By.id("search-course-button")).click();
		driver.close();
		 
		//move back to parent window
		driver.switchTo().window(parentHandle);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Im back");
		Thread.sleep(3000);
		
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
		
	}



}
