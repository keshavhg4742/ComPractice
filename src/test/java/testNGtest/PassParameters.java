package testNGtest;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PassParameters {
	
	@Test
	@Parameters("city")
	public void para(@Optional("cse")String s) {
		Reporter.log(s,true);
		
	}

}
