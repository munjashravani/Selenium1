package Com.qa.pages;
import org.openqa.selenium.By;

import Com.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	
	
	// Page factory
	public void Login(String un, String pw){
	driver.findElement(By.id("txtUsername")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pw);
	driver.findElement(By.name("Submit")).click();
	}


}
