package com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OhrmTestNg {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MallikaGollakotaGoll\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	

	
		WebElement un = driver.findElement(By.id("txtUsername"));
		if (un.isDisplayed()) {
			un.clear();
			un.sendKeys("Admin");
		}
		
		else{
			System.out.println("Text box not found");
		}
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
	}
	
	@Test
	public void Leave() throws Exception{
		
	driver.findElement(By.xpath("//a[contains(@id, 'menu_leave_viewLeaveModule')]")).click();
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.id("menu_leave_Configure"))).build().perform();
	Thread.sleep(300);
	driver.findElement(By.id("menu_leave_leaveTypeList")).click();
	driver.findElement(By.id("btnAdd")).click();
	driver.findElement(By.id("leaveType_txtLeaveTypeName")).sendKeys("Shravani");
	driver.findElement(By.id("saveButton")).click();
	}
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}
}
