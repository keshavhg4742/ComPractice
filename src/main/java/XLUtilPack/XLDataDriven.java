package XLUtilPack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XLDataDriven {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider ="logindata")
	public void loginTest(String userName, String password, String exp) {
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement email = driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("userName");
		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.clear();
		pwd.sendKeys("password");
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		String expTitle = "Dashboard / nopCommerce administration";
		String actTitle = driver.getTitle();
		if(exp.equals("valid"))
		{
			if(expTitle.equals(actTitle))
			{
				driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("invalid")){
			if(expTitle.equals(actTitle))
			{
				driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(false);
				
			}
		}

	}

	@DataProvider(name ="logindata")
	public String[][] getData() throws FileNotFoundException, IOException {
		XLUtility utility = new XLUtility("C:\\Users\\DELL\\git\\ComPractice\\XLFile\\myFile.xlsx");
		int rowCount = utility.getRowCount("Sheet1");
		int totalCol = utility.getCellCount("Sheet1", 1);
		String loginData[][] = new String[rowCount][totalCol];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < totalCol; j++) {
				// i-1 bcoz store data in 0th row index ie(0,0)
				loginData[i - 1][j] = utility.getCellData("Sheet1", i, j);

			}

		}
		return loginData;

	}

	@AfterClass
	public void close() {
		driver.close();

	}

}
