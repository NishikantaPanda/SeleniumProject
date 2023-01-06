package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	@FindBy(xpath="(//button[contains(@class,'Button_module_')])[1]")
	private WebElement playbtn;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement wishlistbtn;
	
	@FindBy(xpath="//a[text()='X']")
	private WebElement popup;
	
	public void wishlistButton() {
		wishlistbtn.click();
	}
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void closePopup() {
		popup.click();
	}
	
	public void playButton() {
		playbtn.click();
	}
	
	public void pauseButton() {
		pausebtn.click();
	}
}
