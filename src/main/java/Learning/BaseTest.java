package Learning;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {
	public  WebDriver driver;
	@BeforeMethod
	public void setupLevel()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//How to printtt the list of windows url's and open the url's in the same window , but in different tabss
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();

	}
	@AfterMethod
	
		public void teardown()
		{
			driver.quit();
		}
	

}
