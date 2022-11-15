package testNGtest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTags {

	@BeforeSuite
	public void ms() {
		System.out.println("before suite");

	}

	@BeforeClass
	public void m() {
		System.out.println("before class");

	}

	@BeforeMethod
	public void n() {
		System.out.println("before method");
		Reporter.log("sssss",true);

	}

	@Test
	public void s() {
		System.out.println("Test method");

	}

	@BeforeTest
	public void r() {
		System.out.println("before test");

	}

	@AfterSuite
	public void mss() {
		System.out.println("after suite");

	}

	@AfterClass
	public void mo() {
		System.out.println("after class");

	}

	@AfterMethod
	public void na() {
		System.out.println("after method");

	}

	@AfterTest
	public void rz() {
		System.out.println("After test");

	}

}
