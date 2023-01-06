package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumTab {

	@FindBy(xpath="//a[text()=' Core Java For Selenium Trainin']")
	private WebElement course;
	
	
	public SeleniumTab(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void courseName() {
		course.click();
	}
	
	
}
