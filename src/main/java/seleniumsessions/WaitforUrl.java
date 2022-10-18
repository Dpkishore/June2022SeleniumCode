package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforUrl {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		By ytLink = By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]");
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.waitForElementVisible(ytLink, 10).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(500));
		
	
		
	}
	public static String waitForUrlContains(int timeOut,String urlFraction){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlContains(urlFraction))){
			return driver.getCurrentUrl();
			
		}else{
		
		return null;
		}
		
	}
	public static String waitForUrls(int timeOut,String urlValue){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if(wait.until(ExpectedConditions.urlToBe(urlValue))) {
			return driver.getCurrentUrl();
		
	}else{
		return null;
	}

}
}
