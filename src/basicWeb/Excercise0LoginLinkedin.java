package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excercise0LoginLinkedin {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		String baseURL = "https://www.linkedin.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get(baseURL);

		driver.findElement(By.xpath("//*[@class='nav__button-secondary']")).click();
		driver.findElement(By.name("session_key")).sendKeys("arturo.herran.g@gmail.com");
		driver.findElement(By.name("session_password")).sendKeys("Sbtrkt1026.");
		
		driver.findElement(By.xpath("//*[@class='btn__primary--large from__button--floating']")).click();
		
		

	}

}
