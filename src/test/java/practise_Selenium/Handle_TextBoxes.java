package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_TextBoxes {
public static void main(String[] args) throws InterruptedException {
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.name("login"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.cssSelector("input[name='commit']"));
		
		
		
		highlight(driver, loginBtn);
		
		if (userName.isDisplayed()) {
			highlight(driver, userName);
			if (userName.isEnabled()) {
						
			userName.sendKeys("jalapathi");
			String enteredText=userName.getAttribute("value");
			System.out.println(enteredText);
			Thread.sleep(2000);
			userName.clear();
			Thread.sleep(2000);

		}
			else
			{
				System.err.println("username field is not enabled");
			}
			
		}
		else
			System.err.println("username field is not displayed");
		
		driver.close();
		driver.quit();
		
	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		
	}

}
