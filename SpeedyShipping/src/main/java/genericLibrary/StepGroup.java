package genericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup {

	public WebDriver driver;
	public PropertyFile data = new PropertyFile();
	public WebDriverUtilities driverutilities = new WebDriverUtilities();
	
	@BeforeMethod
	public void openApp() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(data.getPropertyData("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp(ITestResult tr) throws IOException {
		
		int status = tr.getStatus();
		String name = tr.getName();
		if(status==2) {
			
			Screenshot s = new Screenshot();
			s.takeScreenshot(driver, name);
			
		}
		driver.quit();
	}
}
