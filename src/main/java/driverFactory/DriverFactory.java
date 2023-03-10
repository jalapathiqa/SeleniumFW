package driverFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
		String AppUrlWaits = prop.getProperty("waits");
		String fbUrl = prop.getProperty("fbURL");
		

		highlight = prop.getProperty("highlight");
		optionsManager = new OptionsManager(prop);

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
//			ChromeOptions options = new ChromeOptions();
//			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
//			options.addArguments("start-maximized");
//			options.addArguments("--headless");
//			options.addArguments("--incognito");
			if(Boolean.parseBoolean((prop.getProperty(("remote"))))){
				// remote code
				init_remoteDriver("chrome");
			} else {
			threadedDriver.set(new ChromeDriver(optionsManager.getChromeOptions()));
			}

		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			if(Boolean.parseBoolean((prop.getProperty(("remote"))))){
				// remote code
				init_remoteDriver("firefox");
			} else {
//			FirefoxOptions fireFoxOptions = new FirefoxOptions();
//			fireFoxOptions.setCapability("ExcludeSwitches", new String[] { "enable-automation" });
			threadedDriver.set(new FirefoxDriver(optionsManager.getFirefoxOptions()));
			}
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
//			edgeOptions.setExperimentalOption("useAutomationExtension", false);
//			edgeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//			edgeOptions.addArguments("start-maximized");
			threadedDriver.set(new EdgeDriver(edgeOptions));
		}
		getDriver().manage().deleteAllCookies();
//		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofMinutes(20));
//		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		getDriver().manage().window().setSize(new org.openqa.selenium.Dimension(1000, 1000));
//		getDriver().get("https://classic.crmpro.com/index.html?e=1");
		getDriver().get(fbUrl);
//		String pageTitle = driver.getTitle();
//		System.out.println("page title: " + pageTitle);

		Thread.sleep(3000);

		return getDriver();

	}

	private void init_remoteDriver(String browser) {
		System.out.println("Running test on remote grid server: " + browser);
		if(browser.equalsIgnoreCase(("chrome"))){
			WebDriverManager.chromedriver().setup();
			ChromeOptions op = new ChromeOptions();
			try {
				threadedDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), op));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		else if(browser.equalsIgnoreCase(("firefox"))){
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions op = new FirefoxOptions();
			try {
				threadedDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), op));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		else if(browser.equalsIgnoreCase(("edge"))){
			WebDriverManager.edgedriver().setup();
			EdgeOptions op = new EdgeOptions();
			try {
				threadedDriver.set(new RemoteWebDriver(new URL(prop.getProperty("huburl")), op));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		
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
		} else {
			System.out.println("Running on environment: " + envName);
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
			} catch (FileNotFoundException e) {
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

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./SeleniumHF/Screenshots_Pass/" + System.currentTimeMillis() + ".png");

		try {
			FileUtils.copyDirectory(srcFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return getScreenshot();
	}

}