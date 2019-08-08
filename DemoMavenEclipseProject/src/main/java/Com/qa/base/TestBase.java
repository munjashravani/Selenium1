package Com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	protected static Properties prop;

	/* public TestBase() {
		try {
			FileInputStream fi = new FileInputStream(
					"C:\\Users\\MallikaGollakotaGoll\\workspace\\DemoMavenEclipseProject\\src\\main\\java\\Com\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}    */

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MallikaGollakotaGoll\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			FileInputStream fi = new FileInputStream(
					"C:\\Users\\MallikaGollakotaGoll\\workspace\\DemoMavenEclipseProject\\src\\main\\java\\Com\\qa\\config\\config.properties");
			prop = new Properties();
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.get(prop.getProperty("Url"));
	}
}
