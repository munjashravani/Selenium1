package Com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Com.qa.base.TestBase;

public class PIMPage extends TestBase{

public  void PIM(String fn,String screen1, String type){
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.id("menu_pim_Configuration"))).build().perform();
	driver.findElement(By.id("menu_pim_listCustomFields")).click();
	driver.findElement(By.id("customField_name")).sendKeys(fn);
	WebElement screen = driver.findElement(By.id("customField_screen"));
	Select select = new Select(screen);
	select.selectByVisibleText(screen1);
	Select select1 = new Select(driver.findElement(By.id("customField_type")));
	select1.selectByValue(type);
	driver.findElement(By.id("btnSave")).click();	
}

 
	
}
