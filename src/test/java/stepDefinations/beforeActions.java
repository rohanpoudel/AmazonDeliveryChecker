package stepDefinations;

import cucumber.api.java.Before;
import utilities.SeleniumDriver;

public class beforeActions {
	
	@Before
	public static void setup() {
		
		
		System.out.println("BEFORE");
		
		SeleniumDriver.setDriver();
	}

}
