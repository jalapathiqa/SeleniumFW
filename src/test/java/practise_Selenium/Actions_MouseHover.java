package practise_Selenium;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

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

public class Actions_MouseHover {
	
	/**
	 * Actions mousehover
	 * click
	 * double click
	 * right click
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().setSize(new Dimension(1000, 1000));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.orangehrm.com/");
		
		Actions actions = new Actions(driver);
		actions
		.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Platform']")))
		.moveToElement(driver.findElement(By.xpath("//body/nav[@class='navbar navbar-expand-lg navbar-light fixed-top']/div[@class='container-fluid']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav me-auto mb-2 mb-lg-0 web-menu']/li[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")))
		.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link-hed'][normalize-space()='Resources']")))
		.perform();
		
		
		driver.findElement(By.xpath("//li[@class='sub-menu-title menu-title-row pt-2 "
				+ "pb-2']//a[normalize-space()='Blog']")).click();
		actions.doubleClick(driver.findElement(By.xpath("//h4[contains(text(),'Power Your HR Goals for 2023 with OrangeHRM’s Vers')]"))).perform();
		
		
		
		
			
		
	}

}
