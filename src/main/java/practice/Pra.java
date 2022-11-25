package practice;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pra {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.chromiumdriver().setup();
	//	WebDriver driver = new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	Alert alert = driver.switchTo().alert();
		driver.get("https://demoqa.com/select-menu");
		Select select = new Select(driver.findElement(By.xpath("//input[@id='react-select-4-input']")));
		//System.out.println(select.isMultiple());
		
		
	
		/*
		 * select.getFirstSelectedOption(); for(WebElement e:list) {
		 * System.out.println(e.getText()); }
		 * System.out.println(select.getWrappedElement());
		 */
		
	}

}
