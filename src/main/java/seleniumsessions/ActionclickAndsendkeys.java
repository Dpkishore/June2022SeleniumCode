package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionclickAndsendkeys {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstName=By.id("input-firstname");
		By checkbox=By.name("agree");
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(firstName),"testing").build().perform();
		act.click(driver.findElement(checkbox)).build().perform();

	}

	
	public static void doActionClick(By locator){
		Actions act =new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}
	
	public static void doActionsSendkeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
