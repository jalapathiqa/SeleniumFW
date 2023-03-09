package practise_Selenium;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_MouseHover2 {
	
	/**
	 * MoveToElement or MouseHover
	 * click
	 * double click
	 * right click or context Click
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions actions = new Actions(driver);
		actions
		.contextClick(driver.findElement(By.xpath("//span[.='right click me']")))
		.perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[.='Copy']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alerttxt =  alert.getText();
		System.out.println("alerttxt: "+alerttxt);
		alert.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
			
		
	}

}
