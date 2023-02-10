package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewContactObjects {
	private WebDriver driver;

	public NewContactObjects(WebDriver driver) {
		this.driver = driver;
	}

	private By newContact = By.xpath(
			"//div[@class='d-none d-lg-block sidebar']//a[@class='btn btn-default btn-sm btn-block'][normalize-space()='New Contact...']");

	@FindBy(name = "firstname")
	private WebElement firstName1;
	
	private By firstName = By.name("firstname");
	private By lastName = By.id("inputLastName");
	private By companyName = By.name("companyname");
	private By email = By.id("inputEmail");
	private By address1 = By.id("inputAddress1");
	private By address2 = By.id("inputAddress2");
	private By city = By.id("inputCity");
	private By state = By.name("state");
	private By postalCode = By.id("postcode");

	private By contryCode = By.xpath("//input[@id='populatedCountryCodephonenumber']");
	private By contryName = By.xpath("//select[@id='country']");
	
	
	public WebElement countryNameList() {
		WebElement listOfContries = driver.findElement(contryCode);
		Select countryDropDown = new Select(listOfContries);
		List<WebElement> contries = countryDropDown.getOptions();
		
		for (WebElement countryList : contries) {
			System.out.println(countryList.getText());
		}
		return listOfContries;
		
		
	}
	
	public void CountryCodeList() {
		
		WebElement codeList = driver.findElement(contryCode);
		Select codeDropDown = new Select(codeList);
		List<WebElement> codes = codeDropDown.getOptions();
		for (WebElement listOfCodes : codes) {
			System.out.println(listOfCodes.getText());
		}
	}
	
	public void clickOnNewContact() {
		driver.findElement(newContact).click();
	}
	
	public void enterFirstName() {
		driver.findElement(firstName).sendKeys("jp");
	}
	
	public void enterLastName() {
		driver.findElement(lastName).sendKeys("reddy");
	}
	public void entercompanyName() {
		driver.findElement(companyName).sendKeys("Ridha");
	}
	

}
