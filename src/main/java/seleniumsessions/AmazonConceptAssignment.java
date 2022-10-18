package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonConceptAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		/*
		 * By signIn = By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span");
		 * 
		 * ElementUtil eleUtil = new ElementUtil(driver); doClick(signIn); By
		 * username = By.id("ap_email");
		 * 
		 * By loginBtn = By.xpath("//*[@id=\"continue\"]");
		 * 
		 * doSendKeys(username, "9951065225"); 
		 * doClick(loginBtn);
		 *  By pwd =
		 * By.id("password"); By loginBtn1 =
		 * By.xpath("//*[@id=\"ap_password\"]"); doSendKeys(loginBtn1,
		 * "pavan@123"); By loginBtn2 = By.id("signInSubmit");
		 * doClick(loginBtn2);
		 */
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Iphone x");
		// searchbox.submit();

		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.linkText(
				"Motorola Razr 5G | Unlocked| Made for US by Motorola | 8/256GB | 48MP Camera | 2020 | Blush Gold"))
				.click();
		Select quantity = new Select(driver.findElement(By.xpath("//div/span/select")));
		
		Thread.sleep(3000);
		System.out.println(quantity);
		quantity.selectByIndex(2);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

		// driver.findElement(By.cssSelector(""))

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
