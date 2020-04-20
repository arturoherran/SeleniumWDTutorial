package basicWeb;

import static org.junit.Assert.*;

import java.awt.Window;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excercise8DropdownMenus {

	private WebDriver driver;
	private String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		
		driver.get(baseURL);
		
//		for simple select element
//		WebElement myDropdown = driver.findElement(By.id("carselect"));
//		Select sel = new Select(myDropdown);
		
		//for multi select element
		WebElement myMultiSelec = driver.findElement(By.id("multiple-select-example"));
		Select sels = new Select(myMultiSelec);
		
//		actions for simple select
//		Thread.sleep(2000);
//		System.out.println("Select Benz by Value: ");
//		sel.selectByValue("benz");
//		
//		Thread.sleep(2000);
//		System.out.println("Select Honda by Index: ");
//		sel.selectByIndex(2);
//		
//		Thread.sleep(2000);
//		System.out.println("Select BMW by Visible text: ");
//		sel.selectByVisibleText("BMW");
//		
//		Thread.sleep(2000);
//		System.out.println("Print all options: ");
//		
//		List<WebElement> options = driver.findElements(By.xpath("//select[@id=\"carselect\"]//option"));
//		
//		for(WebElement opt : options) {
//			System.out.println(opt.getAttribute("value"));
//		}
//		end of actions for simple select
		
		
//		actions for multiple select
		Thread.sleep(2000);
		System.out.println("Select Apple by Value: ");
		sels.selectByValue("apple");
		
		Thread.sleep(2000);
		System.out.println("Select Orange by Index: ");
		sels.selectByValue("orange");
		
		Thread.sleep(2000);
		System.out.println("Select Peach by Visible text: ");
		sels.selectByVisibleText("Peach");
		
		List<WebElement> selectedOptions = sels.getAllSelectedOptions();
		for(WebElement selected : selectedOptions) {
			System.out.println(selected.getAttribute("value"));
		}
		
		Thread.sleep(2000);
		sels.deselectByValue("apple");
		Thread.sleep(2000);
		sels.deselectByVisibleText("Orange");
		Thread.sleep(2000);
		sels.deselectByVisibleText("Peach");
		Thread.sleep(2000);
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}



}
