package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Wait;

public class SearchFriend {
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Search Facebook']")
	private WebElement searchbox;
	
	@FindBy(xpath="(//div[@class='qzhwtbm6 knvmm38d'])[1]")
	private WebElement name;

	

	
	public SearchFriend(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void searchBox()
	{
		Wait.explicitlyWait(30, driver,searchbox);
		searchbox.sendKeys("Ganesh Shitole Deshmukh");
	}
		
	public void friendName()
	{
		Wait.explicitlyWait(30, driver, name);
		Actions act = new Actions(driver);
		act.moveToElement(name).click().perform();
		
	}
	public String getName()
	{
		String a =name.getText();
	  return a;
	}

}
