package testingYoutube;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestYoutubeTest {
	
	WebDriver driver;
	String baseURL;

	@BeforeEach
	void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.get(baseURL);
		driver.findElement(By.xpath("//*[@id=\"header-sign-up-btn\"]//a[href=\"/sign_up\"]")).click();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
