package basicWeb;

import static org.junit.Assert.*;

import java.io.File;
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

public class Excercise10HiddenElements {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();		
	}

//	@Test
//	public void letsKodeItTest() throws InterruptedException {
//		baseURL = "https://letskodeit.teachable.com/p/practice";
//		driver.get(baseURL);
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
//		
//		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
//		WebElement showButton = driver.findElement(By.id("show-textbox"));
//		WebElement textDisplay = driver.findElement(By.id("displayed-text"));
//		
//		System.out.println("textDisplay displayed? " + textDisplay.isDisplayed());
//		Thread.sleep(2000);
//		
//		hideButton.click();
//		System.out.println();
//		System.out.println("just clicked on hide button");
//		System.out.println("textDisplay displayed? " + textDisplay.isDisplayed());
//		Thread.sleep(2000);
//		
//		showButton.click();
//		System.out.println();
//		System.out.println("just clicked on show button");
//		System.out.println("textDisplay displayed? " + textDisplay.isDisplayed());
//		Thread.sleep(2000);
//	}
	
	@Test
	public void expediaTest() throws InterruptedException {
		baseURL = "https://www.expedia.mx/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.id("tab-package-tab-hp")).click();
		Thread.sleep(1000);
		
		WebElement checkInBox = driver.findElement(By.id("package-checkin-hp-package"));
		WebElement checkOutBox = driver.findElement(By.id("package-checkout-hp-package"));
		
		WebElement partialStay = driver.findElement(By.id("partialHotelBooking-hp-package"));
		partialStay.click();
		
		WebElement arrivalDayPicked = null;
		
		if(!checkInBox.isDisplayed()) {
			System.out.println("ERROR - checkInBox is not displayed");
			
		}
		else {
			checkInBox.click();
			arrivalDayPicked = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()='1']//button[@data-day='23']"));
			arrivalDayPicked.click();
			Thread.sleep(2000);	
		}		
		
		try {
			System.out.println("it WAS displayed and we arriving the " + arrivalDayPicked.getAttribute("data-day") );
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	
	@After	
	public void tearDown() throws Exception {
		String fileName = "prueba.png";
		String directory = System.getProperty("user.dir") + "//screenshots//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));	
		driver.quit();
	}


}
