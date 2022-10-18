package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 * @throws Exception
	 */
	public WebDriver launchBrowser(String browser){
		System.out.println("browser name is :" + browser);

		// String browser="Firefox";

		switch (browser.toLowerCase()) {
		case "chrome":

			//System.setProperty("webdriver.chrome.driver",
				//	"C:\\Users\\pavankishore\\OneDrive\\Desktop\\chromedriver.exe");

			//driver = new ChromeDriver();
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

			
		case "firefox":

			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\pavankishore\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
			
			
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();

			break;

		default:

			System.out.println("plz pass the Right Browser");
			//throw new Exception("WRONGBROWSER");
			//break;

		}
		return driver;
	}
	
	public void launchUrl(URL url) throws Exception{
		
		String newURL=String.valueOf(url);
		if(newURL==null){
			System.out.println("url is null");
			throw new  Exception("URLISNULL");
		}
		
		if(newURL.length()==0){
			System.out.println("url is blank");
			throw new  Exception("URLISBLANKEXCEPTION");
		}
		
		
		if(newURL.indexOf("http")!=0 && newURL.indexOf("https")!=0){
			System.out.println("http(s) is missing in url");
			
			throw new  Exception("HTTP(s)MiSSINGEXCEPTION");
		}
		
		
		driver.navigate().to(url);
		
	}
	
	
	
	
	
	public void launchUrl(String url) throws Exception {
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}
		driver.get(url);
	}
	
	public String getPageTitle(){
		
	String Title=	driver.getTitle();
	
	System.out.println("Page title is :"+Title);
	
	if(Title!=null){
		return Title;
	}else{
		
		
		System.out.println("Title is null");
		return null;
	}
		
	}
	
	public String getPageUrl(){
		String Url=driver.getCurrentUrl();
		
		System.out.println("Page Url is :" +Url);
		
		if(Url!=null){
			return Url;
		}else{
			System.out.println("getting Null title......");
			return null;
		}
	}
	public void closeBrowser(){
		if(driver!=null){
			driver.close();
			System.out.println("Browser is closed");
		}
	}
	
	public void quitBrowser(){
		if(driver!=null){
			driver.quit();
			System.out.println("Browser us closed");
		}
	}
	
}
