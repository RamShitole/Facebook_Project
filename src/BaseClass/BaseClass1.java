package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass1 {
	
	
	
	public static WebDriver getDriver(String browser)
	{
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",  "C:\\selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		return driver;
	}
	

}
