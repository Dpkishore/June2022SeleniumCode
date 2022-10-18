package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumException {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
	//	WebElement ele=driver.findElement(By.name("search11"));
	//	ele.sendKeys("macbook pro");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//pavan"));
		System.out.println(footerLinks.size());
		
		List<WebElement> list = driver.findElements(By.name("search"));
		System.out.println(list.size());
		
		
		
		if(list.size()==1) {
			System.out.println("single search ele is present on the page");
		}
		else {
			System.out.println("no search or multiple search present on the page");
		}
		
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		if(flag) {
			System.out.println("search ele is present on the page");

		}
	}
	
	public static boolean isSingleElementPresnt(By locator) {
		List<WebElement> list = driver.findElements(locator);
		System.out.println(list.size());
		
		//1.
		if(list.size()==1) {
			System.out.println("single search ele is present on the page");
			return true;
		}
		else {
			System.out.println("no search or multiple search present on the page");
			return false;
		}
	}

}
