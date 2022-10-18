package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver	driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//JavascriptExecutor  js=(JavascriptExecutor )driver;
	//	js.executeScript("alert('hello java')");
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		//String PageText=jsUtil.getPageInnerText();
		//System.out.println(PageText);
	//	jsUtil.getTitleByJS();
		//WebElement signup=driver.findElement(By.linkText("Sign up"));
		
		//jsUtil.clickElementByJS(signup);
		jsUtil.scrollPageDown();
		Thread.sleep(2000);
		jsUtil.scrollPageUp();
		Thread.sleep(2000);
		jsUtil.scrollPageDown();
	}

}
