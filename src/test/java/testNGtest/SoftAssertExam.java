package testNGtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExam {
	
	@Test
	public void test() {
		SoftAssert softAssert = new SoftAssert();
		Reporter.log("softassert test begins",true);
		try{
			softAssert.assertEquals("sbc", "bgm");
		}catch (Exception e) {
			System.err.println("assert fails");
		}
		Reporter.log("softassert test end",true);
		//to tell the softAssetion to throw the exception 
		//otherwise it execute normal but not throw exception
		//softAssert.assertAll();
	}
	@Test
	public void test1() {
		SoftAssert softAssert = new SoftAssert();
		Reporter.log("softassert testA begins",true);
		softAssert.assertEquals("sbc", "sbc");
		Reporter.log("softassert testA end",true);
	}

}
