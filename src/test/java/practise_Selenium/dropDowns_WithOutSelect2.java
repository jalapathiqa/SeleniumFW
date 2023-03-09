package practise_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.dropDownUtils;

public class dropDowns_WithOutSelect2 {
	WebDriver driver;
	
	@Test
	public void handleDropDowns() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://www.facebook.com/r.php");
		
		List<WebElement> months=	driver.findElements(By.xpath("//select[@id='month']/option"));
		dropDownUtils dlist = new dropDownUtils();
		dlist.selectDropDownValuesWithoutSelect(driver, "months", "Apr");

		for (WebElement webElement : months) {
		String print=	webElement.getText();
		}
		String monthlists = dlist.toString();
		System.out.println(monthlists);
		
		Thread.sleep(3000);
	
	driver.quit();
		
		
	}
	
	
	
	
}
