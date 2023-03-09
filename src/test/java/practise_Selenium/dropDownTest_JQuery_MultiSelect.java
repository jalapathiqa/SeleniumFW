package practise_Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.GenericUtils;

public class dropDownTest_JQuery_MultiSelect {
	WebDriver driver;
	GenericUtils utils = new GenericUtils(driver);
	
	@Test
	public void test1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	options.addArguments("start-maximized");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
	driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();

//	multiSelect(driver, "choice 1", "choice 4", "choice 6 2 2", "choice 7");
//	multiSelect(driver, "choice 4");
//	multiSelect(driver, "choice 6 2 2");
//	multiSelect(driver, "choice 7");
	Thread.sleep(5000);

	By choiceList = By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']");
//	multiSelect(driver, choiceList, "choice 2", "choice 5", "choice 6");
	utils.selectAll(driver, choiceList, "All");
	
	
	Thread.sleep(5000);
	driver.quit();
	
	}
	
	public void singleSelect(WebDriver driver, String...value) {
		List<WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
		for (WebElement choice1 : choiceList) {
			System.out.println(choice1.getText());
			for (int i=0; i<value.length; i++) {
				if(choice1.getText().equals(value[i])) {
					choice1.click();
					break;
				}
			}
			
		}
	}
	
	public void multiSelect(WebDriver driver,By locator, String...value) {
		List<WebElement> element = driver.findElements(locator);
		for (WebElement choice1 : element) {
			System.out.println(choice1.getText());
			for (int i=0; i<value.length; i++) {
				if(choice1.getText().equals(value[i])) {
					choice1.click();
					break;
				}
			}
			
		}
	}
}
