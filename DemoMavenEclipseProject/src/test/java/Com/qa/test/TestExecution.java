package Com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.qa.base.TestBase;
import Com.qa.pages.LoginPage;
import Com.qa.pages.PIMPage;


public class TestExecution extends TestBase {
	LoginPage lp;
	
	@BeforeMethod
	public void initi(){
		initialization(); 
	}	
	
	
	@Test
	public void LoginTest(){
		LoginPage lp = new LoginPage();
		lp.Login(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
	
	@Test
	public void PIMTest(){
		LoginPage lp = new LoginPage();
		lp.Login(prop.getProperty("UserName"), prop.getProperty("Password"));
		PIMPage pim = new PIMPage();
		pim.PIM("Shravani", "Personal Details", "0");
	}
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}
	
	
	
	
	
	

}
