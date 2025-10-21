package testNg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass {
	static WebDriver driver;
	@BeforeSuite
	public void setUpDriver() {
		System.out.println("inside suite");
		driver = new ChromeDriver();
	}
	@AfterSuite
	public void closeDriver() {
		driver.quit();
	}
	

}
