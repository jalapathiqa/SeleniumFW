package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ScreenShot;

public class Actions_Events {
	WebDriver driver;
	ScreenShot takeScreenshot = new ScreenShot();

	@Test
	public void Alert() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://app.hubspot.com/login");

		WebElement un=	driver.findElement(By.id("username"));
		WebElement pwd=driver.findElement(By.id("password"));
		WebElement login=driver.findElement(By.id("loginBtn"));
		takeScreenshot.takeElementScreenShot(un, "pwd");
		takeScreenshot.takeElementScreenShot(un, "UserName");
		takeScreenshot.takeElementScreenShot(un, "login");

		Actions action = new Actions(driver);
		action.sendKeys(un, "jpreddy911@gmail.com")
		.sendKeys(pwd, "TestING@12345")
		.click(login)
		.perform();
		takeScreenshot.takePageScreenShot(driver, "Actions_Events");
		Thread.sleep(2000);

		driver.quit();
	}

}
