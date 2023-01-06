package pom;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void calls() {
		Reporter.log("Calls", true);
	}
	
	@Test(priority=-1,invocationCount=3,enabled=false)
	public void chats() {
		Reporter.log("Chats", true);
	}
	
	@Test(priority=1)
	public void settings() {
		Reporter.log("Settings", true);
	}
}
