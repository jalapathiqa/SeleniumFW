package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
	
	public static void main(String[] args) throws InterruptedException {
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.className("header-logo")));
		highlight(driver, driver.findElement(By.name("login")));
		highlight(driver, driver.findElement(By.name("password")));
		highlight(driver, driver.findElement(By.cssSelector("input[name='commit']")));
		highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		highlight(driver, driver.findElement(By.partialLinkText("Create an")));
		
		highlight(driver, driver.findElement(By.tagName("h1")));

	}
	
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		
	}

}
