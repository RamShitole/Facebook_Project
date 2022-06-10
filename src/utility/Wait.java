package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public void implicitlyWait(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static WebElement explicitlyWait(int time, WebDriver driver, WebElement element)
	{
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
		WebElement eleRetune = wt.until(ExpectedConditions.visibilityOf(element));
		return eleRetune;
	}

}
