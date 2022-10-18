package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementSectionLink {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
      List<WebElement>sectionLinks=  driver.findElements(By.className("list-group-item"));
      
      System.out.println(sectionLinks.size());
      
      for(WebElement e:sectionLinks){
    	  System.out.println(e.getText());
    	  
    	By rightSectionLinks=  By.className("list-group-item");
    	
    	ElementUtil eleUtil=new ElementUtil(driver);
    	
    /*	ArrayList<String> textList=eleUtil.getElementTextList(rightSectionLinks);
    	
    	System.out.println(textList);
    	
    	if(textList.contains("Order History")){
    		System.out.println("PASS");
    		
    	}*/
      }
	}

}
	
