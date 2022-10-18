package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By SearchKey=By.name("q");
		By Sugession=(By.xpath("//div[@class='wM6W7d']/span"));
		
		gooeleSearch(SearchKey,"selenium",Sugession,"selenium webdriver");
		
	/*	driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		List<WebElement>suggesList=driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		System.out.println(suggesList.size());
		
		
		for(WebElement e: suggesList){
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("selenium webdriver")){
				e.click();
				
				break;
			}
		}
		
		

	}*/
	}
	
	public static List<WebElement>getElements(By locator){
		
		return driver.findElements(locator);
		
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	
	public static void gooeleSearch(By Searchlocator,String SearchKey, By SuggLocator, String value) throws InterruptedException{
		
		
	driver.findElement(Searchlocator).sendKeys(SearchKey);
		
		Thread.sleep(3000);
		
		List<WebElement>suggesList=getElements(SuggLocator);
		System.out.println(suggesList.size());
		
		
		for(WebElement e: suggesList){
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals(value)){
				e.click();
				
				break;
			}
		}
		
		

	}
		
	}
	
	


