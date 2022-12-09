package brokenLink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindBrokenLinks {
	public static void main(String[] args) {
		String url = "";
		HttpURLConnection urlConnection;
		int responseCode;
		int validUrl=0,invalidUrl=0,thisDomainLinks=0,otherDomainLink=0;
		String homePage = "https://www.automationcodes.com/2020/02/selenium-webdriver-automation-framework.html";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(homePage);
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("total links= "+elements.size());
		Iterator<WebElement> itr = elements.iterator();
		while (itr.hasNext()) {
			url = itr.next().getAttribute("href");
			if (url == null || url.isEmpty()) {
				invalidUrl+=1;
				/*
				 * System.out.println("url is empty"); invalidUrl+=1;
				 */
				continue;
			}
			if (!url.startsWith(homePage)) {
				//System.out.println("url belong to other domain");
				otherDomainLink=+1;
				continue;
			}
			try {
				urlConnection=(HttpURLConnection) new URL(url).openConnection();
				//for returning header of link insted of description
				urlConnection.setRequestMethod("HEAD");
				urlConnection.connect();
				responseCode = urlConnection.getResponseCode();
				if (responseCode>=400) {
				//	System.out.println("links are Broken"+url);
					invalidUrl+=1;
				}
				else {
					validUrl+=1;
					//System.out.println("valid links");
				}
				
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		System.out.println("valid links : "+validUrl+" invalid links :"+invalidUrl);
		System.out.println("other domain link"+otherDomainLink);
	}

}
