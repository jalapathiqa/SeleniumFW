package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import util.ElementUtil;
import util.JavaScriptUtil;

public class LoginPageObjectsCogmento {
	// 1. declate private driver
	private WebDriver driver;
	private ElementUtil eleUtils;
	private JavaScriptUtil jsUtils;

	// 2. page constructor
	public LoginPageObjectsCogmento(WebDriver driver) {
		this.driver = driver;
		eleUtils = new ElementUtil(driver);
		jsUtils = new JavaScriptUtil(driver);
	}

	// 3. By locators
	private By userName = By.xpath("//input[@placeholder='Email']");
	private By password = By.xpath("//input[@placeholder='Password']");
	private By login = By.xpath("//div[@class='ui fluid large blue submit button']");
	private By homeIcon = By.xpath("//i[@class='home icon']");
//	private By calendarIcon = By.xpath("//i[@class='calendar icon']");
	private By calender = By.xpath("//span[contains(text(),'Calendar')]");
	private By createCalender = By.xpath("//button[normalize-space()='Create']");
	private By acctName = By.xpath("//b[normalize-space()='Ridha']");
	private By newContact = By.xpath("//button[normalize-space()='Create']");
	private By indexXpathJP = By.xpath("//div[@class='vertical-timeline vertical-timeline--animate vertical-timeline--one-column-left']//div[1]//div[1]//div[2]//div[2]//div[1]//span[1]//a[1]");
	private By editContact = By.xpath("//button[@class='ui icon button']//i[@class='edit icon']");


	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public String loginPageUrl() {
		return driver.getCurrentUrl();
	}

	public void doLogin(String uname, String pword) throws InterruptedException {
		Thread.sleep(1000);

		eleUtils.doSendKeys(userName, uname);
		eleUtils.doSendKeys(password, pword);
		eleUtils.doClick(login);

	}

	public String getAccountName() {
		return driver.findElement(acctName).getText();

	}
	public void clickOnCalendarIcon() throws InterruptedException {
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(homeIcon)).perform();
		eleUtils.doClick(calender);
		eleUtils.waitForElementsToBeVisible(createCalender, 10);
		eleUtils.doClick(createCalender);
	}
	public void clickOnNewContact() {
		eleUtils.doClick(newContact);
	}
	public void clickOnFirstContact() throws InterruptedException {
		eleUtils.waitForElementToBeVisibleWithWebElement(indexXpathJP, 10, 2);
//		eleUtils.doClick(indexXpathJP);
		jsUtils.clickElementByJS(driver.findElement(indexXpathJP));
		Thread.sleep(2000);
		eleUtils.doClick(editContact);
	}

}
