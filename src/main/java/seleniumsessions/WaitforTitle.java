package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforTitle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// browser - ch

		driver.get("https://www.freshworks.com/");
		
		waitForTitleContains(10,"Freshworks | Modern and Easy Customer and Employee Experience Software");
		// WebDriverWait wait = new WebDriverWait(driver,
		// Duration.ofSeconds(5));
		// if(wait.until(ExpectedConditions.titleIs("Freshworks | Modern and
		// Easy Customer and Employee Experience Software")));
		// System.out.println(driver.getTitle());

	

	}

	public static String waitForTitleContains(int timeOut, String titleFraction) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			System.out.println(driver.getTitle());
			return driver.getTitle();

		} else {
			return null;
		}

	}
	public static String waitForTitleIs(int timeOut, String titleValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleIs(titleValue))) {
			return driver.getTitle();
		} else {
			return null;
		}

}
}
