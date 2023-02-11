package driverFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis = null;
	public static String highlight;
	public OptionsManager optionsManager;
	public static ThreadLocal<WebDriver> threadedDriver = new ThreadLocal<WebDriver>();

	/**
	 * this is used to initialize the webdriver
	 * 
	 * @param browser
	 * @param url
	 * @return
	 * @throws InterruptedException
	 */

	public WebDriver init_driver(Properties prop) throws InterruptedException {

		String browserName = prop.getProperty("browser");
		String AppUrl = prop.getProperty("FreeCRMurl");
		highlight = prop.getProperty("highlight");
		optionsManager = new OptionsManager(prop);

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
//			options.addArguments("start-maximized");
//			options.addArguments("--headless");
//			options.addArguments("--incognito");
			threadedDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fireFoxOptions = new FirefoxOptions();
			fireFoxOptions.setCapability("ExcludeSwitches", new String[] { "enable-automation" });
			threadedDriver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setExperimentalOption("useAutomationExtension", false);
			edgeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			edgeOptions.addArguments("start-maximized");
			threadedDriver.set(new EdgeDriver(edgeOptions));
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMinutes(20));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().manage().window().setSize(new org.openqa.selenium.Dimension(1000, 1000));
//		getDriver().get("https://classic.crmpro.com/index.html?e=1");
		getDriver().get(AppUrl);
//		String pageTitle = driver.getTitle();
//		System.out.println("page title: " + pageTitle);

		Thread.sleep(3000);

		return getDriver();

	}

	public static synchronized WebDriver getDriver() {
		return threadedDriver.get();
	}

	/**
	 * this is used to initialize the properties
	 * 
	 * @return
	 */
	public Properties init_prop() {
		prop = new Properties();
		String envName = System.getProperty("env"); // dev/qa/uat/stage/prod
		if (envName == null) {
			System.out.println("Running in my local environment: ");
			try {
				fis = new FileInputStream(new File("./src/test/resources/config/config.properties.txt"));
				prop.load(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Running on environment: "+envName);
			try {
			switch (envName) {
			case "dev":
				fis = new FileInputStream(new File("./src/test/resources/config/dev.config.properties.txt"));
				break;
			case "qa":
				fis = new FileInputStream(new File("./src/test/resources/config/qa.config.properties.txt"));
				break;
			default:
				System.out.println("Please pass the correct environment....");
				break;
			}
			}
			catch(FileNotFoundException e){
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop;

	}
	
	public String getScreenshot() {
	
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./SeleniumHF/Screenshots_Pass/"+System.currentTimeMillis()+".png");
	
	try {
		FileUtils.copyDirectory(srcFile, destFile);
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	return getScreenshot();
	}
	
	
	
}