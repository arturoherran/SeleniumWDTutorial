package basicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excercise3BasicActions {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		//aquí se definen los drivers, se ajusta la ventana, stuff like that
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		driver.findElement(By.id("user_email")).clear();
		driver.findElement(By.id("user_email")).sendKeys("email@test.com");
		System.out.println("cleared and typed in test email");
		driver.findElement(By.id("user_password")).sendKeys("mypassword");
		System.out.println("sent my password");
		
	}


	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
