package com.SeleniumJava;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumBasic {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.gecko.driver","C:\\Users\\MallikaGollakotaGoll\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Hello");
		

	}

}
