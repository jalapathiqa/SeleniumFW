package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable_Handling {
	WebDriver driver;

	@Test
	public void test1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
//		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size()-1;
		System.out.println(rowCount);
		
//		By alfred = By.xpath("//*[@id='customers']/tbody/tr[2]/td[1]");
//
//		WebElement ele = driver.findElement(alfred);
//		Actions act = new Actions(driver);
//		act.doubleClick(ele).perform();
		
		String firstXpath = "//*[@id='customers']/tbody/tr[";
		String lastXpath = "]/td[1]";
		
		for (int rowNum = 2; rowNum <= rowCount+1; rowNum++) {
			String actualXpath = firstXpath + rowNum + lastXpath;
//			System.out.println(actualXpath);
			String value= driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(value);
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
