package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavankishore\\OneDrive\\Desktop\\chromedriver.exe");

	//	WebDriver driver = new ChromeDriver();
		
		
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavankishore\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		//WebDriver driver =  new FirefoxDriver();
	
		//WebDriver driver =  new SafariDriver();
		
		
		
		String browser="Firefox";
		
		
		switch (browser.toLowerCase()) {
		case "chrome":
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavankishore\\OneDrive\\Desktop\\chromedriver.exe");

				 driver = new ChromeDriver();
			
			break;
		case "firefox":
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\pavankishore\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

			 driver =  new FirefoxDriver();
			 
			break;

		default:
			
			System.out.println("plz pass the Right Browser");
			break;
		}
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();// get the title
		System.out.println("page title : " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// close the browser:
		driver.quit();

	
	}

}
