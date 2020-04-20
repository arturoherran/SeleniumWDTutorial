package advancedInteractions;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDemo {
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
	public void testAutoComplete() throws InterruptedException {
		String partialText = "Gua";
		String textToSelect = "Guadalajara, Jalisco (GDL-Don Miguel Hidalgo y Costilla Intl.)";
		
		//click the flights tab
		WebElement flightButton = driver.findElement(By.id("tab-flight-tab-hp"));
		flightButton.click();
		Thread.sleep(2000);
		
		WebElement originInput = driver.findElement(By.id("flight-origin-hp-flight"));
		originInput.sendKeys(partialText);
		Thread.sleep(2000);
		
		WebElement dropdownUl = driver.findElement(By.id("typeaheadDataPlain"));
	
		List<WebElement> anchorElements = dropdownUl.findElements(By.tagName("a"));
		for(WebElement each : anchorElements) {
			if(each.getAttribute("data-value").equals(textToSelect)) {
				each.click();
				break;
			}
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}
