package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.GenericUtils;
import util.ScreenShot;

public class wait_HubSpot_Using_Util {
	WebDriver driver;
	ScreenShot takeScreenshot = new ScreenShot();
	GenericUtils util = new GenericUtils(driver);

	@Test
	public void hubSpot_login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
	options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
//		driver.manage().window().setSize(new Dimension(1000, 1000));
	
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		By addText1 = By.id("btn1");
		By textBox1 = By.id("txt1");
	
		By addText2 = By.id("btn2");
		By textBox2 = By.id("txt2");
		
		util.waitForElementToBePresent(addText1,20);
		driver.findElement(textBox1).click();
		util.doSendKeys(textBox1, "Jp");
		
		util.waitForElementToBePresent(addText2, 20);
		driver.findElement(textBox2).click();
		util.doSendKeys(textBox2, "Reddy");
		
		ScreenShot ts = new ScreenShot();
		ts.takePageScreenShot(driver, "waits");
		driver.quit();
		
		

	}
	
	
	
	
}
