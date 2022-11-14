package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		//selectChoiceByValue(driver, "choice 6 2 1");
		//selectChoiceByValue(driver, "choice 5","choice 4","choice 7");
		selectChoiceByValue(driver, "all");
		
	}
	public static void selectChoiceByValue(WebDriver driver,String... value) {
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if (!value[0].equalsIgnoreCase("all")) {
			
			for (WebElement e : elements) {				
				String text = e.getText();
				
				for (String tx : value) {
					if(text.equalsIgnoreCase(tx))
					{
						e.click();
						break;
					}
				}
			}
		}
			else {
				try {
					for(WebElement e:elements)
					{
						e.click();
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
				
		
			
		
		
	}

}
