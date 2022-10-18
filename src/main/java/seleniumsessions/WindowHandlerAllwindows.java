package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerAllwindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		
		String ParentWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']/a)[4]")).click();
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		while(it.hasNext()){
			String windowid=it.next();
			driver.switchTo().window(windowid);
			String Title=driver.getTitle();
			System.out.println(Title);
			if(windowid.equals(ParentWindowId)){
				//driver.close();
			}
		}
		driver.switchTo().window(ParentWindowId);
		System.out.println(driver.getTitle());
	}

}
