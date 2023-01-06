package pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {

	@FindBy(id="username")
	private WebElement usernametb;
	
	public Actitime(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginbtn;
	
	
	
	public void username(String username) {
		
		usernametb.sendKeys(username);
	}
    public void password(String password) {
		
		passwordtb.sendKeys(password);
	}
    public void loginbtn() {
	
	loginbtn.click();;
}


}
