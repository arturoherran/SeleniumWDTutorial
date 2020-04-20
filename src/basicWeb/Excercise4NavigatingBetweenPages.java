package basicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise4NavigatingBetweenPages {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		//aquí se definen los drivers, se ajusta la ventana, stuff like that
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("current URL is: " + currentURL);
		System.out.println();
		
		String nextURL = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		
		driver.navigate().to(nextURL);
		Thread.sleep(4000);
		System.out.println("now im at: " + driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		System.out.println("im back at: " + driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println();
		
		driver.navigate().forward();
		currentURL = driver.getCurrentUrl();
		System.out.println("And once again im at: " + currentURL);
		
		System.out.println();
		System.out.println("now we are refreshing the page");
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	
	@After
	public void tearDown() throws Exception {
	}


}
