package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		
		Thread.sleep(4000);
		
		doSearch("Summer Dresses > Printed Summer ");
		
		//List<WebElement>SuggList=driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		//driver.findElement(By.xpath("//div[@class='ac_results']//li")).click();
		
	/*	for(WebElement  e:SuggList){
		String Text=e.getText();
		
		System.out.println(Text);
		if(Text.contains("Printed Dress")){
			e.click();
			
			break;
		}
		}*/

	}
	
	public  static void doSearch(String text){
		By SuggestList= By.xpath("//li[text()='"+text+"']");
		
		driver.findElement(SuggestList).click();
	}
	
public  List<WebElement>getElements(By locator){
		
		return driver.findElements(locator);
		
	}
	
	public  WebElement getElement(By locator){
		return driver.findElement(locator);
	}

}
