package practice.dummys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameExample {

	public static void main(String[] args) throws Exception {
		ClearDisableField.setup();
		WebDriver driver=ClearDisableField.driver;
		driver.switchTo().frame("frm");
		driver.findElement(By.id("txt")).sendKeys("abcd");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("as")).sendKeys("axzq");

	}

}
