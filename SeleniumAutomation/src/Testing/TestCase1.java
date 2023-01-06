package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void testCase1() {
		driver.findElement(By.name("email")).sendKeys("Nishikanta Panda");
		driver.findElement(By.id("pass")).sendKeys("daldLLADOA@*@#*21");
		driver.findElement(By.name("login")).click();
		Reporter.log(driver.getCurrentUrl(), true);
		Reporter.log(driver.getTitle(), true);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
