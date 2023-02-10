package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountsPageTest extends BaseClass{
	
	@BeforeClass
	public void acctPageSetup() throws InterruptedException {
		loginPage.doLogin(prop.getProperty("FreeCRMun"), prop.getProperty("FreeCRMpwd"));
		Thread.sleep(5000);
	}
	
	@Test
	public void getMenuSize() {
	System.out.println(accountsPage.getleftmenuItems());
	}
	
//	@Test(priority=1)
//	public void clickOnBoxesTest() throws InterruptedException {
//		Thread.sleep(2000);
//		accountsPage.logout();
//		
//	}
//	@Test(priority=2)
//	public void clickOnAlertsTest() throws InterruptedException {
//		Thread.sleep(2000);
//		accountsPage.logout();
//		
//	}
//	
//	@Test(priority=3)
//	public void logoutTest() throws InterruptedException {
//		Thread.sleep(2000);
//		accountsPage.logout();
//		
//	}

}
