package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class loginPageTest_ElementUtil extends BaseClass {
	
	@Test(priority=2)
	public void loginPageTitleTest() throws InterruptedException {
		Thread.sleep(2000);
		String actualTitle =loginPage.getLoginPageTitle();
		System.out.println("Page title:"+actualTitle);
		
		Assert.assertEquals(actualTitle, util.Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test(priority=3)
	public void loginPageUrlTest() throws InterruptedException {
		
		Thread.sleep(2000);
		String actualUrl =loginPage.loginPageUrl().trim();
		System.out.println("Page url:"+actualUrl);
		
//		Assert.assertTrue(actualUrl.contains(util.Constants.LOGIN_PAGE_URL));
		
	}
	@Test(priority=1)
	public void login() throws InterruptedException {
		Thread.sleep(2000);
//		loginPage.doLogin(prop.getProperty("FreeCRMun").trim(), prop.getProperty("FreeCRMpwd").trim());
		loginPage.doLogin(prop.getProperty("FreeCRMun"), prop.getProperty("FreeCRMpwd"));

	}
	@Test(priority=4, enabled = false)
	public void getAccountName() {
		String actName = loginPage.getAccountName();
		System.out.println("Account Name: "+actName);
		Assert.assertEquals(actName, "jp reddy");
	}

}
