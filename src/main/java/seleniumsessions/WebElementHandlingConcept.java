package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementHandlingConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    //  driver.findElement(By.id("input-email")).sendKeys("pavan@gmail.com");
     // driver.findElement(By.id("input-password")).sendKeys("pavan@123");
      
	//	By email=By.id("input-email");
	//	By pwd =By.id("input-password");
		
		//WebElement emailid=driver.findElement(email);
	//	WebElement password=driver.findElement(pwd);
	//	emailid.sendKeys("rakesh@gmail.com");
	//	password.sendKeys("rakesh@123");
		
		
	//	By email = By.id("input-email");
	//	By password = By.id("input-password");
	//	getElement(email).sendKeys("pavan@gmail.com");
	//getElement(password).sendKeys("pavan@123");
		
	//	By email=By.id("input-email");
	//	By password=By.id("input-password");
	//	doSendKeys(email,"narasima@gmail.com");
	//	doSendKeys(password,"narasima@123");
		
		
		
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "pavan@gmail.com");
		eleUtil.doSendKeys(password, "pavan@123");
	//	eleUtil.doclick(loginBtn);
		
		
	}
	
	
	private static void doSendKeys(By locator, String value) {
		// TODO Auto-generated method stub
		getElement(locator).sendKeys(value);
		
	}


	public static WebElement getElement(By locator){
		
		return driver.findElement(locator);
		
	}
	
	public static void doclick(By locator){
		getElement(locator).click();
	}

}
