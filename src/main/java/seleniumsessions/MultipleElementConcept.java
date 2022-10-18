package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElementConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement>linksList=driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		
	/*	for(int i=0;i<linksList.size();i++){
		String Text=linksList.get(i).getText();
		System.out.println(Text);
		
		if(Text.length()!=0){
			System.out.println(Text);
		}
		}*/
		
		for(WebElement e:linksList){
			String Text=e.getText();
			System.out.println(Text);
			if(Text.length()!=0){
				System.out.println(Text);
			}
			
			String hrefVal=e.getAttribute("href");
			System.out.println(hrefVal);
		}
		
		

	}

}
