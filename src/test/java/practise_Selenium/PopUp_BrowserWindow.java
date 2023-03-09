package practise_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUp_BrowserWindow {
	WebDriver driver;

	@Test
	public void Alert() throws InterruptedException { 

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(2000);

		// type=file attribute should be there:
		driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\kalag\\OneDrive\\Desktop\\UploadFile.xlsx");
		Thread.sleep(2000);

		
		driver.quit();
	}

}
