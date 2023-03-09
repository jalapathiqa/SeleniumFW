package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.GenericUtils;
import util.ScreenShot;

public class FB_LoginUsingUtil {
	WebDriver driver;
//	GenericUtils util;
	ScreenShot ts = new ScreenShot();

	@Test(priority = 1, enabled = true)
	public void launch() throws InterruptedException {
		GenericUtils util = new GenericUtils(driver);
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);

		By email = By.id("email");
		By pwd = By.id("pass");
		By login = By.name("login");

		util.getElement(email).sendKeys("jpreddy911@gmail.com");
		Thread.sleep(3000);
		util.getElement(pwd).sendKeys("Selenium@1423");
		Thread.sleep(3000);
		util.getElement(login).click();
		Thread.sleep(3000);
		
		ts.takePageScreenShot(driver, "FB");
		driver.quit();

	}

}
