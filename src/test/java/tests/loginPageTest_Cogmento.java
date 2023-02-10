package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPageTest_Cogmento extends BaseClass {
	
	@Test(priority=1)
	public void login() throws InterruptedException {
		Thread.sleep(2000);
//		loginPage.doLogin(prop.getProperty("FreeCRMun").trim(), prop.getProperty("FreeCRMpwd").trim());
		loginCogmento.doLogin("jpreddy911@gmail.com","Test12345");
		ts.takePageScreenShot(driver, "LoginPage");

	}
	@Test(priority=2)
	public void loginPageTitleTest() throws InterruptedException {
		Thread.sleep(1000);
		String actualTitle =loginCogmento.getLoginPageTitle();
		System.out.println("Page title:"+actualTitle);
		
		Assert.assertEquals(actualTitle, util.Constants.COGMENTO_LOGIN_PAGE_TITLE);
		ts.takePageScreenShot(driver, "Title");

		
	}
	
	@Test(priority=3)
	public void loginPageUrlTest() throws InterruptedException {
		
		Thread.sleep(2000);
		String actualUrl =loginCogmento.loginPageUrl().trim();
		System.out.println("Page url:"+actualUrl);
		
//		Assert.assertTrue(actualUrl.contains(util.Constants.LOGIN_PAGE_URL));
		ts.takePageScreenShot(driver, "URL");

	}
	
	@Test(priority=4, enabled = true)
	public void getAccountName() {
		String actName = loginCogmento.getAccountName();
		System.out.println("Account Name: "+actName);
		Assert.assertEquals(actName, "Ridha");
		ts.takePageScreenShot(driver, "AccountsPage");

	}
	@Test
	public void createUser() throws InterruptedException {
		loginCogmento.clickOnFirstContact();
		Thread.sleep(2000);
		
		
	}
	

}
