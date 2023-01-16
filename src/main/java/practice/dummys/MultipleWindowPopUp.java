package practice.dummys;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowPopUp {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		for (String st : windowHandles) {
			Thread.sleep(2000);
			//driver.switchTo().window(st);
			if(!(st.equals(parentWindow)))
				driver.switchTo().window(st);
				
				System.out.println(driver.getCurrentUrl());
	            System.out.println(driver.getTitle());
			
		}
		driver.switchTo().window(parentWindow);
		driver.close();

	}

}
