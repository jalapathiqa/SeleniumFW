package practise_Selenium;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	static WebDriver driver;

	@Test
public void InitBrowsers() throws InterruptedException {
		String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fireFoxOptions = new FirefoxOptions();
			fireFoxOptions.setCapability("ExcludeSwitches", new String[] { "enable-automation" });
//			fireFoxOptions.addArguments("start-maximized");

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setExperimentalOption("useAutomationExtension", false);
			edgeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			edgeOptions.addArguments("start-maximized");
			driver = new EdgeDriver(edgeOptions);

		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://eenadu.net");
		String pageTitle = driver.getTitle();
		System.out.println("page title: " + pageTitle);

		Thread.sleep(3000);

		driver.quit();
	}

}
