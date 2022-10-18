package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoTable {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-women-in-england-2022-1289245/england-development-squad-women-vs-india-women-warm-up-1332750/full-scorecard");
		//getwkttakerName("Shafali Verma");
		
		//getwkttakerName("Dayalan Hemalatha");
				
		 
	List<WebElement>scoreCard=driver.findElements(By.xpath("//span[text()='Shafali Verma']/ancestor::td/following-sibling::td"));
	
	for(WebElement e:scoreCard){
	String Text=e.getText();
	System.out.println(Text);
	}
	

	}
	public static String getwkttakerName(String name){
		
		String wk_xpath="//span[text()='"+name+"']/ancestor::td/following-sibling::td";
		String WktakerName=driver.findElement(By.xpath(wk_xpath)).getText();
		System.out.println(WktakerName);
		return WktakerName;

	}

}
