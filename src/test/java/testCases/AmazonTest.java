package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	/*WebDriver driver;
	@BeforeTest
	public void setup(){
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
	}*/
	
	
	
	
	@Test(priority=1)
	public void searchTest(){
		boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		System.out.println(flag);
		Assert.assertEquals(flag, true);
	}
	@Test(priority=3)
	public void pageTitleTest(){
		String title=driver.getTitle();
		System.out.println("page Title :"+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	@Test(priority=2)
	public void logoTest(){
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	

}
