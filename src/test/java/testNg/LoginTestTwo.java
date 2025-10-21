package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestTwo extends BaseClass{
//		WebDriver driver;
		@BeforeClass
		public void setUpTwo() {
			//driver = new ChromeDriver();
			driver.get("https://training-support.net/webelements/login-form");
		}
		@Test
		public void loginTest() {
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("password");
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			String targetText = driver.findElement(By.tagName("h2")).getText();
			Assert.assertNotEquals(targetText, "Welcome Back, Admin!");	

			
		}
		
	}

