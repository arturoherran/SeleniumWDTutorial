package basicWeb;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise5EnabledDisabledElement {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://www.google.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}

	@Test
	public void test() {
		WebElement element1 = driver.findElement(By.cssSelector("input.gLFyf.gsfi") );
		
		System.out.println("is it enabled? " + element1.isEnabled());
		element1.sendKeys("lets Kode it");
	}
	
	@After
	public void tearDown() throws Exception {
	}



}
