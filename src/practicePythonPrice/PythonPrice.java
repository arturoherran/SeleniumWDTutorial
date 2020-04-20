package practicePythonPrice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PythonPrice {

	public static void main(String[] args) {
		//before test
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		
		//test
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String targetPrice = driver.findElement(By.xpath("//td[starts-with(text(),\"Python\")]//following-sibling::td")).getText();
		
		System.out.println(targetPrice);
		driver.quit();
	
	}

}
