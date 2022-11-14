package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		String parentid = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		for(String s:windowHandles)
		{
			driver.switchTo().window(s);
			Thread.sleep(10000);
			System.out.println(driver.getTitle());
			
		}
		driver.close();

	}

}
