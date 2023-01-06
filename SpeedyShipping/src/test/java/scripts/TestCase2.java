package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.StepGroup;
import pomPages.SkillrayDemoLogin;
import pomPages.SkillrayLogin;
import pomPages.Testing;

public class TestCase2 extends StepGroup {

	@Test
	public void tc2() throws IOException {
	SkillrayLogin sl = new SkillrayLogin(driver);
	sl.gearsButton();
	sl.demoSkillrayApp();
	
	SkillrayDemoLogin sdl = new SkillrayDemoLogin(driver);
	driverutilities.switchTabs(driver);
	driverutilities.dropDown(sdl.getCoursedd(), data.getPropertyData("coursedd"));
	
	Testing t = new Testing(driver);
	driverutilities.dragAndDrop(driver, t.getSeleniumtraining(), t.getMycart());
	
	Point loc = t.getFacebook().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	
	driverutilities.scrollBar(driver, x, y);
	t.facebook();
	
	
	
	}
	
	
}
