package util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropDownUtils {
	
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
	
	/**
	 * This method is will give ArrayList dropdown values 
	 * @param ele
	 * @return 
	 */
	public static ArrayList<String> getDropDownValues(WebElement ele, String value) {
		Select select = new Select(ele);

		List<WebElement> values = select.getOptions();
		ArrayList<String> ar = new ArrayList<String>();
		for (WebElement dropDownList : values) {
//			System.out.println("new list of years: "+dropDownList.getText());
		String dropDownValues =	dropDownList.getText();
		ar.add(dropDownValues);
		}
		return ar;
		
	}
	
	/**
	 * this method is used to get dropdown values without Select tag
	 */
	public static void selectDropDownValuesWithoutSelect(WebDriver driver, String locator, String value) {
		List<WebElement> dropDownList = driver.findElements(By.xpath(locator));
//		System.out.println(dropDownList.size());
		for (WebElement dropList : dropDownList) {
			String list = dropList.getText();
			if(list.equals(value)) {
				dropList.click();
				break;
			}
		}	
	}
	

}
