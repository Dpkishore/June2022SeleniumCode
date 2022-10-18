package seleniumsessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		
		//*[local-name()='svg' and  @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']
		
		String X_path="	//*[local-name()='svg' and  @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']";
	List<WebElement>stateList=	driver.findElements(By.xpath(X_path));
	System.out.println(stateList.size());
	
	for(WebElement e:stateList){
		String IdVal=e.getAttribute("id");
		System.out.println(IdVal);
	}

	}

}
