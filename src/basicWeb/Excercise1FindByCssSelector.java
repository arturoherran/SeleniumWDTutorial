package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Excercise1FindByCssSelector {

	public static void main(String[] args) {
		//inicializar los drivers
		WebDriver driver;
		driver = new ChromeDriver();
		
		//definir URL
		String baseURL = "https://learn.letskodeit.com/p/practice";
		
		//Realizar las acciones
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.findElement(By.cssSelector(".inputs")).sendKeys("This is inputs class");;
		driver.findElement(By.cssSelector("fieldset>#carselect"));
		
//		driver.findElement(By.cssSelector(".inputs.displayed-class")).sendKeys("And this displayed class");;
		
		driver.quit();
		

	}

}
