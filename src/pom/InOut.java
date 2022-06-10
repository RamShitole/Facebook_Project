package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Wait;

public class InOut {
	WebDriver driver;
	
	
	@FindBy(xpath="//input[@id = 'email']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id = 'pass']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@name = 'login']")
	private WebElement logbutton;
	
	@FindBy(xpath="(//div[@data-visualcompletion='ignore'])[9]")
	private WebElement logout;
	
	@FindBy(xpath="//span[text()='Log Out']")
	private WebElement logoutbutton;
	
	
	public InOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		this.driver = driver;
	}
	public void mobileNo()
	{
		Wait.explicitlyWait(30, driver,mobile);
		mobile.sendKeys("9049805580");
	}
	public void passWord()
	{
		pass.sendKeys("9860737718");
	}
	public void logInButton()
	{
		logbutton.click();
	}
	public void logOut() throws InterruptedException
	{ Actions act = new Actions(driver);
	act.moveToElement(logout).click().perform();
	
	
	Wait.explicitlyWait(30, driver, logoutbutton);
	act.moveToElement(logoutbutton).click().perform();
	}
	
	

}
