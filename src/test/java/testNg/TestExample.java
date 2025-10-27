package testNg;
import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {
	WebDriver driver;
	@BeforeClass
	public void openPage() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	// @Test
	public void loginPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement username1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username1.sendKeys("Admin");
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	@Test
	public void checkPage() {
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		 wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='oxd-main-menu-item']"))).click();
//      	WebElement myInfo = driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
//		myInfo.click();
		
		}
	
	
	@AfterClass
	public void closePage() {
		driver.quit();
	}

}
