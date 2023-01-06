package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pomPages.SeleniumTab;
import pomPages.SkillrayLogin;
import pomPages.WishListPage;

public class TestCase3 extends StepGroup {

	@Test
	public void tc3() throws IOException {
		
	SkillrayLogin sl = new SkillrayLogin(driver);
	sl.searchTab(data.getPropertyData("search"));
	sl.searchButton();
	
	SeleniumTab st = new SeleniumTab(driver);
	st.courseName();
	
	WishListPage wp = new WishListPage(driver);
	
	wp.closePopup();
	
	driverutilities.switchFrame2(driver);
	
	wp.playButton();
	
	//Thread.sleep(4000);
	
	wp.pauseButton(); 
	
	driverutilities.switchBackFromFrame(driver);
	
	wp.wishlistButton();
	
	}
	
	
}
