package seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		//driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
	/*	Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("COURSES")).click();*/
		//By content=By.className("menulink");
		//By courses=By.linkText("COURSES");
		//level1MenuItems(content,courses);
	
	By parentmenu=	By.xpath("//div[text()='Add-ons']");
	By childmenu=By.xpath("//div[text()='Friends and Family']");
	level1MenuItems(parentmenu,childmenu );
	
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static void level1MenuItems(By parentmenu,By childmenu) throws InterruptedException{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentmenu)).build().perform();
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("COURSES")).click();
		getElement(childmenu).click();
		
	}
	
	public static void level2MenuItems(By parentmenu1,By parentmenu2,By childmenu) throws InterruptedException{
		Actions act=new Actions(driver);
		act.moveToElement(getElement(parentmenu1)).build().perform();
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("COURSES")).click();
		
		act.moveToElement(getElement(parentmenu2)).build().perform();
		Thread.sleep(3000);
		getElement(childmenu).click();
		
	}

}
