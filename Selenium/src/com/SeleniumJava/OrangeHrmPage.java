package com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmPage {
	
	static WebDriver driver;
	public void BrowserLaunch (){
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\MallikaGollakotaGoll\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.orangehrm.com/features/");
	 driver.manage().window().maximize();
	}
	
	public  void Subscription (String fn,String ln, String email, String jt){
		 driver.findElement(By.xpath("//a[contains (@class, 'btn-orange trial-btn pulse')]")).click();
		 driver.findElement(By.name("FirstName")).sendKeys(fn);

		 driver.findElement(By.name("LastName")).sendKeys(ln);
		 driver.findElement(By.name("Email")).sendKeys(email);
		 driver.findElement(By.name("JobTitle")).sendKeys(jt);
		 
		 driver.quit();
		 
	}
}
