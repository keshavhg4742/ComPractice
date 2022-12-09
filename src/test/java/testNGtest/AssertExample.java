package testNGtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertExample {
	@Test
	public void test() {
		Reporter.log("assert test begins",true);
		Assert.assertEquals("sbc", "bgm");
		Reporter.log("assert test end",true);
	}
	@Test
	public void test1() {
		Reporter.log("assert testA begins",true);
		Assert.assertEquals("sbc", "sbc");
		Reporter.log("assert testA end",true);
	}


}
