package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandler {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
	Set<String>handles=	driver.getWindowHandles();
	Iterator<String>it=handles.iterator();
	String ParentWindowId=it.next();
	System.out.println("ParentWindowId"+ParentWindowId);
	
	String ChildWindowId=it.next();
	System.out.println("ChildWindowId"+ChildWindowId);
	
	driver.switchTo().window(ChildWindowId);
	Thread.sleep(2000);
	System.out.println("ChildWindowTitle"+driver.getTitle());
	driver.findElement(By.name("first_name")).sendKeys("pavan");
	driver.close();
	
	driver.switchTo().window(ParentWindowId);
	System.out.println("parent window title : " + driver.getTitle());
	driver.quit();

	}

}
