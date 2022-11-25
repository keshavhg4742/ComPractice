package testNGtest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import takescreenshot.CustumListener;
import takescreenshot.TakeScreen;


public class ScreenShotEx extends TakeScreen {
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod() {
		initi();
	}
	
	@Test
	public void test1()
	{
		Assert.assertEquals(false,true);
	}
	@Test
	public void test2()
	{
		Assert.assertEquals(false, true);
	}

}
