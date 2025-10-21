package testNg;

	 
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	 
	import com.aventstack.extentreports.Status;
	 
	public class ListenerClass_Listeners implements ITestListener {
		
		WebDriver driver;
		
		@Override
		public void onStart(ITestContext context) {
			ReportsClass_Listeners.createReport();
		}
		
		
		@Override
		public void onTestStart(ITestResult result) {
			ReportsClass_Listeners.createTest(result.getMethod().getMethodName());
		}
		
		@Override
		public void onTestSuccess(ITestResult result) {
			ReportsClass_Listeners.test.log(Status.PASS, "this test passed");
		}
		
		@Override
		public void onTestFailure(ITestResult result) {
			ReportsClass_Listeners.test.log(Status.FAIL, "this test failed");
			driver = (WebDriver) result.getTestContext().getAttribute("drivername");
			String str = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			ReportsClass_Listeners.test.addScreenCaptureFromBase64String(str);
		}
		
		@Override
		public void onFinish(ITestContext context) {
			ReportsClass_Listeners.endReport();
		}
	}


