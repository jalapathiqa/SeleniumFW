package practise_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenChromeBrowser {
	WebDriver driver;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@Test(priority = 1)
	public void initChromeBrowser() throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalag\\OneDrive\\Desktop\\Library\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.ca/");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		options.addArguments("start-maximized");
//		options.setExperimentalOption("ExcludeSwitches", new String [] {"enable-automation"});

		// Headless:
//		options.addArguments("headless");

		driver = new ChromeDriver(options);

		driver.get("https://www.google.ca/");
//		
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions options1 = new EdgeOptions();
//		options.addArguments("start-maximized");
//		
//		WebDriver driver1 = new EdgeDriver(options1);	
//		driver1.get("https://eenadu.net");

		String title = driver.getTitle();
		System.out.println("Title in chrome is: " + title);

		// validation
		if (title.equals("Google")) {
			System.out.println("PASS -- correct title-CHROME");
		} else {
			System.out.println("FAIL -- incorrect title-CHROME");

		}
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void chromeSecondMethod() {
		System.out.println("secong method in testNG.xml for Chrome browser method");
	}

	@AfterSuite
	public void afterSuite() {
		driver.close();
		driver.quit();
		System.out.println("After Suite");
	}

}
