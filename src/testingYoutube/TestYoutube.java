package testingYoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.youtube.com/";
		
		driver.get(baseURL);
		
		driver.findElement(By.xpath(".//*[@id=\"guide-icon\"]"));
	}

}
