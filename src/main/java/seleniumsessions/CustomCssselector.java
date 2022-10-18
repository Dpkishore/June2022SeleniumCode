package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssselector {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By email=By.cssSelector("#username");
		
	List<WebElement>manFieldList =	driver.findElements(By.cssSelector("input#username,input#password,button#loginBtn,small#password-description"));

	
	System.out.println(manFieldList.size());
	
	if(manFieldList.size()==4){
		System.out.println("PASS");
	}
	}

}
