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

public class Excercise9TakingScreenshots {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.facebook.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void testScreenshot() {
		driver.get(baseURL);
		WebElement userEmail = driver.findElement(By.id("email"));
		WebElement userPass = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		
		userEmail.sendKeys("pp_heg@hotmail.com");
		userPass.sendKeys("SD812704-001.");
		loginButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		String fileName = "loggedIntoFacebook" + ".png";
		String directory = System.getProperty("user.dir") + "//screenshots//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		
		System.out.println("In case you dont know, the directory is: " + directory);
		driver.quit();
		
		
	}

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i<length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		
		return sb.toString();
	}
	
	
}
