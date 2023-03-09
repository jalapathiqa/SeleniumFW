package practise_Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGeckoBrowser {
	@Test(priority = 1)
	public void initGeckoBrowser() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
//		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://www.google.ca/");
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title in FireFox is: " + title);

		// validation
		if (title.equals("Google")) {
			System.out.println("PASS -- correct title-Firefox");
		} else {
			System.out.println("FAIL -- incorrect title-Firefox");

		}
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

	@Test(priority = 2)
	public void geckoSecongMethod() {
		System.out.println("secong method in testNG.xml for Firfox browser method");
	}

}
