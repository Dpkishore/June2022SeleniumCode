package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By email=By.id("input-email");
		By pwd=By.id("input-password");
		By logo=By.cssSelector("img.img-responsive");
		
		
		waitforWebElementPresence(email,10).sendKeys("pavan@gmail.com");
		getElement(pwd).sendKeys("pavan@123");
		if(waitforWebElementPresence(logo,5).isDisplayed()){
			
			System.out.println("logo is present");
			
		}
		
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement email_ele=wait.until(ExpectedConditions.presenceOfElementLocated(email));
		email_ele.sendKeys("pavan@gmail.com");
		driver.findElement(pwd).sendKeys("pavan@123");;
		
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement logo_ele=wait1.until(ExpectedConditions.presenceOfElementLocated(logo));
		boolean flag=logo_ele.isDisplayed();
		System.out.println(flag);*/

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitforWebElementPresence(By locator, int timeOut){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
		} 
		
	
	public static WebElement waitforWebElementVisible(By locator, int timeOut){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
		} 
		
}
