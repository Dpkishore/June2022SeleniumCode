package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String msg=driver.findElement(By.xpath("//div[@id='content']//p")).getText();
	System.out.println(msg);

	}

}
