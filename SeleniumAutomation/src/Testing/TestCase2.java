package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {

	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testCase() throws InterruptedException {
		driver.findElement(By.linkText("Create a Page")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='Get Started'])[1]")).click();
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
