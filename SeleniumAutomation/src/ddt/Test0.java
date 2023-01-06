package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException, InterruptedException {


		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("./data.properties");
		p.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("url"));
		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//Thread.sleep(2000);
		//driver.close();
		
		
		
		
	}

}
