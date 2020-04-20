package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\lupit\\Documents\\Code\\JAVA FULLSTACK PROGRAM\\Java\\testing\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
				
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
				

	}

}
