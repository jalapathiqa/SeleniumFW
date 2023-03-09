package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.qameta.allure.Step;

public class FaceBookLogin_PageObjects {

	private WebDriver driver;
	
	public FaceBookLogin_PageObjects(WebDriver driver) {
		this.driver = driver;
	}

	// define user name
	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	private WebElement email;

	// define password
	@FindBy(how = How.XPATH, using = "//input[@id='pass']")
	private WebElement passWord;

	// submit button
	@FindBy(how = How.XPATH, using = "//button[@name='login']") 
	private WebElement loginBtn;

	@Step("login to FB using excel credentials")
	public void loginToFB(String uName, String pWord) {

		email.sendKeys(uName);
		passWord.sendKeys(pWord);
		loginBtn.click();

	}
}
