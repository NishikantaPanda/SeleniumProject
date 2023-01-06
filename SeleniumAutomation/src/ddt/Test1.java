package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream("./TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mo=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		//Thread.sleep(3000);
		
		Actions a = new Actions(driver);
		
		a.moveToElement(mo);
		
		driver.findElement(By.xpath("(//span[text()='Sign in'])[2]")).click();
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		
		
		
	}
	
}
