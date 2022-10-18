package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavankishore\\OneDrive\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		String title = driver.getTitle();
		System.out.println("page Title" + title);

		if (title.equals("Google")) {
			System.out.println("pass");

		} else {
			System.out.println("Fail");
		}

		String url = driver.getCurrentUrl();
		System.out.println(url);

		
		
		String source = driver.getPageSource();
		 System.out.println(source);
		 
		 
		 
		 
		 if (source.contains("Copyright The Closure Library Authors")) {
				System.out.println("Pass");
			}
		 
		// driver.close();
		 
	}

}
