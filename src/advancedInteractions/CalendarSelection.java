package advancedInteractions;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelection {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();		
		baseURL = "https://www.expedia.mx/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@Test
	public void expediaTest() throws InterruptedException {
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		Thread.sleep(1000);
		
		WebElement departingBox = driver.findElement(By.id("flight-departing-hp-flight"));
		WebElement returningBox = driver.findElement(By.id("flight-returning-hp-flight"));
		
		departingBox.click();

		String departingDate= driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()='1']//button[@data-day='23']")).getText();
		
//		WebElement calMonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()='1']"));

		List<WebElement> enabledElements = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][position()='1']//button[@class='datepicker-cal-date']"));
		
		for(WebElement element : enabledElements) {
			String isThisTheElement = element.getAttribute("data-day");
			System.out.println(isThisTheElement);
			if(isThisTheElement.equals("23")) {
				element.click();
				break;
			}	
			
		}
					
		Thread.sleep(3000);
		

	}
	
	
	@After	
	public void tearDown() throws Exception {
		String fileName =  setfileName() + ".png";
		String directory = System.getProperty("user.dir") + "//screenshots//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));	
		driver.quit();
	}

	public static String setfileName() {
		int length = 5;
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i< length ; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
	}
	
}


