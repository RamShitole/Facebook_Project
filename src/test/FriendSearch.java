package test;

import org.testng.annotations.Test;

import BaseClass.BaseClass1;
import pom.InOut;
import pom.SearchFriend;
import utility.Wait;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class FriendSearch {
	static WebDriver driver;
	InOut io;
	 @BeforeClass
	  public void beforeClass() {
		 driver = BaseClass1.getDriver("chrome");
	  }
	 @BeforeMethod
	  public void beforeMethod() {
		 io =new InOut(driver);
		 io.mobileNo();
		 io.passWord();
		 io.logInButton();
		 
	  }

	
  @Test
  public void f() {
	  Wait wt = new Wait();
	  wt.implicitlyWait(10, driver);
	  
	  SearchFriend friend = new SearchFriend(driver);
	  friend.searchBox();
	  friend.friendName();
     String b =  friend.getName();
     Reporter.log(b,true);
	  
  }
 
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  io.logOut();
	  
  }

 

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
