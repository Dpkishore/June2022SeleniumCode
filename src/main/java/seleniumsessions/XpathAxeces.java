package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxeces {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("pavanautomation");
		driver.findElement(By.name("password")).sendKeys("haji@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		
		
		Thread.sleep(3000);
		String con_xpath="//a[text()='Ali Khan']/parent::td/preceding-sibling::td/input[@type='checkbox'] ";
		
		driver.findElement(By.xpath(con_xpath)).click();
		//By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td"))
	//	selectContact("raman sainai");
	//	selectContact("Ali Khan");
		
/*List<WebElement>conList=driver.findElements(By.xpath("//a[text()='Ali Khan']/parent::td/following-sibling::td"));
		for(WebElement e:conList){
		String Text=e.getText();
		if(Text.length()!=0){
			System.out.println(Text);
		}
		}*/
		getUserinfo("raman sainai");
		getUserinfo("Ali Khan");

	}
	
	public static ArrayList<String> getUserinfo(String username){
		
		List<WebElement>conList=driver.findElements(By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td"));
		
		ArrayList<String>contValue=new ArrayList<String>();
		for(int i=0;i<conList.size();i++){
			String text=conList.get(i).getText();
			System.out.println(text);
			contValue.add(text);
		}
		return contValue;
	}
	public static void selectContact(String username){
   String con_xpath="//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox'] ";
		
		driver.findElement(By.xpath(con_xpath)).click();
		
	}

}
