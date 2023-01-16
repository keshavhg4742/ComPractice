package testNGtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import takescreenshot.TakeScreen;

public class ListenerExample {
	WebDriver drivers;
	@Test
	public void takingscr() {
		WebDriverManager.chromedriver().setup();
		drivers=new ChromeDriver();
		drivers.get("https://www.google.com");
		Reporter.log("test case", true);
		Assert.assertTrue(false);

	}

	@AfterMethod
	public void screen(ITestResult re) {
		Reporter.log("scrshot taking",true);
		if(re.getStatus()==ITestResult.FAILURE)
		{
			
			TakeScreen.failed("sbc", drivers);
		 Reporter.log("scrshot",true);
			
		}
		

	}

}
