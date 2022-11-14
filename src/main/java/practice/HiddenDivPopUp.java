package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenDivPopUp {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("keshav4742@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kish@4742@");
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		

	}

}
