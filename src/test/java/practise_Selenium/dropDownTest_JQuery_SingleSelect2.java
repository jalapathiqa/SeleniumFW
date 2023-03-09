package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.GenericUtils;

public class dropDownTest_JQuery_SingleSelect2 {
	WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
	options.addArguments("start-maximized");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
	driver.findElement(By.xpath("//input[@id='justAnotherInputBox']")).click();
//	List<WebElement> choiceList = driver.findElements(By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']"));
//	for (WebElement choice1 : choiceList) {
//		System.out.println(choice1.getText());
//		if(choice1.getText().equals("choice 5")) {
//			choice1.click();
//			break;
//		}
//	}
	By selectSingleChoice = By.xpath("//div[@class='comboTreeDropDownContainer']//ul//li//span[@class='comboTreeItemTitle']");
	GenericUtils utils = new GenericUtils(driver);
	utils.singleSelect(driver, selectSingleChoice, "choice 6");
	Thread.sleep(5000);


	driver.quit();
	
	}
}
