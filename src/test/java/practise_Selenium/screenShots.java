package practise_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShots {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
//		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:/Users/kalag/OneDrive/Desktop/Workspace/Selenium_Java/ScreenShots/img1.jpg");
		try {
			FileUtils.copyFile(srcFile, destFile);
			System.out.println("Screenshot saved successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
