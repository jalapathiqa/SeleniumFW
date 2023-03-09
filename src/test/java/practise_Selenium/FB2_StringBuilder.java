package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.JavaScriptUtil;

public class FB2_StringBuilder {
	public WebDriver driver;
	
	JavaScriptUtil jsUtil = new JavaScriptUtil(driver);

	@Test(priority = 1, enabled = true)
	public void launch() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");

		Thread.sleep(3000);
		

	}
	
	@Test(priority = 2, enabled = true)
	public void Login() throws InterruptedException {
//		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
//		jsUtil.drawBorder(un);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jpreddy911@gmail.com");
		Thread.sleep(1000);
//		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
//		jsUtil.drawBorder(pwd);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Selenium@1423");
		Thread.sleep(1000);

		WebElement ele=	driver.findElement(By.name("login"));

		
//		jsUtil.generateAlert("Login to FB is successfully completed");
//		jsUtil.drawBorder(ele);
		driver.findElement(By.name("login")).click();

		
		Thread.sleep(5000);
		driver.quit();

	}

}
