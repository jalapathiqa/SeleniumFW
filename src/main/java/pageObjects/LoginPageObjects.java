package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ElementUtil;

public class LoginPageObjects {
	//1. declate private driver
	private WebDriver driver;
	private ElementUtil eleUtils;
	
	//2. page constructor
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		eleUtils = new ElementUtil(driver);
	}
	
	//3. By locators
	private By userName = By.name("username");
	private By password = By.name("password");
	private By login = By.xpath("//input[@value='Login']");
	private By CRMImage = By.xpath("//img[@src='https://classic.freecrm.com/img/logo.png']");
	
	private By user = By.xpath("//body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]");
	
	
	
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String loginPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public boolean isCRMLogoDisplayed() {
//		return driver.findElement(CRMImage).isDisplayed();
		return eleUtils.doIsDisplayed(CRMImage);
	}
	
	public void doLogin(String uname, String pword) throws InterruptedException {
		Thread.sleep(2000);
//		driver.findElement(userName).sendKeys(uname);
//		driver.findElement(password).sendKeys(pword);
//		driver.findElement(login).click();
		
		
//		eleUtils.waitForElementPresntUsingFluentWait(userName, 10, 2);
		eleUtils.doSendKeys(userName, uname);
		eleUtils.doSendKeys(password, pword);
		eleUtils.doClick(login);

	}
	
	public String getAccountName() {
		return driver.findElement(user).getText();
		
	}

	
	
	
	
	

}
