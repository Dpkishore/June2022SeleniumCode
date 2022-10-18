package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
	WebElement sourceele=	driver.findElement(By.id("draggable"));
	WebElement targetele=	driver.findElement(By.id("droppable"));
	
	Actions act=new Actions(driver);
//	act.dragAndDrop(sourceele, targetele).build().perform();
	
	act.clickAndHold(sourceele).moveToElement(targetele).release().build().perform();
	}

}
