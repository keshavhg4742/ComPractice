package practice.dummys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateMeth {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(3000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.navigate().refresh();
		System.out.println(driver.getTitle());

	}

}
