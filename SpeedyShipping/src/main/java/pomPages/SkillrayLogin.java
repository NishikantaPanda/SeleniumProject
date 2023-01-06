package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrayLogin {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearstab;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtab;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	
	public SkillrayLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton() {
		gearstab.click();
	}
	
	public void demoSkillrayApp() {
		demoapp.click();
	}
	
	public void searchTab(String key) {
		searchtab.sendKeys(key);
	}
	
	public void searchButton() {
		searchbtn.click();
	}
	
}
