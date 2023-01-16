package testNGtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExamp {
	//@Test(groups = {""},description = "",dependsOnMethods = {""},
	//				enabeld="",timeout=,priority=	)
	@Test(groups = {"smoke"},description = "this is log featu",dependsOnMethods = {"logina"})
	public void login()
	{
		Reporter.log("login smoke group",true);
	}
	@Test(groups = {"reg"},description = "this is logsd featu")
	public void logins() {
		Reporter.log("logins reg group",true);

	}
	@Test(groups = {"reg"},description = "this is featu")
	public void logina() {
		Reporter.log("logina reg group",true);
		Assert.assertTrue(false);

	}

}
