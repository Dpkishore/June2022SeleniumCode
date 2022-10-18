package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.name("email")).sendKeys("pavan@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("pavan@123");
		//driver.findElement(By.className("form-control")).sendKeys("naveen");
		
		//driver.findElement(By.linkText("Login")).click();
		
		//driver.findElement(By.partialLinkText("Forgotten ")).click();
		//driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("pavan kishore");
		//driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Dasi");
		
	//	String text=driver.findElement(By.tagName("h1")).getText();
		
	//	System.out.println(text);
		
		By header=By.tagName("h1");
		By recPayment=By.linkText("Recurring payments");
		By warnMesg=By.className("alert");
		By continueBtn=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		System.out.println(warnMesg);
		
		
				
		
		String actHeader=doGetText(header);
		if(actHeader.equals("Register Account")){
			System.out.println("It is Correct");
		}else{
			System.out.println("In correct ");
		}
		
		
		
	
		String recPaymentText= doGetText(recPayment);
		System.out.println(recPaymentText);
		
		doClick(continueBtn);
		String WarmsgValue=doGetText(warnMesg);
		System.out.println(WarmsgValue);
		
			
		
	

	}
	public static String doGetText(By locator){
		
		return getElement(locator).getText();
		
	}
	public static void doClick(By locator){
		getElement(locator).click();
		
	}
	
	public static WebElement getElement(By locator){
		return  driver.findElement(locator);
		
	}

}
