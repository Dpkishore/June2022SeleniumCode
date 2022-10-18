package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		WebElement country=driver.findElement(By.id("Form_getForm_Country"));
		country.sendKeys("India");
		
		Select sel =new Select(country);
		
		
		List<WebElement> CountryOption=sel.getOptions();
		
		System.out.println("get Option :"+(CountryOption.size()-1));
		
		
		
		for(WebElement e:CountryOption){
		String text=	e.getText();
		System.out.println(text);
		}
		
		
		
		//sel.selectByIndex(10);
		
	//	sel.selectByVisibleText("China");
	//	sel.selectByValue("India");
		
		By Country=By.id("Form_getForm_Country");
		//doSelectDropDownByIndex(Country,12);
		doSelectDropDownByIndex(Country,122);
		doSelectDropDownByVisibleText(Country, "Bolivia");
		doSelectDropDownByValue(Country, "Austria");
	

	}
	
	

	public static void doSelectDropDownByIndex(By locator ,int index){
		Select sel=new Select(getElement(locator));
		sel.selectByIndex(index);
			
		
	}
	public static void doSelectDropDownByVisibleText( By locator, String value){
		Select sel=new Select(getElement(locator));
		sel.selectByVisibleText(value);
		
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public List<WebElement> getDropDownOptions(By locator) {
	Select	select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public int getDropDownOptionsCount(By locator) {
		return getDropDownOptions(locator).size();
	}
	
	
	
	
	public static WebElement getElement(By locator){
		
		return driver.findElement(locator);
		
	}

}
