package practice.dummys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearDisableField {
 static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Users/DELL/git/ComPractice/src/main/java/practice/dummys/New.html");
		WebElement txtbox = driver.findElement(By.id("pwd"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('pwd').value=''");

	}
	public static void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Users/DELL/git/ComPractice/src/main/java/practice/dummys/New.html");
		
	}

}
