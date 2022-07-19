package ZerodhaTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	//public String BaseUrl="https://kite.zerodha.com";
	public String Username="DV1510";
	public String Pwd="Goal@123";
	WebDriver driver;
	
	@BeforeClass
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
	driver=new ChromeDriver();
		
		driver.navigate().to("https://kite.zerodha.com/");
		
	}

}
