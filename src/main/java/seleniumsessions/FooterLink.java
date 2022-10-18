package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLink {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By footers=By.xpath("//footer//a");
		
		System.out.println(footers);
		ArrayList<String> actFooterList= getFooterLinks(footers);
	
	System.out.println(actFooterList);
	
	if(actFooterList.contains("About Us")){
		System.out.println("PASS");
	}
		

	}
	
	public static ArrayList<String> getFooterLinks(By locator){
		
		
		List<WebElement>footerList=driver.findElements(locator);
		System.out.println(footerList.size());
		
		
		ArrayList<String>eleTextList=new ArrayList<String>();
		for(WebElement e:footerList){
			
			String Text=e.getText();
			System.out.println(Text);
			
		}
		
		return eleTextList;
	}
	
	

}
