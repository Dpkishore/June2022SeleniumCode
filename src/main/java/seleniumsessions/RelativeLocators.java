package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");

		WebElement ele = driver.findElement(By.linkText("Cranbrook, Canada"));

		String RightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();

		System.out.println(RightIndex);

		String LeftIndex = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();

		System.out.println(LeftIndex);

		String Belowele = driver.findElement(with(By.tagName("p")).below(ele)).getText();

		System.out.println(Belowele);
		
		String Aboveele = driver.findElement(with(By.tagName("p")).above(ele)).getText();

		System.out.println(Aboveele);
		
		String nearele = driver.findElement(with(By.tagName("p")).near(ele)).getAttribute("class");

		System.out.println(nearele);
	}

}
