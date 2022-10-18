package seleniumsessions;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableTraverse {
	static WebDriver driver;
	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	/*	int rowCount=getrowCount();
		
		//System.out.println("rowCount  ="+rowCount);
		int Colcount=getcolumnCount();
		//System.out.println("Colcount  ="+Colcount);
		
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afetrXpath=	"]/td[1]";
		
		for(int i=2;i<getrowCount()+1;i++){
			String actXpath=beforeXpath + i + afetrXpath;
			//System.out.println(actXpath);
		String Text=driver.findElement(By.xpath(actXpath)).getText();
		System.out.println(Text);
			
		}
		
		System.out.println("----------------");
		String con_beforeXpath="//table[@id='customers']/tbody/tr[";
		String con_afetrXpath=	"]/td[2]";
		
		for(int i=2;i<getrowCount()+1;i++){
			String actXpath=con_beforeXpath + i + con_afetrXpath;
			//System.out.println(actXpath);
		String Text=driver.findElement(By.xpath(actXpath)).getText();
		System.out.println(Text);
		}*/
		
		
	//	getColumndata(1);
	//	getColumndata(2);
	/*ArrayList<String>conValueList=getColumndata(3);
	if(conValueList.contains("Canada")){
		System.out.println("PASS");
	}*/
		getrowValues(7,3);

	}
	
	public static void getrowValues(int rowNum,int colCount){
		for(int j=1;j<=colCount;j++){
			String xpath="//*[@id=\"customers\"]/tbody/tr["+rowNum+"]/td["+j+"]";
			String text=driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);
		}
		
	}
	
	public static ArrayList<String> getColumndata(int colNumber){
		
		System.out.println("----------------");
		
		String beforeXpath="//table[@id='customers']/tbody/tr[";
		String afetrXpath=	"]/td["+colNumber+"]";
		
		ArrayList<String>colValueList=new ArrayList<String>();
		
		for(int i=2;i<getrowCount()+1;i++){
			String actXpath=beforeXpath + i + afetrXpath;
			//System.out.println(actXpath);
		String Text=driver.findElement(By.xpath(actXpath)).getText();
		System.out.println(Text);
		colValueList.add(Text);
		
		
	
		}
		return colValueList;
		
	}
	public static int getcolumnCount(){
		return driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
		
	}
	
	public static int getrowCount(){
		int rows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		//System.out.println(rows);
		
		return rows-1;
	}

}
