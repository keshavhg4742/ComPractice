package practice.dummys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClearField {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://C:/Users/DELL/git/ComPractice/src/main/java/practice/dummys/New.html");
		WebElement txtbox = driver.findElement(By.id("as"));
		Thread.sleep(3000);
		txtbox.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
		WebElement chbox = driver.findElement(By.id("chb"));
		chbox.click();
		System.out.println(chbox.isSelected());
	}

}
