package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsMethod {
	public WebDriver driver;
	public void l() {
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@Test
	public void launch() {
		
		l();
		Reporter.log("browser is launch", true);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(dependsOnMethods = "launch")
	public void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
		Reporter.log("login sucess", true);
	}

	@Test(dependsOnMethods ="login")
	public void next() {
		Reporter.log("enter next", true);
	}

	/*
	 * @Test(dependsOnGroups = { "SignIn" }) public void ViewAcc() {
	 * System.out.println("View Your Dashboardd"); }
	 * 
	 * @Test(groups = { "SignIn" }) public void OpenBrowser() {
	 * System.out.println("Browser Opened Successfully"); }
	 * 
	 * @Test(groups = { "SignIn" }) public void LogIn() {
	 * System.out.println("Login Into The Account"); }
	 */

}
