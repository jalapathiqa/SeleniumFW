package tests;

import org.testng.annotations.Test;

public class CreateNewContactTest extends BaseClass {

//	@BeforeClass
//	public void 
	
	@Test
	public void createNewContacts() throws InterruptedException {
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(2000);
		newContacts.clickOnNewContact();
		Thread.sleep(2000);

		newContacts.enterFirstName();
		Thread.sleep(2000);

		newContacts.enterLastName();
		Thread.sleep(2000);

		newContacts.entercompanyName();
		Thread.sleep(2000);

	}

}
