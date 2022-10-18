package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String AttrValue=driver.findElement(By.id("input-email")).getAttribute("placeholder");
    
		System.out.println(AttrValue);
		
	//	WebElement emailId=driver.findElement(By.id("input-email"));
		
		//emailId.sendKeys("test@gmail.com");
		//String text=emailId.getAttribute("value");
		//System.out.println(text);
		
		By emailId=By.id("input-email");
		By regsLink=By.linkText("Register");
		By logoImage=By.className("img-responsive");
		
		String text1=dogetAttribute(emailId,"placeholder");
		String text2=dogetAttribute(regsLink,"href");
		String text3=dogetAttribute(logoImage,"src");
		String text4=dogetAttribute(logoImage,"title");
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		System.out.println(text4);
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static  String dogetAttribute(By locator,String attrName){
		return getElement(locator).getAttribute(attrName);
		
	}

}
