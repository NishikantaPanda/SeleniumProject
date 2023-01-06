package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase4 {

	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void testCase4() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver.findElement(By.name("email")).sendKeys("nishikantapanda7@gmail.com");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		//Reporter.log(driver.getCurrentUrl(), true);
		
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
