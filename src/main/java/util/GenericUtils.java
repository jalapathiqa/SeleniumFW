package util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericUtils {

	WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("some exception occurred while creating the webelement...");
			System.out.println(e.getMessage());
		}
		return element;
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void waitForElementToBeClickable(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void waitForElementToBePresent(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	// sendkeys method
	public void sendKeys(WebElement element, int timeOut, String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);;
	}

	// clickable method declared explicitly with WebElement
	public void clickOn(WebElement element, int timeOut) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	// clickable method declared explicitly with Locator:
	public  void clickElementWhenReady(By locator, int timeOut) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	public void clickElementWhenReady(By locator, int timeOut, long intervalTime) {
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeOut),Duration.ofMillis(intervalTime));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	

	public void waitForTitleToBePresent(String title, Duration timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	public void waitForFrameToLoad(String name, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(name));
	}
	
	/**
	 * this is used select single value, like single Check each time
	 * @param driver
	 * @param value
	 */
	public void singleSelect(WebDriver driver,By locator, String... value) {
		List<WebElement> element = driver.findElements(locator);
		for (WebElement select : element) {
			System.out.println(select.getText());
				if(select.getText().equals(value)) {
					select.click();
					break;
				}
			}
			
		}
	

	/**
	 * this is used to select multiple values, like check boxes
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public void multiSelect(WebDriver driver, By locator, String... value) {
		List<WebElement> element = driver.findElements(locator);
		for (WebElement choice1 : element) {
			System.out.println(choice1.getText());
			for (int i = 0; i < value.length; i++) {
				if (choice1.getText().equals(value[i])) {
					choice1.click();
					break;
				}
			}
		}
	}

	/**
	 * this is used to select ALL values, like all the check boxes
	 * 
	 * @param driver
	 * @param locator
	 * @param value
	 */
	public void selectAll(WebDriver driver, By locator, String... value) {
		List<WebElement> element = driver.findElements(locator);
		if (!value[0].equalsIgnoreCase("All")) {
			for (WebElement select : element) {
				System.out.println(select.getText());
				for (int i = 0; i < value.length; i++) {
					if (select.getText().equals(value[i])) {
						select.click();
						break;
					}
				}
			}
		}
		// select all the values
		else {
			try {
				for (int all = 0; all < element.size(); all++) {
					element.get(all).click();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	public String getAlertText(int timeOut) {
		return waitForAlert(timeOut).getText();
	}
	
	public void doAlertAccept(int timeOut) {
		waitForAlert(timeOut).accept();
	}
	
	public void doAlertDismiss(int timeOut) {
		waitForAlert(timeOut).dismiss();;
	}
	public void enterAlertText(String text ,int timeOut) {
		waitForAlert(timeOut).sendKeys(text);
	}
}
