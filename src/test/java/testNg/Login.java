package testNg;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login extends BaseClass{
//	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		//driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
		String targetText = driver.findElement(By.tagName("h2")).getText();
		Assert.assertNotEquals(targetText, "Welcome Back, Admin!");
		
	}
	@Test
	public void sample() {
		System.out.println("Sample");
	}
	@Test
	public void sample2() {
		System.out.println("Sample two");
	}

}
