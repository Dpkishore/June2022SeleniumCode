package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShadowDomHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//document.querySelector("#snacktime").shadowRoot.querySelector("#tea")
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		driver.switchTo().frame("pact");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement tea=(WebElement)js.executeScript("document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		
		tea.sendKeys("masala tea");

	}

}
