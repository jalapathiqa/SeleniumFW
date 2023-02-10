package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPageTest extends BaseClass {
	@Test(priority=2)
	public void loginPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		String actualTitle =loginPage.getLoginPageTitle();
		System.out.println("Page title:"+actualTitle);
		
		Assert.assertEquals(actualTitle, util.Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test(priority=3, enabled = false)
	public void loginPageUrlTest() throws InterruptedException {
		
		Thread.sleep(2000);
		String actualUrl =loginPage.loginPageUrl();
		System.out.println("Page title:"+actualUrl);
		
		Assert.assertTrue(actualUrl.contains(util.Constants.LOGIN_PAGE_URL));
		
	}
	@Test(priority=1)
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.doLogin("jpreddy911", "Test12345");

	}

}
