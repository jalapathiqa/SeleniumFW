package practise_Selenium;

import org.testng.annotations.Test;

public class AmazonTest {
	@Test
	public void amazonUrlTest() {
		
	
	BrowserUtils util = new BrowserUtils();
	util.launchBrowser("chrome");
	
	util.enterUrl("https://www.amazon.ca");
	String title = util.getAppCurrentUrl();
	System.out.println("App current title: ..."+title);
	
	if(title.contains("amazon")) {
		System.out.println("correct title");
	}
	String currentUrl = util.getAppCurrentUrl();
	System.out.println(currentUrl);
	
	util.closeBrowser();
	util.quitBrowser();
	
	}
}
