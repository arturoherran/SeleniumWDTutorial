package basicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise1FindByNameDemo {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		
		driver.findElement(By.name("enter-name")).sendKeys("Arturo");
		driver.findElement(By.xpath("//[@id='alertbtn']")).click();

	}

}
