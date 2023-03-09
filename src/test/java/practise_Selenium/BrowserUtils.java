package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	public WebDriver driver;
	
	/**
	 * This method is used to launch the browser on the basis of given browser name
	 * @param browser
	 * @return this will return the driver
	 */
	public WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
			WebDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//			driver.manage().window().setSize(new Dimension(1000, 1000));
		}
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
//			options.addArguments("start-maximized");
			WebDriver driver = new FirefoxDriver(options);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
			driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
//			driver.manage().window().setSize(new Dimension(1000, 1000));
		}
		else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("Please pass the correct browser...."+browser);
		}
		return driver;
		
	}
	
	public void enterUrl(String url){
		if(url==null) {
			System.out.println("url is null...");
			return;
		}
		if(url.indexOf("http")==-1) {
			System.out.println("Http is missing in the url...");
			return;
		}
		driver.get(url);
	}
	
	public String getAppCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
