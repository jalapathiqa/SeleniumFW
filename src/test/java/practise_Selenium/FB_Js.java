package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.JavaScriptUtil;

public class FB_Js {
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver ;	

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		jsUtil.flash(un);
		jsUtil.drawBorder(un);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jpreddy911@gmail.com");
		Thread.sleep(1000);

		
		Thread.sleep(5000);
		driver.quit();

	}

}

