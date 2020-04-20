package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise1IdXpathDemo {

	public static void main(String[] args) {
		String baseURL = "http://learn.letskodeit.com";
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@href=\"/sign_in\"] ")).click();		
		driver.findElement(By.id("user_email")).sendKeys("arturo.herran.g@gmail.com");

 
	}

}
