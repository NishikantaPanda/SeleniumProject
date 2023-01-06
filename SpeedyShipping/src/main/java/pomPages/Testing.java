package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {

	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement mycart;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public Testing(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}

	public WebElement getMycart() {
		return mycart;
	}

	public WebElement getFacebook() {
		return facebook;
	}
	
	public void facebook() {
		facebook.click();
	}
}
