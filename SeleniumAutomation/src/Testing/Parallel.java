package Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {

	public WebDriver driver;
	
	@Parameters({"Raja"})
	@Test
	public void parallel(String browser) {
		
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		else
			driver= new FirefoxDriver();
		
	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("Nishikanta Panda");
		driver.findElement(By.id("pass")).sendKeys("daldLLADOA@*@#*21");
		driver.findElement(By.name("login")).click();
		Reporter.log(driver.getCurrentUrl(), true);
		Reporter.log(driver.getTitle(), true);
	}
}
