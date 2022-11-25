package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreen {
	public static WebDriver driver;
	public static  void initi() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public void failed(String getMethodName) {
		 TakesScreenshot ts = (TakesScreenshot)driver;
		 File srcfile = ts.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(srcfile, new File(".\\screenshot"+getMethodName+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}

}
