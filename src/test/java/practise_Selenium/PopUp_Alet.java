package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp_Alet {
	WebDriver driver;

	@Test
	public void Alert() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);

		System.out.println("Alert text: " + alert.getText());
		
		alert.accept();
		
		driver.quit();
	}

}
