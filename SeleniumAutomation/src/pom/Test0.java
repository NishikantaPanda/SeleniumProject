package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Class.Actitime;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().refresh();
		
		Actitime a = new Actitime(driver);
		a.username("admin");
		a.password("manager");
		a.loginbtn();
		
		Thread.sleep(4000);
		
		driver.close();
		
	}
}
