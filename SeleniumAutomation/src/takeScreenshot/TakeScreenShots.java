package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();// open Chrome Browser
		
		driver.manage().window().maximize();// Maximize the browser
		
		driver.get("https://www.amazon.in/");// open browser and load amazon app
		
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;// upcasting
		
		File src= ts.getScreenshotAs(OutputType.FILE);// Loading ss to RAM
		
		File des = new File("./Amazon.png");// Create Path for File to store
		
		FileUtils.copyFile(src, des);// Storing from source to destination file
		
		
		
		
		
		
	}
}
