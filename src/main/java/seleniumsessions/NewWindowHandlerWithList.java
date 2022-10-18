package seleniumsessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowHandlerWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(3000);

		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);

		Set<String> handles = driver.getWindowHandles();
		List<String> handleList = new ArrayList<String>(handles);
		
		String parentwindowId = handleList.get(0);
		System.out.println("parentwindowId"+parentwindowId);
		
		String childWindowId = handleList.get(1);
		System.out.println("child window id : " + childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		
		System.out.println("child window title : " + driver.getTitle());
		driver.findElement(By.name("first_name")).sendKeys("naveen");
		
		driver.close();

		driver.switchTo().window(parentwindowId);
		System.out.println("parent window title : " + driver.getTitle());

		driver.quit();
	}

}
