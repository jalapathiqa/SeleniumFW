package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ElementUtil;

public class AccountPageObject {
	private WebDriver driver;
	private ElementUtil eleUtil;

	public AccountPageObject(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	private By logout = By.xpath("//tbody/tr/td[4]/a[1]");
	private By boxes = By.xpath("//a[normalize-space()='Add Boxes»']");
	private By alerts = By.xpath("//a[normalize-space()='Alerts']");
	private By leftMenuContainer = By.xpath("//td[@class='noprint']");


	public int getleftmenuItems() {
		return eleUtil.getElements(leftMenuContainer).size();
	}
	
	public void clickOnBoxes() {
		eleUtil.doClick(boxes);
	}
	
	public void clickOnAlerts() {
		eleUtil.doClick(alerts);
	}
	

	public boolean isLogoutExist() {
		return eleUtil.doIsDisplayed(logout);
	}
	
	public void logout() {
		if(isLogoutExist()) {
			eleUtil.doClick(logout);
		}
	}

}
