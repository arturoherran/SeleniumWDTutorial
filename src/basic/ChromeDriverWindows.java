package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindows {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lupit\\Documents\\Code\\JAVA FULLSTACK PROGRAM\\Java\\testing\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseURL = "https://www.letskodeit.com";
		
		driver.get(baseURL);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		driver.quit();

	}

}
