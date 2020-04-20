package dataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class UsingExcel {

	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		driver.findElement(By.xpath("//a[@id=\"i90scv3glink\"]")).click();
		
		//ahora indicar dónde está el archivo que vamos a usar
		ExcelUtility.setExcelFile(Constants.File_Path + Constants.File_Name, "LoginTests");		
	}

	@DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		Object[][] testData = ExcelUtility.getTestData("Invalid_Login");
		return testData;
	}
	
	@Test(dataProvider = "loginData")
	public void testUsingExcel(String username, String password) throws InterruptedException{
		//click Login button
		WebElement loginButton = driver.findElement(By.xpath("//a[@href=\"/sign_in\"]"));
		loginButton.click();
		
		Thread.sleep(2000);
		//sendKeys for email and password
		WebElement userEmail = driver.findElement(By.id("user_email"));
		userEmail.sendKeys(username);
		
		WebElement userPassword = driver.findElement(By.id("user_password"));
		userPassword.sendKeys(password);
		
		WebElement sendCredentials = driver.findElement(By.xpath("//input[@name=\"commit\"]"));
		sendCredentials.click();
		Thread.sleep(2000);
		
		//find if error message exists
		boolean result = driver.findElements(By.xpath("//div[@class='alert alert-danger']")).size() != 0;
		Assert.assertTrue(result);
	}


	@AfterClass
	public void afterClass() {
	
	}

}
