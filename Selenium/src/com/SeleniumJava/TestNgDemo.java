package com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MallikaGollakotaGoll\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void Title(){
		String Title = driver.getTitle();
		System.out.println(Title);
	}
	

	@Test
	public void TextBox(){
		driver.findElement(By.name("q")).sendKeys("Autumation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}
}
