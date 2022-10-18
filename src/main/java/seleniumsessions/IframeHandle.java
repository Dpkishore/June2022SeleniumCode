package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//img[@title='vehicle-registration-forms-and-templates']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame-one748593425");
		
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Pavan");
		driver.switchTo().defaultContent();
	}

}
