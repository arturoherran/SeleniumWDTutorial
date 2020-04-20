package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\lupit\\Documents\\Code\\JAVA FULLSTACK PROGRAM\\Java\\testing\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String baseURL ="https://www.youtube.com/";
		
		driver.get(baseURL);
		

	}

}
