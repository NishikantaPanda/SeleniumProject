package scripts;

import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pomPages.AddtoCart;
import pomPages.SkillrayDemoLogin;
import pomPages.SkillrayLogin;

public class TestCase1 extends StepGroup {

	@Test
	public void tc1() {
		
		SkillrayLogin skl = new SkillrayLogin(driver);
		skl.gearsButton();
		skl.demoSkillrayApp();
		
		SkillrayDemoLogin sdl = new SkillrayDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver, sdl.getCoursetab());
		sdl.seleniumTraining();
		
		AddtoCart atc = new AddtoCart(driver);
		driverutilities.doubleClick(driver, atc.getAddbtn());
		atc.addtoCart();
		
		driverutilities.switchFrame(driver);
		
		
		
		
	}
}
