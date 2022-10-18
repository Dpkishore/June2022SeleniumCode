package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		String browser="chrome";
		
		
		BrowserUtil brutil=new BrowserUtil();
		brutil.launchBrowser(browser);
		
		brutil.launchUrl("https://www.amazon.com");
		
		
		String Title=brutil.getPageTitle();
		System.out.println(Title);
		
		if(Title.contains("Amazon")){
			System.out.println("Correct -------PASS");
		}else{
			System.out.println("InCorrect -------FAIL");
		}
		
		brutil.getPageUrl();
		brutil.closeBrowser();

	}

}
