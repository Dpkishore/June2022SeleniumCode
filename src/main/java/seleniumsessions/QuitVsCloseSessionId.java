package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsCloseSessionId {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavankishore\\OneDrive\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// launch chrome browser//123
		
	//	Thread.sleep(3000);
		driver.get("https://www.google.com");// enter url//123

		String title = driver.getTitle();// get the title//123
		System.out.println("page title : " + title);// Google
		// close the browser:
		// driver.quit();//123
		 driver.close();

		driver = new ChromeDriver();// launch chrome browser//456 - new session
		driver.get("https://www.google.com");// 456
		System.out.println(driver.getTitle());// 45
		driver.quit();

	}

}
