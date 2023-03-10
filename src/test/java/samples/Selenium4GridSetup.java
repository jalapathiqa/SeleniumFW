package samples;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4GridSetup {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions op = new ChromeOptions();
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444") ,op);
		
		driver.get("https://www.eenadu.net");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());

		
	}

}
