package test;

import org.testng.annotations.Test;

import BaseClass.BaseClass1;
import pom.InOut;
import utility.Wait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TestClass {
	static WebDriver driver;
	
	
	 @BeforeClass
	  public void beforeClass() 
	 {
		 driver = BaseClass1.getDriver("chrome");
	  }
	 @BeforeMethod
	  public void beforeMethod()
	 {
		 InOut io= new InOut(driver);
		 
		 io.mobileNo();
		 io.passWord();
		 io.logInButton();
	  }

	
  @Test
  public void f() {
	  
	 WebElement name  = driver.findElement(By.xpath("//span[text()='Ram Shitole Deshmukh']"));
	  if(name.getText().equalsIgnoreCase("Ram Shitole Deshmukh"))
	  {
		  Reporter.log(name.getText() +" LogIn suceessfuly", true);
	  }
	  else {
		  System.out.println();
	  }
  }
  
  @AfterMethod
  public void afterMethod() throws InterruptedException
 {
	  Wait w = new Wait();
	  w.implicitlyWait(10, driver);
	 
	 InOut io= new InOut(driver);
	 
	io.logOut();
  }
 

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
