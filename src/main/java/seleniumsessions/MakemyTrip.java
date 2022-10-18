package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakemyTrip {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

  By login=By.xpath("//p[text( )='Login or Create Account']");
  doClick(login);
  By email=By.id("username");
  ElementUtil eleUtil = new ElementUtil(driver);
	eleUtil.doSendKeys(email, "9951065225");
	Thread.sleep(4000);
	
	By btn=By.xpath("//span[text()='Continue']");
	System.out.println(btn);
	Thread.sleep(2000);
	doClick(btn);


		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}
}
