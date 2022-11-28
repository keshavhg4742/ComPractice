package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.name("q"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele)
		.keyDown(ele,Keys.SHIFT)
		.sendKeys(ele,"selenium")
		.keyUp(ele, Keys.SHIFT)
		.sendKeys(Keys.ENTER)
		.perform();

	}

}
