package basicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise6RadioButtonsAndCheckboxes {
	WebDriver driver;
	String baseURL;

	@Before
	public void setUp() throws Exception {
		//aquí se definen los drivers, se ajusta la ventana, stuff like that
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		driver.get(baseURL);
	}


	@Test
	public void test() throws InterruptedException {

		WebElement bmwRadioButton = driver.findElement(By.id("bmwradio"));
		bmwRadioButton.click();
		Thread.sleep(2000);
		
		WebElement benzRadioButton = driver.findElement(By.id("benzradio"));
		benzRadioButton.click();
		Thread.sleep(2000);
		
		WebElement hondaRadioButton = driver.findElement(By.id("hondaradio"));
		hondaRadioButton.click();
		Thread.sleep(2000);
		
		WebElement bmwCheckbox = driver.findElement(By.id("bmwcheck"));
		bmwCheckbox.click();
		Thread.sleep(2000);
		
		WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
		benzCheckbox.click();
		Thread.sleep(2000);
		
		WebElement hondaCheckbox= driver.findElement(By.id("hondacheck"));
		hondaCheckbox.click();
		Thread.sleep(2000);
		
		if(hondaRadioButton.isSelected()) {
			System.out.println("Sí se seleccionó el radio button de honda");
		}
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}
