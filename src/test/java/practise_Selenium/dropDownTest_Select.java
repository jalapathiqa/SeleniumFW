package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.dropDownUtils;

public class dropDownTest_Select {
	WebDriver driver;
	
	@Test
	public void test1() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	options.addArguments("start-maximized");
	driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com/r.php");
		
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	dropDownUtils dropList = new dropDownUtils();
	dropList.getDropDownValues(month);
	driver.quit();
	}
}
