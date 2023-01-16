package practice.dummys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions {

	public static void main(String[] args) {
		ClearDisableField.setup();
		WebDriver driver = ClearDisableField.driver;
		WebElement sele = driver.findElement(By.id("se"));
		Select select = new Select(sele);
		List<WebElement> options = select.getOptions();
		select.selectByValue("ece");
		for (WebElement e : options) {
			System.out.println(e.getText());
		}
		//driver.close();
	}

}
