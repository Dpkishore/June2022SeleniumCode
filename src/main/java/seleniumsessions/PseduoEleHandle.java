package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PseduoEleHandle {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"),'::before').getPropertyValue('content')
		
	/*	JavascriptExecutor js =(JavascriptExecutor)driver;
	String man_text=	js
		.executeScript
		(" return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')")
      .toString();
	
	System.out.println(man_text);
	
	if(man_text.contains("*")){
		System.out.println("FN is a Mendatory Field");
		
	}else{
		System.out.println("FN is  not a Mendatory Field");
		
	}*/
		
		String Js_script="return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"), '::before').getPropertyValue('content')";
		isEleisMandatory(Js_script);
	}
	
public static boolean isEleisMandatory(String jsscript){
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	String man_text=js.executeScript(jsscript).toString();
		
	
	System.out.println(man_text);
	
	if(man_text.contains("*")){
		System.out.println("FN is a Mendatory Field");
		return true;
		
	}else{
		System.out.println("FN is  not a Mendatory Field");
		return false;
		
	}
	
}
}
