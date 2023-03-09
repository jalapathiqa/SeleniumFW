package practise_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDowns_Select {
	WebDriver driver;
	
	@Test
	public void handleDropDowns() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/r.php");
		
//		driver.findElement(By.name("firstname")).sendKeys("jp");
//		Thread.sleep(1000);
//		driver.findElement(By.name("lastname")).sendKeys("reddy");
//		Thread.sleep(1000);
//		driver.findElement(By.name("reg_email__")).sendKeys("jpreddy911@gmail.com");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

//		// MONTHS
//		Select monthList = new Select(month);
//		List<WebElement> months = monthList.getOptions();
//
//		for (WebElement monthNames : months) {
//			System.out.println("list of months:.."+monthNames.getText());
//		}
//		monthList.selectByVisibleText("Aug");
//		Thread.sleep(2000);
//		// DAY
//		Select dayList = new Select(day);
//		List<WebElement> days = dayList.getOptions();
//
//		for (WebElement dayNames : days) {
//			System.out.println("list of Days:.."+dayNames.getText());
//		}
//		dayList.selectByVisibleText("15");
//		Thread.sleep(2000);
//
//		// YEAR
//		Select yearList = new Select(year);
//		List<WebElement> years = yearList.getOptions();
//
//		for (WebElement yearNo : years) {
//			System.out.println("list of Years:.."+yearNo.getText());
//		}
//		yearList.selectByVisibleText("1947");
		Thread.sleep(2000);

		selectValueFromDropDownByIndex(day, 1);
		selectValueFromDropDownByIndex(month, 1);
		selectValueFromDropDownByIndex(year, 1);
		getDropDownValues(day);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	/**
	 * This method is used to select the value by Visible text
	 * @param ele
	 * @param value
	 */
	public static void selectValueFromDropDownByText(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByVisibleText(value);
		
	}
	/**
	 * This method is used to select the value by Index value
	 * @param ele
	 * @param index
	 */
	public static void selectValueFromDropDownByIndex(WebElement ele, int index) {
		Select select = new Select(ele);
		select.selectByIndex(index);
		
	}
	/**
	 * This method is used to get dropdown values
	 * @param ele
	 */
	public static void getDropDownValues(WebElement ele) {
		Select select = new Select(ele);

		List<WebElement> values = select.getOptions();
		System.out.println("Total no. of values in dropdown: "+values.size());
		
		for (WebElement dropDownList : values) {
			System.out.println("new list of years: "+dropDownList.getText());
		}
		
	}
	
	
	
	
}
